package onelemonyboi.xlfoodmod.init;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;

public class VanillaFlowerFeature extends Feature<RandomPatchConfiguration>
{
	   public VanillaFlowerFeature(Codec<RandomPatchConfiguration> p_65865_) {
		      super(p_65865_);
		   }

		   public boolean place(FeaturePlaceContext<RandomPatchConfiguration> p_159861_) {
		      WorldGenLevel worldgenlevel = p_159861_.level();
		      BlockPos blockpos = p_159861_.origin();
		      BlockState blockstate = worldgenlevel.getBlockState(blockpos.above());
		      
		         if (!blockstate.is(Blocks.GRASS) && !blockstate.is(Blocks.TALL_GRASS) && !blockstate.is(Blocks.WATER) && !blockstate.is(Blocks.LAVA))
		         {
		            return false;
		         }
		         else
		         {
		            worldgenlevel.setBlock(blockpos, BlockList.VANILLA_FLOWER.defaultBlockState(), 1);

		            return true;
		         }
		      }
}