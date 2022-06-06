package tff.addon.macawsmodstfc.objects.te;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import tff.addon.macawsmodstfc.MacawsModsTFCConfig;
import tff.addon.macawsmodstfc.objects.container.ContainerFurniture;

public class TEFurnitureWardrobe extends TEFurniture
{
    public TEFurnitureWardrobe()
    {
        super("wardrobe", MacawsModsTFCConfig.FURNITURE.sizeWardrobe);
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
    {
        this.fillWithLoot(playerIn);
        return new ContainerFurniture(playerInventory, this, playerIn);
    }
}