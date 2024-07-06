
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import io.github.createcn.ohnetstems.block.NetStemWorkbenchBlock;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OhnetstemsMod.MODID);
	public static final RegistryObject<Block> NET_STEM_WORKBENCH_BLOCK = REGISTRY.register("net_stem_workbench_block", () -> new NetStemWorkbenchBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
