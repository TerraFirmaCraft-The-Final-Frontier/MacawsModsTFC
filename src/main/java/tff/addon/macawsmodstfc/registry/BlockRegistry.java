package tff.addon.macawsmodstfc.registry;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import net.dries007.tfc.api.registries.TFCRegistries;
import net.dries007.tfc.api.types.Tree;
import net.dries007.tfc.objects.CreativeTabsTFC;
import tff.addon.macawsmodstfc.MacawsModsTFC;
import tff.addon.macawsmodstfc.objects.block.*;
import tff.addon.macawsmodstfc.objects.te.*;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = MacawsModsTFC.MOD_ID)
@GameRegistry.ObjectHolder(MacawsModsTFC.MOD_ID)
public final class BlockRegistry
{
    private static ImmutableList<TFCFurnitureBlock> allTFCFurnitureBlocks;
    private static ImmutableList<TFCFurnitureCupboard> allTFCFurnitureCupboards;
    private static ImmutableList<TFCFurnitureDresser> allTFCFurnitureDressers;
    private static ImmutableList<TFCFurnitureTable> allTFCFurnitureTables;
    private static ImmutableList<TFCFurnitureWardrobe> allTFCFurnitureWardrobes;

    public static ImmutableList<TFCFurnitureBlock> getAllTFCFurnitureBlocks()
    {
        return allTFCFurnitureBlocks;
    }

    public static ImmutableList<TFCFurnitureCupboard> getAllTFCFurnitureCupboards()
    {
        return allTFCFurnitureCupboards;
    }

    public static ImmutableList<TFCFurnitureDresser> getAllTFCFurnitureDressers()
    {
        return allTFCFurnitureDressers;
    }

    public static ImmutableList<TFCFurnitureTable> getAllTFCFurnitureTables()
    {
        return allTFCFurnitureTables;
    }

    public static ImmutableList<TFCFurnitureWardrobe> getAllTFCFurnitureWardrobes()
    {
        return allTFCFurnitureWardrobes;
    }

    @SubscribeEvent
    @SuppressWarnings("ConstantConditions")
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        MacawsModsTFC.LOGGER.debug("Registering blocks...");

        IForgeRegistry<Block> blockRegistry = event.getRegistry();

        Builder<TFCFurnitureBlock> builderTFCFurnitureBlocks = ImmutableList.builder();
        Builder<TFCFurnitureCupboard> builderTFCFurnitureCupboards = ImmutableList.builder();
        Builder<TFCFurnitureDresser> builderTFCFurnitureDressers = ImmutableList.builder();
        Builder<TFCFurnitureTable> builderTFCFurnitureTables = ImmutableList.builder();
        Builder<TFCFurnitureWardrobe> builderTFCFurnitureWardrobes = ImmutableList.builder();

