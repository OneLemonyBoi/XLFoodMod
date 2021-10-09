package onelemonyboi.xlfoodmod.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import onelemonyboi.xlfoodmod.XLFoodMod;
import onelemonyboi.xlfoodmod.init.ItemList;

public class CucumberPlant extends CropsBlock {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
    public CucumberPlant(String name)
    {
        super(Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.CROP));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }
    
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
    	return state.getBlock() instanceof FarmlandBlock;
   	}

 	@OnlyIn(Dist.CLIENT)
 	protected IItemProvider getSeedsItem()
  	{
 		return ItemList.CUCUMBER_SEEDS;
  	}

  	@OnlyIn(Dist.CLIENT)
  	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
  	{
  		return new ItemStack(this.getSeedsItem());
  	}
  	
}
