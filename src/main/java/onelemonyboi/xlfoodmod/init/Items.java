package onelemonyboi.xlfoodmod.init;

import onelemonyboi.xlfoodmod.CreativeTab;
import onelemonyboi.xlfoodmod.XLFoodMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class Items extends Item {
	
	public Items(String name)
	{
        super(new Properties().tab(CreativeTab.getInstance()));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

}
