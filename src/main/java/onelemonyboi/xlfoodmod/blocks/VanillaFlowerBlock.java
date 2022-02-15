package onelemonyboi.xlfoodmod.blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class VanillaFlowerBlock extends BushBlock {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
	public VanillaFlowerBlock(String name)
	{
		super(Properties.of(Material.PLANT).strength(0.0F).noCollission().sound(SoundType.GRASS));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}
	
	public Block.OffsetType getOffsetType()
	{
		return Block.OffsetType.XZ;
	}

}
