package onelemonyboi.xlfoodmod.init;

import net.minecraft.data.worldgen.Features;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class initOreGen {
//    private static final BlockClusterFeatureConfig GRASS_CONFIG = new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockList.GRASS.getDefaultState()), new SimpleBlockPlacer()).tries(6).build();
    private static final RandomPatchConfiguration VANILLA_FLOWER_CONFIG = new RandomPatchConfiguration
        .GrassConfigurationBuilder(new SimpleStateProvider(BlockList.VANILLA_FLOWER.defaultBlockState()), new SimpleBlockPlacer()).tries(1).build();

    public static void generateOres(final BiomeLoadingEvent event) {
        if (! (event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {
            // Rock Salt, between Y-Level 6 and 64, vein size 6
            if (XLFoodMod.CONFIGURATION.enableRockSalt.get()) {
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockList.ROCK_SALT.defaultBlockState(), 6))
                    .rangeUniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(64))
                    .squared().count(6));
            }

            // Vanilla Crops
            if (XLFoodMod.CONFIGURATION.enableVanilla.get()) {
                event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
                    Feature.RANDOM_PATCH.configured(VANILLA_FLOWER_CONFIG)
                    .decorated(Features.Decorators.HEIGHTMAP_DOUBLE)
                    .squared().count(1));
            }

//                .decorated(Features.Decorators.ADD_32)
//                .decorated(Features.Decorators.HEIGHTMAP_SQUARE)
        }
    }
}
