package com.slomaxonical.croptopia.chocolaterie.registry;

import com.slomaxonical.croptopia.chocolaterie.CroptopiaChocolaterie;
import com.slomaxonical.croptopia.chocolaterie.blocks.ChocolateCakeBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.ToIntFunction;


public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CroptopiaChocolaterie.MOD_ID);

    public static final RegistryObject<Block> CHOCOLATE_CAKE = BLOCKS.register("chocolate_cake",()-> new ChocolateCakeBlock(AbstractBlock.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
}
