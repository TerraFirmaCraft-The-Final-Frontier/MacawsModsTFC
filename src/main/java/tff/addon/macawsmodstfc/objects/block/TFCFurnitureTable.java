package tff.addon.macawsmodstfc.objects.block;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;

import com.mcwfurnitures.kikoz.objects.blocks.FurnitureBlock;
import net.dries007.tfc.api.capability.size.IItemSize;
import net.dries007.tfc.api.capability.size.Size;
import net.dries007.tfc.api.capability.size.Weight;
import net.dries007.tfc.api.types.Tree;

public class TFCFurnitureTable extends FurnitureBlock implements IItemSize
{
    public Tree wood;

    public TFCFurnitureTable(Tree wood, String name)
    {
        super(name);
        this.wood = wood;
    }

    @Nonnull
    @Override
    public Size getSize(@Nonnull ItemStack itemStack)
    {
        return Size.VERY_LARGE;
    }

    @Nonnull
    @Override
    public Weight getWeight(@Nonnull ItemStack itemStack)
    {
        return Weight.HEAVY;
    }
}