package onelemonyboi.xlfoodmod.items;

import java.util.List;

import onelemonyboi.xlfoodmod.init.ItemFood;
import onelemonyboi.xlfoodmod.init.ItemList;
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

public class SuperEnergyDrinkItem extends ItemFood {

	public SuperEnergyDrinkItem(String name, int hunger, float saturation)
    {
        super(name, hunger, saturation);
    }
	
	@Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof Player)
        {
        	Player player = (Player) entityLiving;
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 2, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 2, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.JUMP, 3600, 0, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3600, 1, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 1, false, false));
        	entityLiving.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 2, false, false));
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemList.EMPTY_CAN));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add(new TranslatableComponent(this.getRegistryName() + ".tooltip").withStyle(ChatFormatting.BLUE));
		tooltip.add(new TranslatableComponent(this.getRegistryName() + ".tooltip2").withStyle(ChatFormatting.BLUE));
		tooltip.add(new TranslatableComponent(this.getRegistryName() + ".tooltip3").withStyle(ChatFormatting.BLUE));
		tooltip.add(new TranslatableComponent(this.getRegistryName() + ".tooltip4").withStyle(ChatFormatting.BLUE));
		tooltip.add(new TranslatableComponent(this.getRegistryName() + ".tooltip5").withStyle(ChatFormatting.BLUE));
		tooltip.add(new TranslatableComponent(this.getRegistryName() + ".tooltip6").withStyle(ChatFormatting.BLUE));
		tooltip.add(new TranslatableComponent(this.getRegistryName() + ".tooltip7").withStyle(ChatFormatting.BLUE));
		tooltip.add(new TranslatableComponent(this.getRegistryName() + ".tooltip8").withStyle(ChatFormatting.BLUE));
	}

}
