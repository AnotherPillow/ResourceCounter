package com.anotherpillow.resourcecounter.hud;

import cc.polyfrost.oneconfig.hud.SingleTextHud;
import com.anotherpillow.resourcecounter.ItemCounter;
import net.minecraft.util.EnumChatFormatting;

public class IronCounterHud extends SingleTextHud {
    public IronCounterHud() {
        super("", true);
    }

    @Override
    protected String getText(boolean example) {
        return EnumChatFormatting.WHITE + "Iron"
                + EnumChatFormatting.GRAY + ": " + (example ? 1 : ItemCounter.iron);
    }
}
