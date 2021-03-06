package onelemonyboi.xlfoodmod.blocks;

import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import onelemonyboi.xlfoodmod.XLFoodMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;

public class RockSaltBlock extends Block {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;
	public RockSaltBlock(String name)
	{
		super(Properties.create(Material.ROCK).hardnessAndResistance(1.5F).sound(SoundType.STONE));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

	@Override
	public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch)
	{
		int i = 0;
		i = MathHelper.nextInt(RANDOM, 0, 2);
		return i;
	}

}
