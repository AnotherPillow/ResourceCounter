package com.anotherpillow.resourcecounter.hud;

import cc.polyfrost.oneconfig.hud.SingleTextHud;
import com.anotherpillow.resourcecounter.ItemCounter;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.Minecraft;


public class DiamondCounterHud extends SingleTextHud {
    public DiamondCounterHud() {
        super("", true);
    }

    @Override
    protected String getText(boolean example) {
        return EnumChatFormatting.AQUA + "Diamonds"
                + EnumChatFormatting.GRAY + ": " + (example ? 1 : ItemCounter.getDiamonds());
    }
}
