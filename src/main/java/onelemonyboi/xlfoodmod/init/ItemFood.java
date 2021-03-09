package onelemonyboi.xlfoodmod.init;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import onelemonyboi.xlfoodmod.CreativeTab;
import onelemonyboi.xlfoodmod.XLFoodMod;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class ItemFood extends Item {
	
	public ItemFood(String name, int hunger, float saturation, Item item)
	{
	    super(new Properties().group(CreativeTab.getInstance()).containerItem(item).food(new Food.Builder().saturation(saturation).hunger(hunger).build()));
	    this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

	public ItemFood(String name, int hunger, float saturation)
	{
		super(new Properties().group(CreativeTab.getInstance()).food(new Food.Builder().saturation(saturation).hunger(hunger).build()));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}
}
