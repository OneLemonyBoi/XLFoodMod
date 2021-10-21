package onelemonyboi.xlfoodmod.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.NoPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class initOreGen {
//    private static final BlockClusterFeatureConfig GRASS_CONFIG = new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockList.GRASS.getDefaultState()), new SimpleBlockPlacer()).tries(6).build();
    private static final BlockClusterFeatureConfig VANILLA_FLOWER_CONFIG = new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockList.VANILLA_FLOWER.defaultBlockState()), new SimpleBlockPlacer()).tries(1).build();

    public static void generateOres(final BiomeLoadingEvent event) {
        if (! (event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            // Rock Salt, between Y-Level 6 and 64, vein size 6
            if (XLFoodMod.CONFIGURATION.enableRockSalt.get()) {
                event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.ROCK_SALT.defaultBlockState(), 6))
                    .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(6, 0, 64)))
                    .squared().count(6));
            }

            // Vanilla Crops
            if (XLFoodMod.CONFIGURATION.enableVanilla.get()) {
                event.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                    Feature.RANDOM_PATCH.configured(VANILLA_FLOWER_CONFIG)
                    .decorated(Placement.HEIGHTMAP_SPREAD_DOUBLE.configured(new NoPlacementConfig()))
                    .squared().count(1));
            }
        }
    }

//    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
//        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
//            Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
//                .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
//                .squared().count(amount));
//    }
}
