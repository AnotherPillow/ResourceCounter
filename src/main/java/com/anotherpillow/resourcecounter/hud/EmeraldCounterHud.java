package com.anotherpillow.resourcecounter.hud;

import cc.polyfrost.oneconfig.hud.SingleTextHud;
import com.anotherpillow.resourcecounter.ItemCounter;
import net.minecraft.util.EnumChatFormatting;

public class EmeraldCounterHud extends SingleTextHud {
    public EmeraldCounterHud() {
        super("", true);
    }

    @Override
    protected String getText(boolean example) {
        return EnumChatFormatting.DARK_GREEN + "Emeralds"
             + EnumChatFormatting.GRAY + ": " + (example ? 1 : ItemCounter.emeralds);
    }
}
