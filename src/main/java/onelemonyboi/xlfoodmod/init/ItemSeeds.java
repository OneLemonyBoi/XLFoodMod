package onelemonyboi.xlfoodmod.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class ItemSeeds extends ItemNameBlockItem {
	
	public ItemSeeds(String name, Block crop)
	{
        super(crop, new Properties().stacksTo(64));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

}
