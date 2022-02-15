package onelemonyboi.xlfoodmod.init;

import onelemonyboi.xlfoodmod.CreativeTab;
import onelemonyboi.xlfoodmod.XLFoodMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;

public class ItemSeeds extends ItemNameBlockItem {
	
	public ItemSeeds(String name, Block crop)
	{
        super(crop, new Properties().stacksTo(64).tab(CreativeTab.getInstance()));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

}
