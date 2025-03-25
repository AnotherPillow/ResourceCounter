package com.anotherpillow.resourcecounter.hud;

import cc.polyfrost.oneconfig.gui.OneConfigGui;
import cc.polyfrost.oneconfig.hud.SingleTextHud;
import cc.polyfrost.oneconfig.hud.TextHud;
import cc.polyfrost.oneconfig.platform.Platform;
import com.anotherpillow.resourcecounter.ItemCounter;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

import static com.anotherpillow.resourcecounter.config.ResourceCounterConfig.allResourcesEnabled;

public class AllResourceCounterHud extends TextHud {
    public AllResourceCounterHud() {
        super(true);
    }

    @Override
    protected boolean shouldShow() {
        return allResourcesEnabled;

        // base method:
//        if (!showInGuis && Platform.getGuiPlatform().getCurrentScreen() != null && !(Platform.getGuiPlatform().getCurrentScreen() instanceof OneConfigGui))
//            return false;
//        if (!showInChat && Platform.getGuiPlatform().isInChat()) return false;
//        return showInDebug || !Platform.getGuiPlatform().isInDebug();
    }


    @Override
    protected void getLines(List<String> lines, boolean example) {
        lines.add(EnumChatFormatting.DARK_GREEN + "hi");
        lines.add(EnumChatFormatting.DARK_GREEN + "hi");
        lines.add(EnumChatFormatting.DARK_GREEN + "hi");
        lines.add(EnumChatFormatting.DARK_GREEN + "hi");
        lines.add(EnumChatFormatting.DARK_GREEN + "hi");

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
