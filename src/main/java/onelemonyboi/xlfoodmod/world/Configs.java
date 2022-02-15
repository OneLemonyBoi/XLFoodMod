package onelemonyboi.xlfoodmod.world;

import net.minecraftforge.common.ForgeConfigSpec;

public class Configs {
	public static ForgeConfigSpec.BooleanValue enable_grass;
	public static ForgeConfigSpec.BooleanValue enable_vanilla;
	public static void init(ForgeConfigSpec.Builder config){
		enable_grass = config.comment("Should XL Food Mod Seeds be Obtainable?").define("Generate Grass", true);
		enable_vanilla = config.comment("Should Vanilla(flavoring) Flowers be Obtainable?").define("Generate Vanilla Flower", true);
	}
}
