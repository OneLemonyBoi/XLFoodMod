package onelemonyboi.xlfoodmod.init;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

public class OreInit
{
	//public static boolean hello = true;
  public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();
  public static final List<PlacedFeature> OVERWORLD_FLOWY = new ArrayList<>();
  
  public static RandomPatchConfiguration vanillaFlow; //= new RandomPatchConfiguration(0, 0, 0, BlockList.VANILLA_FLOWER.defaultBlockState());
  public static Supplier<PlacedFeature> OVERWORLD_IS;

  //= Feature.RANDOM_PATCH
          //.configured(new RandomPatchConfiguration(0, 0, 0, OVERWORLD_IS));

  public static void registerOres()
  {
      final ConfiguredFeature<?, ?> SaltOre = Feature.ORE
              .configured(new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.ROCK_SALT.defaultBlockState())), 6));
     
      //List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.VANILLA_FLOWER.defaultBlockState())), 6));

     // if(hello)
      //{
          final PlacedFeature placedSaltOre = PlacementUtils.register("salt_ore",
        		  SaltOre.placed(commonOrePlacement(6, HeightRangePlacement
                          .uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(64)))));
          

          //final PlacedFeature placedVanillaFlower = PlacementUtils.register("vanilla_flower", vanillaFlow.placed(commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(200)))));
          
          OVERWORLD_ORES.add(placedSaltOre);
          //OVERWORLD_FLOWY.add(placedVanillaFlower);
     // }
  }
  
  private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
      return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
   }
  
  public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
      return orePlacement(CountPlacement.of(p_195344_), p_195345_);
   }
}