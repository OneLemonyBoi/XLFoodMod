package onelemonyboi.xlfoodmod.blocks;

import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import onelemonyboi.xlfoodmod.XLFoodMod;
import net.minecraft.block.Block;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class VanillaFlowerBlock extends BushBlock {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;
	public VanillaFlowerBlock(String name)
	{
		super(Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).doesNotBlockMovement().sound(SoundType.PLANT));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}
	
	public Block.OffsetType getOffsetType()
	{
		return Block.OffsetType.XZ;
	}

}
