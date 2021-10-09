package onelemonyboi.xlfoodmod.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.util.ResourceLocation;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class ItemSeedFood extends BlockNamedItem {

	public ItemSeedFood(String name, Block crop, int hunger, float saturation)
	{
		super(crop, new Properties().food(new Food.Builder().saturationMod(saturation).nutrition(hunger).build()));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

}
