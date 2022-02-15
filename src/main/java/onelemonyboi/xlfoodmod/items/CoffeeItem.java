package onelemonyboi.xlfoodmod.items;

import onelemonyboi.xlfoodmod.init.ItemFood;
import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;

public class CoffeeItem extends ItemFood {

	public CoffeeItem(String name, int hunger, float saturation)
    {
        super(name, hunger, saturation);
    }
	
	@Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof Player)
        {
        	Player player = (Player) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemList.COFFEE_CUP));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }

}
