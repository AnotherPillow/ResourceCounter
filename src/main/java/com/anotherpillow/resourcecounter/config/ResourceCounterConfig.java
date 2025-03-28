package com.anotherpillow.resourcecounter.config;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.HUD;
import cc.polyfrost.oneconfig.config.annotations.SubConfig;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import cc.polyfrost.oneconfig.config.data.OptionSize;
import com.anotherpillow.resourcecounter.hud.*;

public class ResourceCounterConfig extends Config {
    public ResourceCounterConfig() {
        super(new Mod("ResourceCounter", ModType.HUD), "resourcecounter/main.config.json");
        initialize();
    }

    @HUD( name = "All Resource Counter HUD", category = "HUD" )
    public AllResourceCounterHud allResourceHud = new AllResourceCounterHud();
    @HUD( name = "Emerald Counter HUD", category = "HUD" )
    public EmeraldCounterHud emeraldHud = new EmeraldCounterHud();
    @HUD( name = "Diamond Counter HUD", category = "HUD" )
    public DiamondCounterHud diamondHud = new DiamondCounterHud();
    @HUD( name = "Gold Counter HUD", category = "HUD" )
    public GoldCounterHud goldHud = new GoldCounterHud();
    @HUD( name = "Iron Counter HUD", category = "HUD" )
    public IronCounterHud ironHud = new IronCounterHud();

    @Switch(
            name = "Enable all resource counter",
            size = OptionSize.DUAL,
            category = "General",
            subcategory = "Switches"
    )
    public static boolean allResourcesEnabled = true;
    @Switch(
            name = "Compact all resource counter",
            size = OptionSize.DUAL,
            category = "General",
            subcategory = "Switches"
    )
    public static boolean compactAllResourcesEnabled = false;
}
