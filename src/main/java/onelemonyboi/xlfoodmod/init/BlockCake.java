package onelemonyboi.xlfoodmod.init;

import net.minecraft.block.CakeBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class BlockCake extends CakeBlock {

	public BlockCake(String name, int foodlevel, float saturation)
	{
		super(Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

}
