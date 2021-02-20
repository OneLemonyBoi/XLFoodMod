package onelemonyboi.xlfoodmod.init;

import onelemonyboi.xlfoodmod.XLFoodMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.util.ResourceLocation;

public class ItemSeeds extends BlockNamedItem {
	
	public ItemSeeds(String name, Block crop)
	{
        super(crop, new Properties().maxStackSize(64));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

}
