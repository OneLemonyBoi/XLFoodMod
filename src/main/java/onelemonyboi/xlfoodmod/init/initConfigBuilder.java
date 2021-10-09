package onelemonyboi.xlfoodmod.init;

import net.minecraftforge.common.ForgeConfigSpec;

public class initConfigBuilder {
    public final ForgeConfigSpec COMMON;

    public ForgeConfigSpec.BooleanValue enableGrass;
    public ForgeConfigSpec.BooleanValue enableVanilla;
    public ForgeConfigSpec.BooleanValue enableRockSalt;

    public initConfigBuilder() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        builder.push("Seed/Flower Settings");

        enableGrass = builder
            .comment("Should XL Food Mod Seeds be obtainable?  Default: true")
            .define("enableGrass", true);

        enableVanilla = builder
            .comment("Should Vanilla (flavoring) Flowers be obtainable?  Default: true")
            .define("enableVanilla", true);

        enableRockSalt = builder
            .comment("Should Rock Salt be generated?  Default: true")
            .define("enableRockSalt", true);

        builder.pop();
        COMMON = builder.build();
    }
}
