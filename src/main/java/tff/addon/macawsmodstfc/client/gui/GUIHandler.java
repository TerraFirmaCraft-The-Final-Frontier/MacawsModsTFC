package tff.addon.macawsmodstfc.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import tff.addon.macawsmodstfc.objects.te.TEFurnitureBlock;
import tff.addon.macawsmodstfc.objects.te.TEFurnitureCupboard;
import tff.addon.macawsmodstfc.objects.te.TEFurnitureDresser;
import tff.addon.macawsmodstfc.objects.te.TEFurnitureWardrobe;

public class GUIHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity te = world.getTileEntity(new BlockPos(x, y, z));

        if (te instanceof TEFurnitureBlock)
        {
            return ((TEFurnitureBlock) te).createContainer(player.inventory, player);
        }
        else if (te instanceof TEFurnitureCupboard)
        {
            return ((TEFurnitureCupboard) te).createContainer(player.inventory, player);
        }
        else if (te instanceof TEFurnitureDresser)
        {
            return ((TEFurnitureDresser) te).createContainer(player.inventory, player);
        }
        else if (te instanceof TEFurnitureWardrobe)
        {
            return ((TEFurnitureWardrobe) te).createContainer(player.inventory, player);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity te = world.getTileEntity(new BlockPos(x, y, z));

        if (te instanceof TEFurnitureBlock)
        {
            return new GUIContainerFurniture(player.inventory, (TEFurnitureBlock) te);
        }
        else if (te instanceof TEFurnitureCupboard)
        {
            return new GUIContainerFurniture(player.inventory, (TEFurnitureCupboard) te);
        }
        else if (te instanceof TEFurnitureDresser)
        {
            return new GUIContainerFurniture(player.inventory, (TEFurnitureDresser) te);
        }
        else if (te instanceof TEFurnitureWardrobe)
        {
            return new GUIContainerFurniture(player.inventory, (TEFurnitureWardrobe) te);
        }

        return null;
    }
}