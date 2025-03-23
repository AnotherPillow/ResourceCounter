package com.anotherpillow.resourcecounter;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ItemCounter {

    private static int getItem(String name) {
        int count = 0;

        Minecraft mc = Minecraft.getMinecraft();
        if(mc == null) {
//            System.out.println("mc is null for " + name);
            return 0;
        }

        EntityPlayerSP player = mc.thePlayer;
        if(player == null) {
//            System.out.println("player is null for " + name);
            return 0;
        }

//        System.out.println("inventoyr items: " + Arrays.stream(player.inventory.mainInventory)
//                .filter(Objects::nonNull) // Filter out null items
//                .map(ItemStack::getUnlocalizedName)
//                .collect(Collectors.joining(", ")));

        for(ItemStack stack : player.inventory.mainInventory){
            if(stack == null) {
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
        return getItem(Items.gold_ingot.getUnlocalizedName());
    }

    public static int getIron() {
        return getItem(Items.iron_ingot.getUnlocalizedName());
    }
}
