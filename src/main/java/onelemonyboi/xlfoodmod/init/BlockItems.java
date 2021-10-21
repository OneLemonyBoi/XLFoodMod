package onelemonyboi.xlfoodmod.init;

import net.minecraft.block.Block;
import onelemonyboi.xlfoodmod.CreativeTab;

public class BlockItems extends net.minecraft.item.BlockItem {
	
	public BlockItems(Block blockIn)
	{
		super(blockIn, new Properties().tab(CreativeTab.getInstance()));
		setRegistryName(blockIn.getRegistryName());
	}

}
