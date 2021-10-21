package onelemonyboi.xlfoodmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ResourceLocation;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class VanillaFlowerBlock extends BushBlock {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
	public VanillaFlowerBlock(String name)
	{
		super(Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.CROP));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}
	
	public Block.OffsetType getOffsetType()
	{
		return Block.OffsetType.XZ;
	}

}
