package onelemonyboi.xlfoodmod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import onelemonyboi.xlfoodmod.world.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import onelemonyboi.xlfoodmod.init.BlockList;
import onelemonyboi.xlfoodmod.init.ComposterItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.event.world.BlockEvent.*;
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
	}
	
	private void setup(final FMLCommonSetupEvent event)
    {
		ComposterItems.register();
    }
	private void doClientStuff(final FMLClientSetupEvent event)
	{
        // do something that can only be done on the client
		RenderTypeLookup.setRenderLayer(BlockList.VANILLA_FLOWER, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockList.RICE_PLANT, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockList.PEPPER_PLANT, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockList.CORN_PLANT, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockList.CUCUMBER_PLANT, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockList.LETTUCE_PLANT, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockList.ONION_PLANT, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockList.TOMATO_PLANT, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockList.STRAWBERRY_PLANT, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockList.LEMON_PLANT, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockList.PINEAPPLE_PLANT, RenderType.getCutout());
	}
	
	public static Logger getLogger()
    {
        return LOGGER;
    }

}
