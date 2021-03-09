package onelemonyboi.xlfoodmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import onelemonyboi.xlfoodmod.init.ItemFood;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class JuiceItem extends ItemFood {

    public JuiceItem(String name, int hunger, float saturation, Item item)
    {
        super(name, hunger, saturation, item);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
    {
        if(entityLiving instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.GLASS_BOTTLE));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}
