/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unholyshape.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.unholyshape.block.UnholyCopperBlockBlock;
import net.mcreator.unholyshape.UnholyShapeMod;

import java.util.function.Function;

public class UnholyShapeModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(UnholyShapeMod.MODID);
	public static final DeferredBlock<Block> UNHOLY_COPPER_BLOCK;
	static {
		UNHOLY_COPPER_BLOCK = register("unholy_copper_block", UnholyCopperBlockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}