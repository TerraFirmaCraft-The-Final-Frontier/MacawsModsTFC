package tff.addon.macawsmodstfc.registry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.stream.JsonWriter;
import org.apache.commons.lang3.text.WordUtils;
import net.minecraft.launchwrapper.Launch;

import com.mcwfurnitures.kikoz.util.Reference;
import net.dries007.tfc.TerraFirmaCraft;
import net.dries007.tfc.api.registries.TFCRegistries;
import net.dries007.tfc.api.types.Tree;
import tff.addon.macawsmodstfc.MacawsModsTFC;

public class DataGenerator
{
    public static File rootFolder = Launch.minecraftHome == null ? new File(".") : Launch.minecraftHome;
    public static ArrayList<String> objects = new ArrayList<>();

    public static void init() throws IOException
    {
        objects.add("Box");
        objects.add("Box 2");
        objects.add("Cupboard");
        objects.add("Cupboard 2");
        objects.add("Cupboard 3");
        objects.add("Cupboard 4");
        objects.add("Cupboard 5");
        objects.add("Cupboard 6");
        objects.add("Cupboard 7");
        objects.add("Cupboard 8");
        objects.add("Cupboard 9");
        objects.add("Desk");
        objects.add("Desk 2");
        objects.add("Desk 3");
        objects.add("Desk4");
        objects.add("Desk 5");
        objects.add("Desk 6");
        objects.add("Desk 7");
        objects.add("Desk 8");
        objects.add("Desk 9");
        objects.add("Dresser");
        objects.add("Dresser Box");
        objects.add("Dresser 3");
        objects.add("Dresser 4");
        objects.add("Dresser 5");
        objects.add("Dresser 6");
        objects.add("Dresser 7");
        objects.add("Dresser 8");
        objects.add("Dresser 9");
        objects.add("Dresser 10");
        objects.add("Dresser 11");
        objects.add("Dresser 12");
        objects.add("Dresser 13");
        objects.add("Dresser 14");
        objects.add("Dresser 15");
        objects.add("Dresser 16");
        objects.add("Dresser 17");
        objects.add("Dresser 18");
        objects.add("Furniture 1");
        objects.add("Furniture 2");
        objects.add("Furniture 3");
        objects.add("Furniture 4");
        objects.add("Furniture 5");
        objects.add("Furniture 6");
        objects.add("Furniture 7");
        objects.add("Furniture 8");
        objects.add("Furniture 9");
        objects.add("Nightstand");
        objects.add("Nightstand 2");
        objects.add("Nightstand 3");
        objects.add("Nightstand 4");
        objects.add("Nightstand 5");
        objects.add("Nightstand 6");
        objects.add("Nightstand 7");
        objects.add("Nightstand 8");
        objects.add("Nightstand 9");
        objects.add("Nightstand 10");
        objects.add("Nightstand 11");
        objects.add("Pult");
        objects.add("Pult 1");
        objects.add("Pult 2");
        objects.add("Pult 3");
        objects.add("Pult 4");

        genModels();
        genBlockStates();
        genLangFile();
    }

