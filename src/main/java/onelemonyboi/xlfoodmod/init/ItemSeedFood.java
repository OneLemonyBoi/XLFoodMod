package onelemonyboi.xlfoodmod.init;

import onelemonyboi.xlfoodmod.XLFoodMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.util.ResourceLocation;

public class ItemSeedFood extends BlockNamedItem {

	public ItemSeedFood(String name, Block crop, int hunger, float saturation)
	{
		super(crop, new Properties().food(new Food.Builder().saturation(saturation).hunger(hunger).build()));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

}
