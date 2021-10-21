package onelemonyboi.xlfoodmod.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;
import onelemonyboi.xlfoodmod.init.ItemFood;

public class JuiceItem extends ItemFood {

    public JuiceItem(String name, int hunger, float saturation, Item item)
    {
        super(name, hunger, saturation, item);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving)
    {
        if(entityLiving instanceof Player player)
        {
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.GLASS_BOTTLE));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }
}
