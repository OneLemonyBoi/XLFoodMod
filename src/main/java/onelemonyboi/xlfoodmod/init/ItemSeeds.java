package onelemonyboi.xlfoodmod.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.util.ResourceLocation;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class ItemSeeds extends BlockNamedItem {
	
	public ItemSeeds(String name, Block crop)
	{
        super(crop, new Properties().stacksTo(64));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

}
