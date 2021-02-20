package onelemonyboi.xlfoodmod.init;

import onelemonyboi.xlfoodmod.XLFoodMod;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockCake extends CakeBlock {

	public BlockCake(String name, int foodlevel, float saturation)
	{
		super(Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

}
