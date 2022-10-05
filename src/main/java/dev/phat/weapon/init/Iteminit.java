package dev.phat.weapon.init;

import dev.phat.weapon.items.*;
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
		() -> new katana(Tiers.IRON01,6,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Scythe = Item.register("scythe",
		() -> new scythe(Tiers.IRON01,9,-3f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Rapier = Item.register("rapier",
		() -> new rapier(Tiers.IRON01,7,0f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Blackkatana = Item.register("black_katana",
		() -> new black_katana(Tiers.IRON01,6,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Tonfa = Item.register("tonfa",
		() -> new tonfa(Tiers.IRON01,7,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Spear = Item.register("spear",
		() -> new spear(Tiers.IRON01,7,-2.5f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> GreatAxe = Item.register("greataxe",
		() -> new greataxe(Tiers.IRON01,14,-3.25f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Guandao = Item.register("guandao",
		() -> new guandao(Tiers.IRON01,7,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> GreatSword = Item.register("greatsword",
		() -> new greatsword(Tiers.IRON01,19,-3.25f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> GreatHammer = Item.register("greathammer",
		() -> new greathammer(Tiers.IRON01,24,-3.5f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

public static class Tiers {
		public static final Tier IRON01  = new ForgeTier(
				2,
				1000,
				0f,
				0,
				100,
				null,
				() -> Ingredient.of(Items.IRON_INGOT));
	}
}



