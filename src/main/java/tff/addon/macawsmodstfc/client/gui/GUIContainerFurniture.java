package tff.addon.macawsmodstfc.client.gui;

import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public class GUIContainerFurniture extends GuiChest
{
    public GUIContainerFurniture(InventoryPlayer playerInv, IInventory furnitureInv)
    {
        super(playerInv, furnitureInv);
    }
}