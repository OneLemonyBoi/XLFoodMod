package onelemonyboi.xlfoodmod.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import onelemonyboi.xlfoodmod.CreativeTab;

public class BlockItems extends BlockItem {
	
	public BlockItems(Block blockIn)
	{
		super(blockIn, new Properties().tab(CreativeTab.getInstance()));
		setRegistryName(blockIn.getRegistryName());
	}

}
