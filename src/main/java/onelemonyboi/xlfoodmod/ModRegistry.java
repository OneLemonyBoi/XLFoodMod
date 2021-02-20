package onelemonyboi.xlfoodmod;

import onelemonyboi.xlfoodmod.init.BlockList;
import onelemonyboi.xlfoodmod.init.ItemList;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(XLFoodMod.MOD_ID)
@EventBusSubscriber(modid = XLFoodMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModRegistry {

	@SubscribeEvent
	public static void onBlockRegistry(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(BlockList.ROCK_SALT);
		event.getRegistry().register(BlockList.GRASS);
		event.getRegistry().register(BlockList.VANILLA_FLOWER);
		event.getRegistry().register(BlockList.RICE_PLANT);
		event.getRegistry().register(BlockList.PEPPER_PLANT);
		event.getRegistry().register(BlockList.CORN_PLANT);
		event.getRegistry().register(BlockList.CUCUMBER_PLANT);
		event.getRegistry().register(BlockList.LETTUCE_PLANT);
		event.getRegistry().register(BlockList.ONION_PLANT);
		event.getRegistry().register(BlockList.TOMATO_PLANT);
		event.getRegistry().register(BlockList.STRAWBERRY_PLANT);
		event.getRegistry().register(BlockList.CHOCOLATE_CAKE);
		event.getRegistry().register(BlockList.CHOCOLATE_COOKIE_CAKE);
		event.getRegistry().register(BlockList.CHEESE_CAKE);
		event.getRegistry().register(BlockList.NETHER_CAKE);
		event.getRegistry().register(BlockList.STRAWBERRY_CAKE);
		event.getRegistry().register(BlockList.PUMPKIN_CAKE);
		event.getRegistry().register(BlockList.PIZZA);
	}

	@SubscribeEvent
	public static void onItemRegistry(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(ItemList.ROCK_SALT);
		event.getRegistry().register(ItemList.GRASS);
		event.getRegistry().register(ItemList.VANILLA_FLOWER);
		event.getRegistry().register(ItemList.CHOCOLATE_CAKE);
		event.getRegistry().register(ItemList.CHOCOLATE_COOKIE_CAKE);
		event.getRegistry().register(ItemList.CHEESE_CAKE);
		event.getRegistry().register(ItemList.NETHER_CAKE);
		event.getRegistry().register(ItemList.STRAWBERRY_CAKE);
		event.getRegistry().register(ItemList.PUMPKIN_CAKE);
		event.getRegistry().register(ItemList.PIZZA);

		event.getRegistry().register(ItemList.RICE_PLANT);
		event.getRegistry().register(ItemList.RICE);
		event.getRegistry().register(ItemList.BUTTER_RICE);
		event.getRegistry().register(ItemList.FRIED_RICE);
		event.getRegistry().register(ItemList.PEPPER_PLANT);
		event.getRegistry().register(ItemList.PEPPER_SEEDS);
		event.getRegistry().register(ItemList.PEPPER);
		event.getRegistry().register(ItemList.CORN_PLANT);
		event.getRegistry().register(ItemList.CORN_SEEDS);
		event.getRegistry().register(ItemList.RAW_CORN);
		event.getRegistry().register(ItemList.CORN);
		event.getRegistry().register(ItemList.CUCUMBER_PLANT);
		event.getRegistry().register(ItemList.CUCUMBER_SEEDS);
		event.getRegistry().register(ItemList.CUCUMBER);
		event.getRegistry().register(ItemList.LETTUCE_PLANT);
		event.getRegistry().register(ItemList.LETTUCE_SEEDS);
		event.getRegistry().register(ItemList.LETTUCE);
		event.getRegistry().register(ItemList.ONION_PLANT);
		event.getRegistry().register(ItemList.ONION);
		event.getRegistry().register(ItemList.TOMATO_PLANT);
		event.getRegistry().register(ItemList.TOMATO_SEEDS);
		event.getRegistry().register(ItemList.TOMATO);
		event.getRegistry().register(ItemList.STRAWBERRY_PLANT);
		event.getRegistry().register(ItemList.STRAWBERRY_SEEDS);
		event.getRegistry().register(ItemList.STRAWBERRY);
		event.getRegistry().register(ItemList.SALT);
		event.getRegistry().register(ItemList.DOUGH);
		event.getRegistry().register(ItemList.COOKED_DOUGH);
		event.getRegistry().register(ItemList.CROUTON);
		event.getRegistry().register(ItemList.BUTTER);
		event.getRegistry().register(ItemList.CHEESE);
		event.getRegistry().register(ItemList.CHEESE_PUFF);
		event.getRegistry().register(ItemList.CHIPS);
		event.getRegistry().register(ItemList.SALTY_CHIPS);
		event.getRegistry().register(ItemList.SPICY_CHIPS);
		event.getRegistry().register(ItemList.ONION_RINGS);
		event.getRegistry().register(ItemList.CHEESY_BREAD);
		event.getRegistry().register(ItemList.POTATO_BREAD);
		event.getRegistry().register(ItemList.CORN_BREAD);
		event.getRegistry().register(ItemList.RICE_BREAD);
		event.getRegistry().register(ItemList.BAGUETTE);
		event.getRegistry().register(ItemList.FRIED_EGG);
		event.getRegistry().register(ItemList.PANCAKE);
		event.getRegistry().register(ItemList.WAFFLE);
		event.getRegistry().register(ItemList.MACARONI_AND_CHEESE);
		
		event.getRegistry().register(ItemList.SPAGHETTI);
		event.getRegistry().register(ItemList.ENCHILADA);
		event.getRegistry().register(ItemList.LASAGNE);
		event.getRegistry().register(ItemList.JAMBON_BEURRE);
		
		event.getRegistry().register(ItemList.FLESH);
		event.getRegistry().register(ItemList.HAM);
		event.getRegistry().register(ItemList.SAUSAGE);
		event.getRegistry().register(ItemList.BACON);
		event.getRegistry().register(ItemList.BEEF_JERKY);
		event.getRegistry().register(ItemList.GROUND_BEEF);
		event.getRegistry().register(ItemList.RAW_CHICKEN_WING);
		event.getRegistry().register(ItemList.COOKED_CHICKEN_WING);
		event.getRegistry().register(ItemList.SPICY_CHICKEN_WING);
		event.getRegistry().register(ItemList.BUCKET_OF_FRIED_CHICKEN);
		
		event.getRegistry().register(ItemList.TOP_BUN);
		event.getRegistry().register(ItemList.BOTTOM_BUN);
		event.getRegistry().register(ItemList.HAMBURGER);
		event.getRegistry().register(ItemList.CHICKENBURGER);
		event.getRegistry().register(ItemList.CHEESEBURGER);
		event.getRegistry().register(ItemList.HOT_DOG);
		event.getRegistry().register(ItemList.SAUSAGE_ROLL);
		event.getRegistry().register(ItemList.SLICE_OF_PIZZA);
		event.getRegistry().register(ItemList.TORTILLA);
		event.getRegistry().register(ItemList.TACO);
		event.getRegistry().register(ItemList.BURRITO);
		event.getRegistry().register(ItemList.KEBAB);
		
		event.getRegistry().register(ItemList.CHICKEN_SANDWICH);
		event.getRegistry().register(ItemList.BLT_SANDWICH);
		event.getRegistry().register(ItemList.BREAKFAST_SANDWICH);
		event.getRegistry().register(ItemList.GRILLED_CHEESE_SANDWICH);
		event.getRegistry().register(ItemList.ICE_CREAM_SANDWICH);
		
		event.getRegistry().register(ItemList.SEAWEED);
		event.getRegistry().register(ItemList.FUTOMAKI);
		event.getRegistry().register(ItemList.URAMAKI);
		event.getRegistry().register(ItemList.OSHIZUSHI);
		
		event.getRegistry().register(ItemList.BOWL);
		event.getRegistry().register(ItemList.GARDEN_SALAD);
		event.getRegistry().register(ItemList.CHICKEN_SALAD);
		event.getRegistry().register(ItemList.CAESAR_SALAD);
		event.getRegistry().register(ItemList.ONION_SALAD);
		event.getRegistry().register(ItemList.TACO_SALAD);
		
		event.getRegistry().register(ItemList.CUCUMBER_SOUP);
		event.getRegistry().register(ItemList.TOMATO_SOUP);
		event.getRegistry().register(ItemList.VEGETABLE_SOUP);
		event.getRegistry().register(ItemList.CHICKEN_SOUP);
		event.getRegistry().register(ItemList.BEEF_STEW);
		event.getRegistry().register(ItemList.PUMPKIN_STEW);
		
		event.getRegistry().register(ItemList.CARAMEL_APPLE);
		event.getRegistry().register(ItemList.MARSHMALLOW);
		event.getRegistry().register(ItemList.ROASTED_MARSHMALLOW);
		event.getRegistry().register(ItemList.CHOCOLATE_COOKIE);
		event.getRegistry().register(ItemList.VANILLA_COOKIE);
		event.getRegistry().register(ItemList.BROWNIE);
		event.getRegistry().register(ItemList.BOURBON_BISCUIT);
		event.getRegistry().register(ItemList.CHOCOLATE);
		event.getRegistry().register(ItemList.CHOCOLATE_ICE_CREAM_BALL);
		event.getRegistry().register(ItemList.VANILLA_ICE_CREAM_BALL);
		event.getRegistry().register(ItemList.STRAWBERRY_ICE_CREAM_BALL);
		event.getRegistry().register(ItemList.ICE_CREAM_CONE);
		event.getRegistry().register(ItemList.CHOCOLATE_ICE_CREAM);
		event.getRegistry().register(ItemList.VANILLA_ICE_CREAM);
		event.getRegistry().register(ItemList.STRAWBERRY_ICE_CREAM);
		event.getRegistry().register(ItemList.CRESCENT_ROLL);
		event.getRegistry().register(ItemList.DONUT);
		event.getRegistry().register(ItemList.SUGAR_DONUT);
		event.getRegistry().register(ItemList.CHOCOLATE_DONUT);
		event.getRegistry().register(ItemList.VANILLA_DONUT);
		
		event.getRegistry().register(ItemList.PAPER_CUP);
		event.getRegistry().register(ItemList.VANILLA_CUPCAKE);
		event.getRegistry().register(ItemList.CHOCOLATE_CUPCAKE);
		event.getRegistry().register(ItemList.CHOCOLATE_COOKIE_CUPCAKE);
		event.getRegistry().register(ItemList.STRAWBERRY_CUPCAKE);
		
		event.getRegistry().register(ItemList.PIE_SHELL);
		event.getRegistry().register(ItemList.APPLE_PIE);
		event.getRegistry().register(ItemList.GOLDEN_APPLE_PIE);
		event.getRegistry().register(ItemList.CHEESE_PIE);
		event.getRegistry().register(ItemList.CHICKEN_POT_PIE);
		event.getRegistry().register(ItemList.CHOCOLATE_PIE);
		event.getRegistry().register(ItemList.BACON_PIE);
		event.getRegistry().register(ItemList.FISH_PIE);
		event.getRegistry().register(ItemList.STRAWBERRY_PIE);
		
		event.getRegistry().register(ItemList.TOMATO_SAUCE);
		event.getRegistry().register(ItemList.HOT_SAUCE);
		event.getRegistry().register(ItemList.CHOCOLATE_SYRUP);
		event.getRegistry().register(ItemList.VANILLA_EXTRACT);
		event.getRegistry().register(ItemList.VANILLA_CREAM);
		
		event.getRegistry().register(ItemList.EMPTY_CAN);
		event.getRegistry().register(ItemList.SPEEDY_ENERGY_DRINK);
		event.getRegistry().register(ItemList.HEALTHY_ENERGY_DRINK);
		event.getRegistry().register(ItemList.STEALTHY_ENERGY_DRINK);
		event.getRegistry().register(ItemList.STRONG_ENERGY_DRINK);
		event.getRegistry().register(ItemList.DEADLY_ENERGY_DRINK);
		event.getRegistry().register(ItemList.SUPER_ENERGY_DRINK);
		event.getRegistry().register(ItemList.GLASS_MUG);
		event.getRegistry().register(ItemList.BEER);
		event.getRegistry().register(ItemList.COFFEE_CUP);
		event.getRegistry().register(ItemList.COFFEE);
		event.getRegistry().register(ItemList.CAPPUCCINO);
	}
  
}
