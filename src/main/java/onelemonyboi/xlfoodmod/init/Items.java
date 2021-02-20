package onelemonyboi.xlfoodmod.init;

import onelemonyboi.xlfoodmod.CreativeTab;
import onelemonyboi.xlfoodmod.XLFoodMod;
import net.minecraft.util.ResourceLocation;

public class Items extends net.minecraft.item.Item {
	
	public Items(String name)
	{
        super(new Properties().group(CreativeTab.getInstance()));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

}
