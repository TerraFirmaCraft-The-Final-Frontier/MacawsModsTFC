package tff.addon.macawsmodstfc.objects.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;

import net.dries007.tfc.objects.container.ContainerChestTFC;

public class ContainerFurniture extends ContainerChestTFC
{
    public ContainerFurniture(IInventory playerInventory, IInventory furnitureInventory, EntityPlayer player)
    {
        super(playerInventory, furnitureInventory, player);
    }
}