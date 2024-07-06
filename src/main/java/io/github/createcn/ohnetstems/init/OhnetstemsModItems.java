
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import io.github.createcn.ohnetstems.item.NetStemOreItem;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OhnetstemsMod.MODID);
	public static final RegistryObject<Item> NET_STEM_WORKBENCH_BLOCK = block(OhnetstemsModBlocks.NET_STEM_WORKBENCH_BLOCK);
	public static final RegistryObject<Item> NET_STEM_GEM = REGISTRY.register("net_stem_gem", () -> new NetStemOreItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
