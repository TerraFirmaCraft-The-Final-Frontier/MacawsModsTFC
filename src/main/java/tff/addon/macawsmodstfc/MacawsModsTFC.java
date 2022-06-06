package tff.addon.macawsmodstfc;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.client.resource.VanillaResourceType;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;

import tff.addon.macawsmodstfc.client.gui.GUIHandler;
import tff.addon.macawsmodstfc.registry.DataGenerator;

@Mod(modid = MacawsModsTFC.MOD_ID, name = MacawsModsTFC.NAME, version = MacawsModsTFC.VERSION, dependencies = MacawsModsTFC.DEPENDENCIES)
public class MacawsModsTFC
{
    public static final String MOD_ID = "macawsmodstfc";
    public static final String NAME = "Macaw's Mods for TFC";
    public static final String VERSION = "1.0.0";
    public static final String DEPENDENCIES = "required-after:tfc;after:resourceloader;required-after:mcwfurnitures";
    public static final Logger LOGGER = LogManager.getLogger("MacawsModsTFC");

    @Mod.Instance
    public static MacawsModsTFC instance;

    @EventHandler
    public void init(FMLInitializationEvent event) throws IOException
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GUIHandler());

        if (MacawsModsTFCConfig.GENERAL.dataGenerator)
        {
            if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
            {
                LOGGER.info("Initializing data generator...");
                DataGenerator.init();

                if (DataGenerator.genBlockStates() || DataGenerator.genModels())
                {
                    LOGGER.info("Generated new blockstates or models, refreshing...");
                    FMLClientHandler.instance().refreshResources(VanillaResourceType.MODELS);
                }
                if (DataGenerator.genLangFile())
                {
                    LOGGER.info("Generated new language file, refreshing...");
                    FMLClientHandler.instance().refreshResources(VanillaResourceType.LANGUAGES);
                }
            }
        }
    }
}