package onelemonyboi.xlfoodmod;

import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab extends CreativeModeTab
{	
	private static final CreativeTab INSTANCE = new CreativeTab();

    public CreativeTab()
    {
        super(XLFoodMod.MOD_ID);
    }

    public static CreativeTab getInstance()
    {
        return INSTANCE;
    }
    
    @Override
    public ItemStack makeIcon()
    {
    	return new ItemStack(ItemList.PINEAPPLE);
    }
}