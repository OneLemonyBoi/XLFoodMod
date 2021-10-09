package onelemonyboi.xlfoodmod.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import onelemonyboi.xlfoodmod.CreativeTab;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class ItemFood extends Item {
	public ItemFood(String name, int hunger, float saturation, Item item)
	{
	    super(new Properties().tab(CreativeTab.getInstance()).craftRemainder(item).food(new FoodProperties.Builder().saturationMod(saturation).nutrition(hunger).build()));
	    this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

	public ItemFood(String name, int hunger, float saturation)
	{
		super(new Properties().tab(CreativeTab.getInstance()).food(new FoodProperties.Builder().saturationMod(saturation).nutrition(hunger).build()));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}
}
