package onelemonyboi.xlfoodmod.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;
import onelemonyboi.xlfoodmod.init.ItemFood;

public class BucketOfFriedChickenItem extends ItemFood {

	public BucketOfFriedChickenItem(String name, int hunger, float saturation)
    {
        super(name, hunger, saturation);
    }
	
	@Override
    public ItemStack finishUsingItem(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof PlayerEntity)
        {
        	PlayerEntity player = (PlayerEntity) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.BUCKET));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }

}
