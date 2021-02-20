package onelemonyboi.xlfoodmod.world;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class Configs {
	public static ForgeConfigSpec.BooleanValue enable_grass;
	public static ForgeConfigSpec.BooleanValue enable_vanilla;
	public static void init(ForgeConfigSpec.Builder config){
		enable_grass = config.comment("Should XL Food Mod Seeds Generate?").define("Generate Grass", true);
		enable_vanilla = config.comment("Should Vanilla(flavoring) Flowers Generate?").define("Generate Vanilla Flower", true);
	}
}
