package com.anotherpillow.resourcecounter;

import com.anotherpillow.resourcecounter.config.ResourceCounterConfig;
import com.anotherpillow.resourcecounter.hud.AllResourceCounterHud;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

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
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END || event.player == null) return;
        ItemCounter.onTick(event.player);
    }
}