    public static boolean genModels() throws IOException
    {
        for (String object : objects)
        {
            File foldersBlockWood = new File(rootFolder + "/resources/" + MacawsModsTFC.MOD_ID + "/models/block/wood/" + object.replace(" ", "_").toLowerCase() + "/");
            File foldersItemWood = new File(rootFolder + "/resources/" + MacawsModsTFC.MOD_ID + "/models/item/wood/" + object.replace(" ", "_").toLowerCase() + "/");

            if (foldersBlockWood.exists()) return false;
            else foldersBlockWood.mkdirs();
            if (foldersItemWood.exists()) return false;
            else foldersItemWood.mkdirs();

            for (Tree wood : TFCRegistries.TREES.getValuesCollection())
            {
                String parentBasic = Reference.MOD_ID + ":block/parent/" + object.replace(" ", "_").toLowerCase();
                String parentCombined = Reference.MOD_ID + ":block/parent/combined/" + object.replace(" ", "_").toLowerCase();

                String bookshelf = "minecraft:blocks/bookshelf";
                String dirt = "minecraft:blocks/dirt";
                String flower_pot = "minecraft:blocks/flower_pot";
                String glass = "minecraft:blocks/glass";
                String log = TerraFirmaCraft.MOD_ID + ":blocks/wood/log/" + wood;
                String sapling_oak = "minecraft:blocks/sapling_oak";
                String sheets = TerraFirmaCraft.MOD_ID + ":blocks/wood/sheets/" + wood;
                String wrought_iron = TerraFirmaCraft.MOD_ID + ":blocks/metal/wrought_iron";

                File jsonItem = new File(rootFolder + "/resources/" + MacawsModsTFC.MOD_ID + "/models/item/wood/" + object.replace(" ", "_").toLowerCase() + "/" + wood + ".json");
                JsonWriter jsonWriterItem = new JsonWriter(new FileWriter(jsonItem));
                jsonWriterItem.setIndent("    ");
                jsonWriterItem.setLenient(false);
                jsonWriterItem.beginObject();
                jsonWriterItem.name("parent").value(MacawsModsTFC.MOD_ID + ":block/wood/" + object.replace(" ", "_").toLowerCase() + "/" + wood);
                jsonWriterItem.endObject();
                jsonWriterItem.close();

                File jsonBlock = new File(rootFolder + "/resources/" + MacawsModsTFC.MOD_ID + "/models/block/wood/" + object.replace(" ", "_").toLowerCase() + "/" + wood + ".json");
                JsonWriter jsonWriterBlock = new JsonWriter(new FileWriter(jsonBlock));
                jsonWriterBlock.setIndent("    ");
                jsonWriterBlock.setLenient(false);
                jsonWriterBlock.beginObject();

                switch (object)
                {
                    case "Box":
                    case "Box 2":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("2").value(wrought_iron);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("4").value(sheets);
                        jsonWriterBlock.name("particle").value(log);
                        break;
                    case "Cupboard":
                    case "Cupboard 4":
                    case "Cupboard 6":
                    case "Cupboard 9":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("4").value(sheets);
                        jsonWriterBlock.name("5").value(sheets);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Cupboard 2":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(wrought_iron);
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("2").value(sheets);
                        jsonWriterBlock.name("particle").value(log);
                        break;
                    case "Cupboard 3":
                    case "Cupboard 8":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(sheets);
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("5").value(bookshelf);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Cupboard 5":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(sheets);
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Cupboard 7":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(sheets);
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("4").value(sheets);
                        jsonWriterBlock.name("6").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Desk":
                    case "Desk 6":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(sheets);
                        jsonWriterBlock.name("2").value(wrought_iron);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        break;
                    case "Desk 2":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(sheets);
                        jsonWriterBlock.name("2").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Desk 3":
                    case "Desk4":
                    case "Desk 7":
                    case "Desk 8":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        break;
                    case "Desk 5":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(sheets);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Desk 9":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("3").value(glass);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        break;
                    case "Dresser":
                    case "Dresser 3":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("2").value(sheets);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Dresser 4":
                    case "Dresser 5":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Dresser 6":
                    case "Dresser 11":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("2").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("5").value(bookshelf);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Dresser 7":
                    case "Dresser 8":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Dresser 9":
                    case "Dresser 10":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("5").value(bookshelf);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Dresser Box":
                    case "Dresser 12":
                    case "Dresser 13":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("2").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Dresser 14":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        break;
                    case "Dresser 15":
                    case "Dresser 16":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("2").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("4").value(sapling_oak);
                        jsonWriterBlock.name("5").value(flower_pot);
                        jsonWriterBlock.name("7").value(dirt);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Dresser 17":
                    case "Dresser 18":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("2").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("4").value(sapling_oak);
                        jsonWriterBlock.name("5").value(flower_pot);
                        jsonWriterBlock.name("7").value(sheets);
                        jsonWriterBlock.name("8").value(dirt);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Furniture 1":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("2").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Furniture 2":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(wrought_iron);
                        break;
                    case "Furniture 3":
                    case "Furniture 9":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("6").value(sheets);
                        jsonWriterBlock.name("7").value(bookshelf);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Furniture 4":
                    case "Furniture 8":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("5").value(glass);
                        jsonWriterBlock.name("8").value("mcwfurnitures:block/oak/furniture_glass2");
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Furniture 5":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("4").value(sheets);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Furniture 6":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(sheets);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("0").value(bookshelf);
                        jsonWriterBlock.name("4").value(sheets);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Furniture 7":
                        jsonWriterBlock.name("parent").value(parentCombined);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("6").value(bookshelf);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("texture").value(log);
                        break;
                    case "Nightstand":
                    case "Nightstand 2":
                    case "Nightstand 4":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(sheets);
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("2").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Nightstand 3":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(sheets);
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("2").value(log);
                        jsonWriterBlock.name("4").value(bookshelf);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Nightstand 5":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(sheets);
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("2").value(log);
                        jsonWriterBlock.name("3").value(sheets);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Nightstand 6":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("3").value(sheets);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Nightstand 7":
                    case "Nightstand 8":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("2").value(log);
                        jsonWriterBlock.name("3").value(glass);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                    case "Nightstand 9":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        break;
                    case "Nightstand 10":
                    case "Nightstand 11":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("2").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        break;
                    case "Pult":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        break;
                    case "Pult 1":
                    case "Pult 2":
                    case "Pult 3":
                    case "Pult 4":
                        jsonWriterBlock.name("parent").value(parentBasic);
                        jsonWriterBlock.name("textures").beginObject();
                        jsonWriterBlock.name("0").value(sheets);
                        jsonWriterBlock.name("1").value(log);
                        jsonWriterBlock.name("3").value(log);
                        jsonWriterBlock.name("particle").value(log);
                        jsonWriterBlock.name("1_2").value(wrought_iron);
                        break;
                }

                jsonWriterBlock.endObject();
                jsonWriterBlock.endObject();

                jsonWriterBlock.close();
            }
        }
        return true;
    }

