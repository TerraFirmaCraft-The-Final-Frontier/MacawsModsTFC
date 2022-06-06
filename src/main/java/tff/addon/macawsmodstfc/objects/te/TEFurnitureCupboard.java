package tff.addon.macawsmodstfc.objects.te;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import tff.addon.macawsmodstfc.MacawsModsTFCConfig;
import tff.addon.macawsmodstfc.objects.container.ContainerFurniture;

public class TEFurnitureCupboard extends TEFurniture
{
    public TEFurnitureCupboard()
    {
        super("cupboard", MacawsModsTFCConfig.FURNITURE.sizeCupboard);
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
    {
        this.fillWithLoot(playerIn);
        return new ContainerFurniture(playerInventory, this, playerIn);
    }
}