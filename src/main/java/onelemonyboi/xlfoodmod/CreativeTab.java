package onelemonyboi.xlfoodmod;

import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab extends ItemGroup {
	
	private static final CreativeTab INSTANCE = new CreativeTab();

    public CreativeTab()
    {
        super(XLFoodMod.MOD_ID);
    }

    public static CreativeTab getInstance()
    {
        return INSTANCE;
    }
    
    public ItemStack createIcon()
    {
    	return new ItemStack(ItemList.PEPPER);
    }

}
