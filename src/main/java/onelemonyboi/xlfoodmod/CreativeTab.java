package onelemonyboi.xlfoodmod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import onelemonyboi.xlfoodmod.init.ItemList;

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
    
    public ItemStack makeIcon()
    {
    	return new ItemStack(ItemList.PEPPER);
    }

}
