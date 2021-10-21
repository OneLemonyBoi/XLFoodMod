package onelemonyboi.xlfoodmod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class RockSaltBlock extends Block {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
	public RockSaltBlock(String name)
	{
		super(Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.CROP));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

	@Override
	public int getExpDrop(BlockState state, LevelReader world, BlockPos pos, int fortune, int silktouch) {
		return Mth.nextInt(RANDOM, 0, 2);
	}
}
