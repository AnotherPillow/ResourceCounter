package com.anotherpillow.resourcecounter;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = ResourceCounter.MODID,
        useMetadata = true,
        clientSideOnly = true
)
public class ResourceCounter {
    public static ResourceCounterConfig config;
    public static final String MODID = "resourcecounter";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        config = new ResourceCounterConfig();
        System.out.println("ResourceCounter loaded");
    }

}
