package net.demonslayercosmetics;

import net.demonslayercosmetics.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DemonSlayerCosmetics.MODID, name = DemonSlayerCosmetics.NAME,
     version = DemonSlayerCosmetics.VERSION, acceptedMinecraftVersions = "[1.12,1.13)")
public class DemonSlayerCosmetics {

    public static final String MODID = "demonslayercosmetics";
    public static final String NAME = "Demon Slayer Cosmetics";
    public static final String VERSION = "1.0.0";

    @SidedProxy(
        clientSide = "net.demonslayercosmetics.proxy.ClientProxy",
        serverSide = "net.demonslayercosmetics.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.Instance
    public static DemonSlayerCosmetics instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
