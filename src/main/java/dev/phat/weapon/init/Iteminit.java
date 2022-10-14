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
		() -> new katana(Tiers.IRON01,7,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Scythe = Item.register("scythe",
		() -> new scythe(Tiers.IRON01,10,-3f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Rapier = Item.register("rapier",
		() -> new rapier(Tiers.IRON01,5,0f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Blackkatana = Item.register("black_katana",
		() -> new black_katana(Tiers.IRON01,7,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Tonfa = Item.register("tonfa",
		() -> new tonfa(Tiers.IRON01,8,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Spear = Item.register("spear",
		() -> new spear(Tiers.IRON01,8,-2.5f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> GreatAxe = Item.register("greataxe",
		() -> new greataxe(Tiers.IRON01,15,-3.25f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Guandao = Item.register("guandao",
		() -> new guandao(Tiers.IRON01,8,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> GreatSword = Item.register("greatsword",
		() -> new greatsword(Tiers.IRON01,20,-3.25f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> GreatHammer = Item.register("greathammer",
		() -> new greathammer(Tiers.IRON01,25,-3.5f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> GiantHammer = Item.register("giant_hammer",
		() -> new giant_hammer(Tiers.IRON01,30,-3.5f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
public static final RegistryObject<Item> Staff = Item.register("staff",
		() -> new staff(Tiers.IRON01,7,-2f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

public static class Tiers {
		public static final Tier IRON01  = new ForgeTier(
				2,
				3000,
				0f,
				-1,
				100,
				null,
				() -> Ingredient.of(Items.IRON_INGOT));
	}
}



