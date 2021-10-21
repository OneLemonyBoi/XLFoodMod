package onelemonyboi.xlfoodmod.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.items.ItemHandlerHelper;
import onelemonyboi.xlfoodmod.init.ItemFood;
import onelemonyboi.xlfoodmod.init.ItemList;

import java.util.List;

public class DeadlyEnergyDrinkItem extends ItemFood {

	public DeadlyEnergyDrinkItem(String name, int hunger, float saturation)
    {
        super(name, hunger, saturation);
    }
	
	@Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof Player player)
        {
			entityLiving.addEffect(new MobEffectInstance(MobEffects.POISON, 1200, 0, false, true));
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemList.EMPTY_CAN));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add(new TranslatableComponent(this.getDescriptionId() + ".tooltip").withStyle(ChatFormatting.RED));
	}
}
