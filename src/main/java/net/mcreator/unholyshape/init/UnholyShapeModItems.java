/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unholyshape.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.unholyshape.UnholyShapeMod;

import java.util.function.Function;

public class UnholyShapeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(UnholyShapeMod.MODID);
	public static final DeferredItem<Item> UNHOLY_COPPER_BLOCK;
	static {
		UNHOLY_COPPER_BLOCK = block(UnholyShapeModBlocks.UNHOLY_COPPER_BLOCK);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}
}