package onelemonyboi.xlfoodmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import onelemonyboi.xlfoodmod.init.ItemList;

public class CreativeTab extends CreativeModeTab {
	
	private static final CreativeTab INSTANCE = new CreativeTab();

    public CreativeTab()
    {
        super(XLFoodMod.MOD_ID);
    }

    public static CreativeTab getInstance()
    {
        return INSTANCE;
    }
    
    public ItemStack makeIcon()
    {
    	return new ItemStack(ItemList.PEPPER);
    }

}
