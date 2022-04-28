package com.slomaxonical.croptopia.chocolaterie;

import com.slomaxonical.croptopia.chocolaterie.registry.BlockRegistry;
import com.slomaxonical.croptopia.chocolaterie.registry.ItemRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("cacao")
public class CroptopiaChocolaterie {

    public static final String MOD_ID = "cacao";
    public static ItemGroup CHOCOLATERIE_ITEM_GROUP;


    public CroptopiaChocolaterie(){
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockRegistry.BLOCKS.register(modBus);
        ItemRegistry.ITEMS.register(modBus);
//        modBus.addListener(this::gatherData);

        MinecraftForge.EVENT_BUS.register(this);
        CHOCOLATERIE_ITEM_GROUP = new ItemGroup("cacao") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ItemRegistry.CARAMEL_MILK_CHOCOLATE.get());
            }
        };
    }
//    public void gatherData(GatherDataEvent event){
//        BlockTagsProvider provider = new CacaoBlockTags(event.getGenerator(), event.getExistingFileHelper());
//        event.getGenerator().addProvider(provider);
//        event.getGenerator().addProvider(new CacaoRecipes(event.getGenerator()));
//        event.getGenerator().addProvider(new CacaoItemTags(event.getGenerator(),provider, event.getExistingFileHelper()));
//    }
}
