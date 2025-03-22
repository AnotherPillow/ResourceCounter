package com.anotherpillow.resourcecounter;

import com.google.common.collect.Lists;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import java.io.File;
import java.util.HashMap;
import java.util.List;

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
