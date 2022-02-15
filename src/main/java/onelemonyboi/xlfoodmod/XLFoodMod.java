package onelemonyboi.xlfoodmod;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import onelemonyboi.xlfoodmod.world.Config;
import java.util.List;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import onelemonyboi.xlfoodmod.init.BlockList;
import onelemonyboi.xlfoodmod.init.ComposterItems;
import onelemonyboi.xlfoodmod.init.FeaturesList;
import onelemonyboi.xlfoodmod.init.OreInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import onelemonyboi.xlfoodmod.util.GrassDrops;

@Mod(XLFoodMod.MOD_ID)
public class XLFoodMod {
	
    public static final String MOD_ID = "xlfoodmod";
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	public XLFoodMod()
	{
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
		MinecraftForge.EVENT_BUS.addListener(GrassDrops::onBlock);
        MinecraftForge.EVENT_BUS.register(this);
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.CONFIG, "xlfoodmod.toml");
		Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve("xlfoodmod.toml").toString());
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		FeaturesList.REGISTRY_FEATURES.register(bus);
	}
	
	private void setup(final FMLCommonSetupEvent event)
    {
		event.enqueueWork(()->{OreInit.registerOres();});
		ComposterItems.register();
    }
	private void doClientStuff(final FMLClientSetupEvent event)
	{
        // do something that can only be done on the client
		ItemBlockRenderTypes.setRenderLayer(BlockList.VANILLA_FLOWER, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.RICE_PLANT, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.PEPPER_PLANT, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.CORN_PLANT, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.CUCUMBER_PLANT, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.LETTUCE_PLANT, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.ONION_PLANT, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.TOMATO_PLANT, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.STRAWBERRY_PLANT, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.LEMON_PLANT, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockList.PINEAPPLE_PLANT, RenderType.cutout());
	}
	
	public static Logger getLogger()
    {
        return LOGGER;
    }

	@Mod.EventBusSubscriber(modid = XLFoodMod.MOD_ID, bus = Bus.FORGE)
	public static class XLFMForgeInit
	{
	    @SubscribeEvent(priority = EventPriority.HIGHEST)
	    public static void biomeLoading(BiomeLoadingEvent event)
	    {
	        final List<Supplier<PlacedFeature>> features = event.getGeneration()
	                .getFeatures(Decoration.UNDERGROUND_ORES);
	        
	        final List<Supplier<PlacedFeature>> flowers = event.getGeneration()
	                .getFeatures(Decoration.SURFACE_STRUCTURES);

	        switch (event.getCategory())
	        {
	        	default -> OreInit.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
	        }
	        RandomPatchConfiguration rnd = null;
	        
	        event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
                    FeaturesList.VANILLA_FLOWY.get().configured(rnd).filteredByBlockSurvival(Blocks.GRASS_BLOCK));
	        
	          //final PlacedFeature placedVanFlow = PlacementUtils.register("vanilla_flower",
	        	//	  OreInit.OVERWORLD_IS.get());
	        				  
	        				  //OreInit.commonOrePlacement(6, HeightRangePlacement
	                          //.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(64)))));

	    }
	}
}