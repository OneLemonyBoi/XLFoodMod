package onelemonyboi.xlfoodmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class RockSaltBlock extends Block {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
	public RockSaltBlock(String name)
	{
		super(Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.CROP));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

	@Override
	public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
		return MathHelper.nextInt(RANDOM, 0, 2);
	}
}
