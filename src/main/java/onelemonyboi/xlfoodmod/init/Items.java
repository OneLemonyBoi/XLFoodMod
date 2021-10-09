package onelemonyboi.xlfoodmod.init;

import net.minecraft.util.ResourceLocation;
import onelemonyboi.xlfoodmod.CreativeTab;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class Items extends net.minecraft.item.Item {
	
	public Items(String name)
	{
        super(new Properties().tab(CreativeTab.getInstance()));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

}
