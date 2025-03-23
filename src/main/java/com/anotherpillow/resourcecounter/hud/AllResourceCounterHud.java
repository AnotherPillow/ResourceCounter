package com.anotherpillow.resourcecounter.hud;

import cc.polyfrost.oneconfig.hud.SingleTextHud;
import cc.polyfrost.oneconfig.hud.TextHud;
import com.anotherpillow.resourcecounter.ItemCounter;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class AllResourceCounterHud extends TextHud {
    public AllResourceCounterHud(boolean enabled) {
        super(enabled, 0, 0);
        System.out.println("all resource counter hud init, enabled: " + enabled);
    }

    @Override
    protected void getLines(List<String> lines, boolean example) {
        lines.add(EnumChatFormatting.DARK_GREEN + "hi");
        lines.add(EnumChatFormatting.DARK_GREEN + "hi");
        lines.add(EnumChatFormatting.DARK_GREEN + "hi");
        lines.add(EnumChatFormatting.DARK_GREEN + "hi");
        lines.add(EnumChatFormatting.DARK_GREEN + "hi");

        this.drawLine("asdf", 16, 16, 2);

//        System.out.println("getting lines for all resources, example: " + example + " line length: " + lines.size());
//        lines.add(EnumChatFormatting.DARK_GREEN + "Emeralds"
//                + EnumChatFormatting.GRAY + ": " + (example ? 1 : 33));
//        lines.add(EnumChatFormatting.AQUA + "Diamonds"
//                + EnumChatFormatting.GRAY + ": " + (example ? 1 : 33));
//        lines.add(EnumChatFormatting.GOLD + "Gold"
//                + EnumChatFormatting.GRAY + ": " + (example ? 1 : 33));
//        lines.add(EnumChatFormatting.WHITE + "Iron"
//                + EnumChatFormatting.GRAY + ": " + (example ? 1 : 333));
    }
}
