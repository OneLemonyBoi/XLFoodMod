package onelemonyboi.xlfoodmod.init;

import onelemonyboi.xlfoodmod.CreativeTab;
import onelemonyboi.xlfoodmod.XLFoodMod;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.util.ResourceLocation;

public class ItemFood extends Item {
	
	public ItemFood(String name, int hunger, float saturation)
	{
	    super(new Properties().group(CreativeTab.getInstance()).food(new Food.Builder().saturation(saturation).hunger(hunger).build()));
	    this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

}
