package onelemonyboi.xlfoodmod.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.items.ItemHandlerHelper;
import onelemonyboi.xlfoodmod.init.ItemFood;
import onelemonyboi.xlfoodmod.init.ItemList;

import java.util.List;

public class StealthyEnergyDrinkItem extends ItemFood {

	public StealthyEnergyDrinkItem(String name, int hunger, float saturation)
    {
        super(name, hunger, saturation);
    }
	
	@Override
    public ItemStack finishUsingItem(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof PlayerEntity)
        {
        	PlayerEntity player = (PlayerEntity) entityLiving;
        	entityLiving.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 2400, 0, false, true));
        	entityLiving.addEffect(new EffectInstance(Effects.NIGHT_VISION, 2400, 0, false, true));
        	entityLiving.addEffect(new EffectInstance(Effects.INVISIBILITY, 2400, 0, false, true));
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemList.EMPTY_CAN));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".tooltip").withStyle(TextFormatting.BLUE));
		tooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".tooltip2").withStyle(TextFormatting.BLUE));
		tooltip.add(new TranslationTextComponent(this.getDescriptionId() + ".tooltip3").withStyle(TextFormatting.BLUE));
	}

}