    public static boolean genBlockStates() throws IOException
    {
        for (String object : objects)
        {
            File foldersWood = new File(rootFolder + "/resources/" + MacawsModsTFC.MOD_ID + "/blockstates/wood/" + object.replace(" ", "_").toLowerCase() + "/");

            if (foldersWood.exists()) return false;
            else foldersWood.mkdirs();

            for (Tree wood : TFCRegistries.TREES.getValuesCollection())
            {
                File json = new File(rootFolder + "/resources/" + MacawsModsTFC.MOD_ID + "/blockstates/wood/" + object.replace(" ", "_").toLowerCase() + "/" + wood + ".json");
                String model = MacawsModsTFC.MOD_ID + ":wood/" + object.replace(" ", "_").toLowerCase() + "/" + wood;

                JsonWriter jsonWriter = new JsonWriter(new FileWriter(json));
                jsonWriter.setIndent("    ");
                jsonWriter.setLenient(false);
                jsonWriter.beginObject();
                jsonWriter.name("variants").beginObject();

                jsonWriter.name("facing=north").beginObject();
                jsonWriter.name("model").value(model);
                jsonWriter.name("y").value(90);
                jsonWriter.endObject();

                jsonWriter.name("facing=east").beginObject();
                jsonWriter.name("model").value(model);
                jsonWriter.name("y").value(180);
                jsonWriter.endObject();

                jsonWriter.name("facing=south").beginObject();
                jsonWriter.name("model").value(model);
                jsonWriter.name("y").value(270);
                jsonWriter.endObject();

                jsonWriter.name("facing=west").beginObject();
                jsonWriter.name("model").value(model);
                jsonWriter.endObject();

                jsonWriter.endObject();
                jsonWriter.endObject();

                jsonWriter.close();
            }
        }
        return true;
    }

    @SuppressWarnings("ConstantConditions")
    public static boolean genLangFile() throws IOException
    {
        File folders = new File(rootFolder + "/resources/" + MacawsModsTFC.MOD_ID + "/lang/");

        if (folders.exists()) return false;
        else folders.mkdirs();

        File lang = new File(rootFolder + "/resources/" + MacawsModsTFC.MOD_ID + "/lang/en_us.lang");

        if (lang.exists()) return false;

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(lang, true));

        String objectKey;
        String woodKey;

        fileWriter.write("# MACAW'S FURNITURE");
        fileWriter.newLine();
        fileWriter.newLine();
        fileWriter.write("# CONTAINERS");
        fileWriter.newLine();
        fileWriter.write("container." + MacawsModsTFC.MOD_ID + ".furniture=Furniture");
        fileWriter.newLine();
        fileWriter.write("container." + MacawsModsTFC.MOD_ID + ".cupboard=Cupboard");
        fileWriter.newLine();
        fileWriter.write("container." + MacawsModsTFC.MOD_ID + ".dresser=Dresser");
        fileWriter.newLine();
        fileWriter.write("container." + MacawsModsTFC.MOD_ID + ".wardrobe=Wardrobe");

