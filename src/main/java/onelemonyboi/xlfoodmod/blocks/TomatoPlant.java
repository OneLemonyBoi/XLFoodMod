package onelemonyboi.xlfoodmod.blocks;

import onelemonyboi.xlfoodmod.XLFoodMod;
import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;

public class TomatoPlant extends CropBlock {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
    public TomatoPlant(String name)
    {
        super(Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.CROP));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }
    
    protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos)
    {
    	return state.getBlock() instanceof FarmBlock;
    }

  	protected ItemLike getBaseSeedId()
  	{
   		return ItemList.TOMATO_SEEDS;
  	}

  	public ItemStack getCloneItemStack(BlockGetter worldIn, BlockPos pos, BlockState state)
  	{
  		return new ItemStack(this.getBaseSeedId());
	}
  	
}
