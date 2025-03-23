package com.anotherpillow.resourcecounter;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ItemCounter {

    private static int getItem(String name) {
        int count = 0;

        Minecraft mc = Minecraft.getMinecraft();
        if(mc == null) {
            System.out.println("mc is null for " + name);
            return 0;
        }

        EntityPlayerSP player = mc.thePlayer;
        if(player == null) {
            System.out.println("player is null for " + name);
            return 0;
        }

        for(ItemStack stack : player.inventory.mainInventory){
            if(stack == null) {
                System.out.println("stack is null");
                continue;
            }

            if(stack.getUnlocalizedName().equals(name))
                count += stack.stackSize;

        }
        System.out.println("returning " + count + ", for: " + name);
        return count;
    }

    public static int getEmeralds() {
        return getItem(Items.emerald.getUnlocalizedName());
    }

    public static int getDiamonds() {
        return getItem(Items.diamond.getUnlocalizedName());
    }

    public static int getGold() {
        return 6;
    }

    public static int getIron() {
        return 6;
    }
}
