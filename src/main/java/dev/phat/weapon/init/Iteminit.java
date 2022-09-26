package dev.phat.weapon.init;

import dev.phat.weapon.items.*;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import dev.phat.weapon.weapon;

public class Iteminit {
	public static final DeferredRegister<Item> Item = DeferredRegister.create(ForgeRegistries.ITEMS,weapon.MODID);
public static final RegistryObject<Item> Katana = Item.register("katana",
		() -> new katana(Tiers.IRON,4,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Scythe = Item.register("scythe",
		() -> new scythe(Tiers.IRON,7,-3f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Rapier = Item.register("rapier",
		() -> new rapier(Tiers.IRON,2,0f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Blackkatana = Item.register("black_katana",
		() -> new black_katana(Tiers.IRON,4,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Tonfa = Item.register("tonfa",
		() -> new tonfa(Tiers.IRON,5,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Spear = Item.register("spear",
		() -> new spear(Tiers.IRON,5,-2.5f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> GreatAxe = Item.register("greataxe",
		() -> new greataxe(Tiers.IRON,12,-3.25f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Guandao = Item.register("guandao",
		() -> new guandao(Tiers.IRON,5,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> GreatSword = Item.register("greatsword",
		() -> new greatsword(Tiers.IRON,17,-3.25f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> GreatHammer = Item.register("greathammer",
		() -> new greathammer(Tiers.IRON,22,-3.5f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}

