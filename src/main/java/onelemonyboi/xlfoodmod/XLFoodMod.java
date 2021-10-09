package onelemonyboi.xlfoodmod;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import onelemonyboi.xlfoodmod.init.BlockList;
import onelemonyboi.xlfoodmod.init.ComposterItems;
import onelemonyboi.xlfoodmod.init.initConfigBuilder;
import onelemonyboi.xlfoodmod.init.initOreGen;
import onelemonyboi.xlfoodmod.util.GrassDrops;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(XLFoodMod.MOD_ID)
public class XLFoodMod {
    public static final String MOD_ID = "xlfoodmod";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final initConfigBuilder CONFIGURATION = new initConfigBuilder();		// #Crimson_Fluff

	public XLFoodMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
		MinecraftForge.EVENT_BUS.addListener(GrassDrops::onBlockBreakEvent);
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, initOreGen::generateOres);		// #Crimson_Fluff
        MinecraftForge.EVENT_BUS.register(this);

		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CONFIGURATION.COMMON);	// #Crimson_Fluff
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		ComposterItems.register();
    }

	private void doClientStuff(final FMLClientSetupEvent event) {
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
}
