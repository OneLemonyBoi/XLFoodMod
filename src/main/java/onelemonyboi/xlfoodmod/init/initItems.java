package onelemonyboi.xlfoodmod.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import onelemonyboi.xlfoodmod.CreativeTab;
import onelemonyboi.xlfoodmod.XLFoodMod;

// refactored name because conflicts with Minecraft Items

public class initItems extends Item {
	
	public initItems(String name)
	{
        super(new Item.Properties().tab(CreativeTab.getInstance()));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

}
