package onelemonyboi.xlfoodmod.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class ItemSeedFood extends ItemNameBlockItem
{
	public ItemSeedFood(String name, Block crop, int hunger, float saturation)
	{
		super(crop, new Item.Properties().food(new FoodProperties.Builder().saturationMod(saturation).nutrition(hunger).build()));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}
}