package onelemonyboi.xlfoodmod.init;

import onelemonyboi.xlfoodmod.CreativeTab;
import net.minecraft.block.Block;

public class BlockItems extends net.minecraft.item.BlockItem {
	
	public BlockItems(Block blockIn)
	{
		super(blockIn, new Properties().group(CreativeTab.getInstance()));
		setRegistryName(blockIn.getRegistryName());
	}

}
