package onelemonyboi.xlfoodmod.blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;
import onelemonyboi.xlfoodmod.XLFoodMod;
import onelemonyboi.xlfoodmod.init.ItemList;

public class RicePlant extends CropBlock {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
    public RicePlant(String name)
    {
		super(Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.CROP));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

	@Override
	protected ItemLike getBaseSeedId() {
		return ItemList.RICE;
	}

//	@OnlyIn(Dist.CLIENT)
// 	protected IItemProvider getSeedsItem()
//  	{
// 		return ItemList.RICE;
//  	}
//
//  	@OnlyIn(Dist.CLIENT)
//  	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
//  	{
//  		return new ItemStack(this.getSeedsItem());
//  	}
  	
}
