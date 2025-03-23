package com.anotherpillow.resourcecounter.hud;

import cc.polyfrost.oneconfig.hud.SingleTextHud;
import com.anotherpillow.resourcecounter.ItemCounter;
import net.minecraft.util.EnumChatFormatting;

public class GoldCounterHud extends SingleTextHud {
    public GoldCounterHud() {
        super("", true);
    }

    @Override
    protected String getText(boolean example) {
//        System.out.println("getting text for gold " + ItemCounter.gold);
        return EnumChatFormatting.GOLD + "Gold"
                + EnumChatFormatting.GRAY + ": " + (example ? 1 : 3333);
    }
}