        for (String object : objects)
        {
            fileWriter.newLine();
            fileWriter.newLine();

            switch (object)
            {
                case "Box":
                case "Box 2":
                case "Nightstand 6":
                    objectKey = "Kitchen Cabinet";
                    break;
                case "Cupboard":
                case "Cupboard 6":
                    objectKey = "Cupboard";
                    break;
                case "Cupboard 2":
                case "Cupboard 7":
                    objectKey = "Modern Cupboard";
                    break;
                case "Cupboard 3":
                    objectKey = "Bookshelf";
                    break;
                case "Cupboard 4":
                case "Cupboard 9":
                    objectKey = "Complex Cupboard";
                    break;
                case "Cupboard 5":
                    objectKey = "Double Cupboard";
                    break;
                case "Cupboard 8":
                    objectKey = "Tall Bookshelf";
                    break;
                case "Desk":
                case "Desk 6":
                    objectKey = "Drawer Desk";
                    break;
                case "Desk 2":
                case "Desk 5":
                    objectKey = "Cupboard Desk";
                    break;
                case "Desk 3":
                    objectKey = "Covered Desk";
                    break;
                case "Desk4":
                    objectKey = "Table";
                    break;
                case "Desk 7":
                    objectKey = "Double Table";
                    break;
                case "Desk 8":
                    objectKey = "Modern Table";
                    break;
                case "Desk 9":
                    objectKey = "Glass Table";
                    break;
                case "Dresser":
                    objectKey = "Classic Dresser";
                    break;
                case "Dresser Box":
                    objectKey = "Cupboard Dresser";
                    break;
                case "Dresser 3":
                    objectKey = "Double Drawer Dresser";
                    break;
                case "Dresser 4":
                case "Dresser 5":
                    objectKey = "Triple Drawer Dresser";
                    break;
                case "Dresser 6":
                    objectKey = "Bookcase Dresser";
                    break;
                case "Dresser 7":
                case "Dresser 8":
                    objectKey = "Complex Dresser";
                    break;
                case "Dresser 9":
                case "Dresser 10":
                    objectKey = "Bookshelf Dresser";
                    break;
                case "Dresser 11":
                    objectKey = "Bookcase Dresser";
                    break;
                case "Dresser 12":
                    objectKey = "Complex Shelving Unit";
                    break;
                case "Dresser 13":
                    objectKey = "Drawer Shelving Unit";
                    break;
                case "Dresser 14":
                    objectKey = "Empty Shelving Unit";
                    break;
                case "Dresser 15":
                case "Dresser 16":
                    objectKey = "Sapling Cabinet Dresser";
                    break;
                case "Dresser 17":
                case "Dresser 18":
                    objectKey = "Sapling Drawer Dresser";
                    break;
                case "Furniture 1":
                    objectKey = "Wardrobe";
                    break;
                case "Furniture 2":
                    objectKey = "Modern Wardrobe";
                    break;
                case "Furniture 3":
                case "Furniture 9":
                    objectKey = "Complex Wardrobe";
                    break;
                case "Furniture 4":
                case "Furniture 8":
                    objectKey = "Display Wardrobe";
                    break;
                case "Furniture 5":
                    objectKey = "Shelf Wardrobe";
                    break;
                case "Furniture 6":
                    objectKey = "Cupboard Wardrobe";
                    break;
                case "Furniture 7":
                    objectKey = "Tall Bookshelf";
                    break;
                case "Nightstand":
                    objectKey = "Drawer Nightstand";
                    break;
                case "Nightstand 2":
                    objectKey = "Double Drawer Nightstand";
                    break;
                case "Nightstand 3":
                    objectKey = "Bookcase Nightstand";
                    break;
                case "Nightstand 4":
                    objectKey = "Double Kitchen Cabinet";
                    break;
                case "Nightstand 5":
                    objectKey = "Drawer Cupboard";
                    break;
                case "Nightstand 7":
                case "Nightstand 8":
                    objectKey = "Glass Cabinet";
                    break;
                case "Nightstand 9":
                case "Nightstand 10":
                case "Nightstand 11":
                    objectKey = "End Table";
                    break;
                case "Pult":
                    objectKey = "Kitchen Counter";
                    break;
                case "Pult 1":
                case "Pult 2":
                    objectKey = "Cupboard Counter";
                    break;
                case "Pult 3":
                    objectKey = "Double Drawer Counter";
                    break;
                case "Pult 4":
                    objectKey = "Drawer Counter";
                    break;
                default:
                    objectKey = object;
                    break;
            }

            fileWriter.write("# " + objectKey.toUpperCase() + " VARIANTS");

            for (Tree wood : TFCRegistries.TREES.getValuesCollection())
            {
                woodKey = WordUtils.capitalize(wood.getRegistryName().getPath().replace("_", " "));
                fileWriter.newLine();
                fileWriter.write("tile." + MacawsModsTFC.MOD_ID + ".wood." + object.replace(" ", "_").toLowerCase() + "." + wood + ".name=" + woodKey + " " + objectKey);
            }
        }

        fileWriter.close();
        return true;
    }
}