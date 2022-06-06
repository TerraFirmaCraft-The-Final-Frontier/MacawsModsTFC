package tff.addon.macawsmodstfc.objects.te;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import tff.addon.macawsmodstfc.MacawsModsTFCConfig;
import tff.addon.macawsmodstfc.objects.container.ContainerFurniture;

public class TEFurnitureDresser extends TEFurniture
{
    public TEFurnitureDresser()
    {
        super("dresser", MacawsModsTFCConfig.FURNITURE.sizeDresser);
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
    {
        this.fillWithLoot(playerIn);
        return new ContainerFurniture(playerInventory, this, playerIn);
    }
}