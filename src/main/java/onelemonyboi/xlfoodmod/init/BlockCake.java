package onelemonyboi.xlfoodmod.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class BlockCake extends CakeBlock {

	public BlockCake(String name, int foodlevel, float saturation)
	{
		super(Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

}
