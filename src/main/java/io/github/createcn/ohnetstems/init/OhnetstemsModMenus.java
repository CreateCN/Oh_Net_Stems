
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import io.github.createcn.ohnetstems.world.inventory.NetStemWorkbenchGUIMenu;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, OhnetstemsMod.MODID);
	public static final RegistryObject<MenuType<NetStemWorkbenchGUIMenu>> NET_STEM_WORKBENCH_GUI = REGISTRY.register("net_stem_workbench_gui", () -> IForgeMenuType.create(NetStemWorkbenchGUIMenu::new));
}
