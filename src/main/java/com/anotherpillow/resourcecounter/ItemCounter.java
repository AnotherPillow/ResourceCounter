package com.anotherpillow.resourcecounter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ItemCounter {
    public static int emeralds = 0;
    public static int diamonds = 0;
    public static int gold = 0;
    public static int iron = 0;

    public static void onTick(EntityPlayer player) {
        ItemStack[] currentInventory = player.inventory.mainInventory;
        int t_emeralds = 0;
        int t_diamonds = 0;
        int t_gold = 0;
        int t_iron = 0;

        for (int i = 0; i < currentInventory.length; i++) {
            ItemStack stack = currentInventory[i];
            if (stack == null) continue;
            Item item = stack.getItem();
            if (item == null) continue;
            ResourceLocation location = Item.itemRegistry.getNameForObject(item);

            switch (location.toString()) {
                case "minecraft:emerald":
                    System.out.println(location.toString() + ": " + stack.stackSize);
                    t_emeralds += stack.stackSize;

                    break;
                case "minecraft:diamond":
                    System.out.println(location.toString() + ": " + stack.stackSize);
                    t_diamonds += stack.stackSize;

                    break;
                case "minecraft:gold_ingot":
                    System.out.println(location.toString() + ": " + stack.stackSize);
                    t_gold += stack.stackSize;

                    break;
                case "minecraft:iron_ingot":
                    System.out.println(location.toString() + ": " + stack.stackSize);
                    t_iron += stack.stackSize;

                    break;
                default:
                    continue;
            }
            emeralds = t_emeralds;
            diamonds = t_diamonds;
            gold = t_gold;
            iron = t_iron;
        }

//        System.out.println("tick finished, gold: " + gold);
//        System.out.println("tick finished, diamond: " + diamonds);
//        System.out.println("tick finished, emeralds: " + emeralds);
//        System.out.println("tick finished, iron: " + iron);
    }
}
