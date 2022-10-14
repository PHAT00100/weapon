package dev.phat.weapon;

import dev.phat.weapon.init.Iteminit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(weapon.MODID)
public class weapon {
    public static final String MODID = "weapon";

    public weapon(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Iteminit.Item.register(bus);
    }
}
