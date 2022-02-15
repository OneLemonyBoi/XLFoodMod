package onelemonyboi.xlfoodmod.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import onelemonyboi.xlfoodmod.XLFoodMod;

public class FeaturesList
{
	public static final DeferredRegister<Feature<?>> REGISTRY_FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, XLFoodMod.MOD_ID);

	public static final RegistryObject<VanillaFlowerFeature> VANILLA_FLOWY = REGISTRY_FEATURES.register("vanilla_flower", () -> new VanillaFlowerFeature(RandomPatchConfiguration.CODEC));
}