        for (Tree wood : TFCRegistries.TREES.getValuesCollection())
        {
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/box/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/box/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/box_2/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/box_2/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/nightstand/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/nightstand/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/nightstand_2/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/nightstand_2/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/nightstand_3/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/nightstand_3/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/nightstand_4/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/nightstand_4/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/nightstand_5/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/nightstand_5/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/nightstand_6/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/nightstand_6/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/nightstand_7/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/nightstand_7/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/nightstand_8/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/nightstand_8/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));

            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/pult/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/pult/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/pult_1/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/pult_1/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/pult_2/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/pult_2/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/pult_3/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/pult_3/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureBlocks.add(register(blockRegistry, "wood/pult_4/" + wood.getRegistryName().getPath(), new TFCFurnitureBlock(wood, "wood/pult_4/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));

            builderTFCFurnitureCupboards.add(register(blockRegistry, "wood/cupboard/" + wood.getRegistryName().getPath(), new TFCFurnitureCupboard(wood, "wood/cupboard/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureCupboards.add(register(blockRegistry, "wood/cupboard_2/" + wood.getRegistryName().getPath(), new TFCFurnitureCupboard(wood, "wood/cupboard_2/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureCupboards.add(register(blockRegistry, "wood/cupboard_3/" + wood.getRegistryName().getPath(), new TFCFurnitureCupboard(wood, "wood/cupboard_3/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureCupboards.add(register(blockRegistry, "wood/cupboard_4/" + wood.getRegistryName().getPath(), new TFCFurnitureCupboard(wood, "wood/cupboard_4/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureCupboards.add(register(blockRegistry, "wood/cupboard_5/" + wood.getRegistryName().getPath(), new TFCFurnitureCupboard(wood, "wood/cupboard_5/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureCupboards.add(register(blockRegistry, "wood/cupboard_6/" + wood.getRegistryName().getPath(), new TFCFurnitureCupboard(wood, "wood/cupboard_6/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureCupboards.add(register(blockRegistry, "wood/cupboard_7/" + wood.getRegistryName().getPath(), new TFCFurnitureCupboard(wood, "wood/cupboard_7/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureCupboards.add(register(blockRegistry, "wood/cupboard_8/" + wood.getRegistryName().getPath(), new TFCFurnitureCupboard(wood, "wood/cupboard_8/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureCupboards.add(register(blockRegistry, "wood/cupboard_9/" + wood.getRegistryName().getPath(), new TFCFurnitureCupboard(wood, "wood/cupboard_9/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));

            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/desk/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/desk/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/desk_2/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/desk_2/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/desk_5/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/desk_5/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/desk_6/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/desk_6/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_box/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_box/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_3/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_3/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_4/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_4/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_5/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_5/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_6/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_6/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_7/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_7/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_8/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_8/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_9/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_9/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_10/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_10/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_11/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_11/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_12/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_12/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_13/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_13/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_14/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_14/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_15/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_15/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_16/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_16/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_17/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_17/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureDressers.add(register(blockRegistry, "wood/dresser_18/" + wood.getRegistryName().getPath(), new TFCFurnitureDresser(wood, "wood/dresser_18/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));

            builderTFCFurnitureTables.add(register(blockRegistry, "wood/desk_3/" + wood.getRegistryName().getPath(), new TFCFurnitureTable(wood, "wood/desk_3/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureTables.add(register(blockRegistry, "wood/desk4/" + wood.getRegistryName().getPath(), new TFCFurnitureTable(wood, "wood/desk4/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureTables.add(register(blockRegistry, "wood/desk_7/" + wood.getRegistryName().getPath(), new TFCFurnitureTable(wood, "wood/desk_7/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureTables.add(register(blockRegistry, "wood/desk_8/" + wood.getRegistryName().getPath(), new TFCFurnitureTable(wood, "wood/desk_8/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureTables.add(register(blockRegistry, "wood/desk_9/" + wood.getRegistryName().getPath(), new TFCFurnitureTable(wood, "wood/desk_9/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureTables.add(register(blockRegistry, "wood/nightstand_9/" + wood.getRegistryName().getPath(), new TFCFurnitureTable(wood, "wood/nightstand_9/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureTables.add(register(blockRegistry, "wood/nightstand_10/" + wood.getRegistryName().getPath(), new TFCFurnitureTable(wood, "wood/nightstand_10/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureTables.add(register(blockRegistry, "wood/nightstand_11/" + wood.getRegistryName().getPath(), new TFCFurnitureTable(wood, "wood/nightstand_11/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));

            builderTFCFurnitureWardrobes.add(register(blockRegistry, "wood/furniture_1/" + wood.getRegistryName().getPath(), new TFCFurnitureWardrobe(wood, "wood/furniture_1/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureWardrobes.add(register(blockRegistry, "wood/furniture_2/" + wood.getRegistryName().getPath(), new TFCFurnitureWardrobe(wood, "wood/furniture_2/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureWardrobes.add(register(blockRegistry, "wood/furniture_3/" + wood.getRegistryName().getPath(), new TFCFurnitureWardrobe(wood, "wood/furniture_3/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureWardrobes.add(register(blockRegistry, "wood/furniture_4/" + wood.getRegistryName().getPath(), new TFCFurnitureWardrobe(wood, "wood/furniture_4/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureWardrobes.add(register(blockRegistry, "wood/furniture_5/" + wood.getRegistryName().getPath(), new TFCFurnitureWardrobe(wood, "wood/furniture_5/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureWardrobes.add(register(blockRegistry, "wood/furniture_6/" + wood.getRegistryName().getPath(), new TFCFurnitureWardrobe(wood, "wood/furniture_6/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureWardrobes.add(register(blockRegistry, "wood/furniture_7/" + wood.getRegistryName().getPath(), new TFCFurnitureWardrobe(wood, "wood/furniture_7/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureWardrobes.add(register(blockRegistry, "wood/furniture_8/" + wood.getRegistryName().getPath(), new TFCFurnitureWardrobe(wood, "wood/furniture_8/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
            builderTFCFurnitureWardrobes.add(register(blockRegistry, "wood/furniture_9/" + wood.getRegistryName().getPath(), new TFCFurnitureWardrobe(wood, "wood/furniture_9/" + wood.getRegistryName().getPath()), CreativeTabsTFC.CT_WOOD));
        }

        allTFCFurnitureBlocks = builderTFCFurnitureBlocks.build();
        allTFCFurnitureCupboards = builderTFCFurnitureCupboards.build();
        allTFCFurnitureDressers = builderTFCFurnitureDressers.build();
        allTFCFurnitureWardrobes = builderTFCFurnitureWardrobes.build();
        allTFCFurnitureTables = builderTFCFurnitureTables.build();

        register(TEFurniture.class, "furnitureBase");
        register(TEFurnitureBlock.class, "furnitureBlock");
        register(TEFurnitureCupboard.class, "furnitureCupboard");
        register(TEFurnitureDresser.class, "furnitureDresser");
        register(TEFurnitureWardrobe.class, "furnitureWardrobe");
    }

    private static <T extends Block> T register(IForgeRegistry<Block> r, String name, T block, CreativeTabs ct)
    {
        block.setCreativeTab(ct);
        return register(r, name, block);
    }

    private static <T extends Block> T register(IForgeRegistry<Block> r, String name, T block)
    {
        //block.setRegistryName(MacawsModsTFC.MOD_ID, name);
        block.setTranslationKey(MacawsModsTFC.MOD_ID + "." + name.replace('/', '.'));
        r.register(block);
        MacawsModsTFC.LOGGER.debug("Block registered: " + name);
        return block;
    }

    private static <T extends TileEntity> void register(Class<T> te, String name)
    {
        TileEntity.register(MacawsModsTFC.MOD_ID + ":" + name, te);
        MacawsModsTFC.LOGGER.debug("Tile Entity registered: " + name);
    }
}