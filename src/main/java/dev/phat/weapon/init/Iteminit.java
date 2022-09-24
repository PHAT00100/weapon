package dev.phat.weapon.init;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import dev.phat.weapon.weapon;

public class Iteminit {
	public static final DeferredRegister<Item> Item = DeferredRegister.create(ForgeRegistries.ITEMS,weapon.MODID);
public static final RegistryObject<Item> Katana = Item.register("katana",
		() -> new SwordItem(Tiers.IRON,4,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Scythe = Item.register("scythe",
		() -> new SwordItem(Tiers.IRON,7,-3f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Rapier = Item.register("rapier",
		() -> new SwordItem(Tiers.IRON,2,0f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Blackkatana = Item.register("black_katana",
		() -> new SwordItem(Tiers.IRON,4,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> tonfa = Item.register("tonfa",
		() -> new SwordItem(Tiers.IRON,5,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Spear = Item.register("spear",
		() -> new SwordItem(Tiers.IRON,5,-2.5f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> greataxe = Item.register("greataxe",
		() -> new SwordItem(Tiers.IRON,12,-3.25f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> guandao = Item.register("guandao",
		() -> new SwordItem(Tiers.IRON,5,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}

