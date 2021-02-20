package onelemonyboi.xlfoodmod.items;

import onelemonyboi.xlfoodmod.init.ItemFood;
import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class CappucinoItem extends ItemFood {

	public CappucinoItem(String name, int hunger, float saturation)
    {
        super(name, hunger, saturation);
    }
	
	@Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof PlayerEntity)
        {
        	PlayerEntity player = (PlayerEntity) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemList.COFFEE_CUP));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

}
