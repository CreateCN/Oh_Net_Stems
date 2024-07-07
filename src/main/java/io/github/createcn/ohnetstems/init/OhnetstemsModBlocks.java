
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import io.github.createcn.ohnetstems.block.NetStemOreBlockBlock;
import io.github.createcn.ohnetstems.block.HuaJiSaplingBlock;
import io.github.createcn.ohnetstems.block.HuaJiLogBlock;
import io.github.createcn.ohnetstems.block.HuaJiLevelBlock;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OhnetstemsMod.MODID);
	public static final RegistryObject<Block> NET_STEM_ORE_BLOCK = REGISTRY.register("net_stem_ore_block", () -> new NetStemOreBlockBlock());
	public static final RegistryObject<Block> HUA_JI_LOG = REGISTRY.register("hua_ji_log", () -> new HuaJiLogBlock());
	public static final RegistryObject<Block> HUA_JI_LEVEL = REGISTRY.register("hua_ji_level", () -> new HuaJiLevelBlock());
	public static final RegistryObject<Block> HUA_JI_SAPLING = REGISTRY.register("hua_ji_sapling", () -> new HuaJiSaplingBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			HuaJiLevelBlock.blockColorLoad(event);
		}
	}
}
