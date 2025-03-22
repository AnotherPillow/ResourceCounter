package com.anotherpillow.resourcecounter;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = ResourceCounter.MODID,
        useMetadata = true,
        clientSideOnly = true
)
public class ResourceCounter {

    public static final String MODID = "resourcecounter";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("ResourceCounter loaded");
    }

}
