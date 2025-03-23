package com.anotherpillow.resourcecounter.hud;

import cc.polyfrost.oneconfig.hud.SingleTextHud;
import cc.polyfrost.oneconfig.hud.TextHud;
import com.anotherpillow.resourcecounter.ItemCounter;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class AllResourceCounterHud extends TextHud {
    public AllResourceCounterHud(boolean enabled) {
        super(enabled);
    }

    @Override
    protected void getLines(List<String> lines, boolean example) {
        lines.add(EnumChatFormatting.DARK_GREEN + "Emeralds"
                + EnumChatFormatting.GRAY + ": " + (example ? 1 : 33));
        lines.add(EnumChatFormatting.AQUA + "Diamonds"
                + EnumChatFormatting.GRAY + ": " + (example ? 1 : 33));
        lines.add(EnumChatFormatting.GOLD + "Gold"
                + EnumChatFormatting.GRAY + ": " + (example ? 1 : 33));
        lines.add(EnumChatFormatting.WHITE + "Iron"
                + EnumChatFormatting.GRAY + ": " + (example ? 1 : 333));
    }
}
