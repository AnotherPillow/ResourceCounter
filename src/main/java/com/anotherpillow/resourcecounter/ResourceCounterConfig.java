package com.anotherpillow.resourcecounter;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import cc.polyfrost.oneconfig.config.data.OptionSize;

public class ResourceCounterConfig extends Config {
    public ResourceCounterConfig() {
        super(new Mod("ResourceCounter", ModType.HUD), "config.json");
        initialize();
    }

    @Switch(
            name = "A random switch",
            size = OptionSize.DUAL, // optional, declares whether the element is single column or dual column
            category = "General", // optional
            subcategory = "Switches" // optional
    )
    public static boolean bob = false; // this is the default value.
}
