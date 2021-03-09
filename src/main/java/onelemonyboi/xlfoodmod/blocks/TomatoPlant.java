package onelemonyboi.xlfoodmod.blocks;

import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import onelemonyboi.xlfoodmod.XLFoodMod;
import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TomatoPlant extends CropsBlock {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;
    public TomatoPlant(String name)
    {
        super(Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }
    
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
    	return state.getBlock() instanceof FarmlandBlock;
    }

   	@OnlyIn(Dist.CLIENT)
  	protected IItemProvider getSeedsItem()
  	{
   		return ItemList.TOMATO_SEEDS;
  	}

  	@OnlyIn(Dist.CLIENT)
  	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
  	{
  		return new ItemStack(this.getSeedsItem());
	}
  	
}
