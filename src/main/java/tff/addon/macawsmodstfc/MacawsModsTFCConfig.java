package tff.addon.macawsmodstfc;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = MacawsModsTFC.MOD_ID, name = "MacawsModsTFC")
@Mod.EventBusSubscriber(modid = MacawsModsTFC.MOD_ID)
public class MacawsModsTFCConfig
{
    @Config.Comment("General Settings")
    public static final GeneralCFG GENERAL = new GeneralCFG();

    @Config.Comment("Furniture Settings")
    public static final FurnitureCFG FURNITURE = new FurnitureCFG();

    @SubscribeEvent
    public static void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equals(MacawsModsTFC.MOD_ID))
        {
            ConfigManager.sync(MacawsModsTFC.MOD_ID, Config.Type.INSTANCE);
        }
    }

    public static class GeneralCFG
    {
        @Config.RequiresMcRestart
        @Config.Name("Data Generator")
        @Config.Comment({"Data generator to generate assets for TFC add-on wood types", "Requires Resource Loader"})
        public boolean dataGenerator = true;
    }

    public static class FurnitureCFG
    {
        @Config.RequiresMcRestart
        @Config.Name("Basic Furniture Inventory Size")
        @Config.Comment("The amount of slots for basic furniture")
        public int sizeFurniture = 9;

        @Config.RequiresMcRestart
        @Config.Name("Cupboard Inventory Size")
        @Config.Comment("The amount of slots for cupboards")
        public int sizeCupboard = 18;

        @Config.RequiresMcRestart
        @Config.Name("Desk/Dresser Inventory Size")
        @Config.Comment("The amount of slots for desks and dressers")
        public int sizeDresser = 27;

        @Config.RequiresMcRestart
        @Config.Name("Wardrobe Inventory Size")
        @Config.Comment("The amount of slots for wardrobes")
        public int sizeWardrobe = 27;
    }
}