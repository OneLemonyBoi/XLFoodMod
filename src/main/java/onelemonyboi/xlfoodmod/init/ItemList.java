package onelemonyboi.xlfoodmod.init;

import onelemonyboi.xlfoodmod.items.*;

public class ItemList {
	// Plants and Salt Ore
	public static net.minecraft.item.BlockItem ROCK_SALT = new BlockItems(BlockList.ROCK_SALT);
	public static net.minecraft.item.BlockItem VANILLA_FLOWER = new BlockItems(BlockList.VANILLA_FLOWER);
	public static net.minecraft.item.BlockItem RICE_PLANT = new BlockItems(BlockList.RICE_PLANT);
	public static net.minecraft.item.BlockItem PEPPER_PLANT = new BlockItems(BlockList.PEPPER_PLANT);
	public static net.minecraft.item.BlockItem CORN_PLANT = new BlockItems(BlockList.CORN_PLANT);
	public static net.minecraft.item.BlockItem CUCUMBER_PLANT = new BlockItems(BlockList.CUCUMBER_PLANT);
	public static net.minecraft.item.BlockItem LETTUCE_PLANT = new BlockItems(BlockList.LETTUCE_PLANT);
	public static net.minecraft.item.BlockItem ONION_PLANT = new BlockItems(BlockList.ONION_PLANT);
	public static net.minecraft.item.BlockItem TOMATO_PLANT = new BlockItems(BlockList.TOMATO_PLANT);
	public static net.minecraft.item.BlockItem STRAWBERRY_PLANT = new BlockItems(BlockList.STRAWBERRY_PLANT);
	public static net.minecraft.item.BlockItem LEMON_PLANT = new BlockItems(BlockList.LEMON_PLANT);
	public static net.minecraft.item.BlockItem PINEAPPLE_PLANT = new BlockItems(BlockList.PINEAPPLE_PLANT);

	// Cakes + Pizza
	public static net.minecraft.item.BlockItem CHOCOLATE_CAKE = new BlockItems(BlockList.CHOCOLATE_CAKE);
	public static net.minecraft.item.BlockItem CHOCOLATE_COOKIE_CAKE = new BlockItems(BlockList.CHOCOLATE_COOKIE_CAKE);
	public static net.minecraft.item.BlockItem CHEESE_CAKE = new BlockItems(BlockList.CHEESE_CAKE);
	public static net.minecraft.item.BlockItem NETHER_CAKE = new BlockItems(BlockList.NETHER_CAKE);
	public static net.minecraft.item.BlockItem STRAWBERRY_CAKE = new BlockItems(BlockList.STRAWBERRY_CAKE);
	public static net.minecraft.item.BlockItem PUMPKIN_CAKE = new BlockItems(BlockList.PUMPKIN_CAKE);
	public static net.minecraft.item.BlockItem PIZZA = new BlockItems(BlockList.PIZZA);

	// Inedible Ingredients
	public static net.minecraft.item.Item SEAWEED = new Items("seaweed");
	public static net.minecraft.item.Item BOWL = new Items("bowl");
	public static net.minecraft.item.Item COFFEE_CUP = new Items("coffee_cup");
	public static net.minecraft.item.Item GLASS_MUG = new Items("glass_mug");
	public static net.minecraft.item.Item CHOCOLATE_ICE_CREAM_BALL = new Items("chocolate_ice_cream_ball");
	public static net.minecraft.item.Item VANILLA_ICE_CREAM_BALL = new Items("vanilla_ice_cream_ball");
	public static net.minecraft.item.Item STRAWBERRY_ICE_CREAM_BALL = new Items("strawberry_ice_cream_ball");
	public static net.minecraft.item.Item TOMATO_SAUCE = new Items("tomato_sauce");
	public static net.minecraft.item.Item HOT_SAUCE = new Items("hot_sauce");
	public static net.minecraft.item.Item CHOCOLATE_SYRUP = new Items("chocolate_syrup");
	public static net.minecraft.item.Item VANILLA_EXTRACT = new Items("vanilla_extract");
	public static net.minecraft.item.Item VANILLA_CREAM = new Items("vanilla_cream");
	public static net.minecraft.item.Item EMPTY_CAN = new Items("empty_can");
	public static net.minecraft.item.Item PIE_SHELL = new Items("pie_shell");
	public static net.minecraft.item.Item PAPER_CUP = new Items("paper_cup");

	// Crop Outputs
	// TEMPLATE: public static net.minecraft.item.Item ITEMNAME = new ItemFood("name", 1, 0.6F);
	// TEMPLATE: public static net.minecraft.item.Item ITEMNAME = new ItemSeeds("name", BlockList.PLANTNAME);
	public static net.minecraft.item.Item RICE = new ItemSeedFood("rice", BlockList.RICE_PLANT, 1, 0.6F);
	public static net.minecraft.item.Item BUTTER_RICE = new ItemFood("butter_rice", 4, 0.6F);
	public static net.minecraft.item.Item FRIED_RICE = new ItemFood("fried_rice", 3, 0.6F);
	public static net.minecraft.item.Item PEPPER_SEEDS = new ItemSeeds("pepper_seeds", BlockList.PEPPER_PLANT);
	public static net.minecraft.item.Item PEPPER = new ItemFood("pepper", 1, 0.6F);
	public static net.minecraft.item.Item CORN_SEEDS = new ItemSeeds("corn_seeds", BlockList.CORN_PLANT);
	public static net.minecraft.item.Item RAW_CORN = new ItemFood("raw_corn", 1, 0.6F);
	public static net.minecraft.item.Item CORN = new ItemFood("corn", 1, 0.6F);
	public static net.minecraft.item.Item CUCUMBER_SEEDS = new ItemSeeds("cucumber_seeds", BlockList.CUCUMBER_PLANT);
	public static net.minecraft.item.Item CUCUMBER = new ItemFood("cucumber", 1, 0.6F);
	public static net.minecraft.item.Item LETTUCE_SEEDS = new ItemSeeds("lettuce_seeds", BlockList.LETTUCE_PLANT);
	public static net.minecraft.item.Item LETTUCE = new ItemFood("lettuce", 1, 0.6F);
	public static net.minecraft.item.Item ONION = new ItemSeedFood("onion", BlockList.ONION_PLANT, 1, 0.6F);
	public static net.minecraft.item.Item TOMATO_SEEDS = new ItemSeeds("tomato_seeds", BlockList.TOMATO_PLANT);
	public static net.minecraft.item.Item TOMATO = new ItemFood("tomato", 1, 0.6F);
	public static net.minecraft.item.Item STRAWBERRY_SEEDS = new ItemSeeds("strawberry_seeds", BlockList.STRAWBERRY_PLANT);
	public static net.minecraft.item.Item STRAWBERRY = new ItemFood("strawberry", 1, 0.6F);
	public static net.minecraft.item.Item LEMON = new ItemFood("lemon", 1, 0.6F);
	public static net.minecraft.item.Item PINEAPPLE = new ItemFood("pineapple", 1, 0.6F);
	public static net.minecraft.item.Item LEMON_SEEDS = new ItemSeeds("lemon_seeds", BlockList.LEMON_PLANT);
	public static net.minecraft.item.Item PINEAPPLE_SEEDS = new ItemSeeds("pineapple_seeds", BlockList.PINEAPPLE_PLANT);

	// Stuff that include dough + Salt
	public static net.minecraft.item.Item SALT = new ItemFood("salt", 0, 0.2F);
	public static net.minecraft.item.Item DOUGH = new ItemFood("dough", 1, 0.6F);
	public static net.minecraft.item.Item COOKED_DOUGH = new ItemFood("cooked_dough", 2, 1.2F);
	public static net.minecraft.item.Item CROUTON = new ItemFood("crouton", 1, 1.2F);
	public static net.minecraft.item.Item BUTTER = new ItemFood("butter", 1, 0.6F);
	public static net.minecraft.item.Item CHEESE = new ItemFood("cheese", 1, 0.6F);
	public static net.minecraft.item.Item CHEESE_PUFF = new ItemFood("cheese_puff", 1, 0.6F);
	public static net.minecraft.item.Item CHIPS = new ItemFood("chips", 1, 0.6F);
	public static net.minecraft.item.Item SALTY_CHIPS = new ItemFood("salty_chips", 1, 1.2F);
	public static net.minecraft.item.Item SPICY_CHIPS = new ItemFood("spicy_chips", 1, 1.2F);
	public static net.minecraft.item.Item ONION_RINGS = new ItemFood("onion_rings", 2, 1.2F);
	public static net.minecraft.item.Item CHEESY_BREAD = new ItemFood("cheesy_bread", 6, 0.6F);
	public static net.minecraft.item.Item POTATO_BREAD = new ItemFood("potato_bread", 6, 0.6F);
	public static net.minecraft.item.Item CORN_BREAD = new ItemFood("corn_bread", 8, 0.6F);
	public static net.minecraft.item.Item RICE_BREAD = new ItemFood("rice_bread", 5, 0.6F);
	public static net.minecraft.item.Item BAGUETTE = new ItemFood("baguette", 5, 0.6F);
	public static net.minecraft.item.Item FRIED_EGG = new ItemFood("fried_egg", 3, 0.6F);
	public static net.minecraft.item.Item PANCAKE = new ItemFood("pancake", 5, 0.6F);
	public static net.minecraft.item.Item WAFFLE = new ItemFood("waffle", 5, 0.6F);
	public static net.minecraft.item.Item MACARONI_AND_CHEESE = new BowlItem("macaroni_and_cheese", 9, 0.6F);

	// International Foods
	public static net.minecraft.item.Item SPAGHETTI = new BowlItem("spaghetti", 9, 0.6F);
	public static net.minecraft.item.Item ENCHILADA = new ItemFood("enchilada", 9, 0.6F);
	public static net.minecraft.item.Item LASAGNE = new ItemFood("lasagne", 12, 0.6F);
	public static net.minecraft.item.Item JAMBON_BEURRE = new ItemFood("jambon_beurre", 15, 0.4F);

	// Meats
	public static net.minecraft.item.Item FLESH = new ItemFood("flesh", 4, 0.2F);
	public static net.minecraft.item.Item HAM = new ItemFood("ham", 4, 0.6F);
	public static net.minecraft.item.Item SAUSAGE = new ItemFood("sausage", 3, 1.2F);
	public static net.minecraft.item.Item BACON = new ItemFood("bacon", 3, 1.2F);
	public static net.minecraft.item.Item BEEF_JERKY = new ItemFood("beef_jerky", 3, 0.6F);
	public static net.minecraft.item.Item GROUND_BEEF = new ItemFood("ground_beef", 4, 1.2F);
	public static net.minecraft.item.Item RAW_CHICKEN_WING = new ItemFood("raw_chicken_wing", 1, 0.6F);
	public static net.minecraft.item.Item COOKED_CHICKEN_WING = new ItemFood("cooked_chicken_wing", 4, 1.2F);
	public static net.minecraft.item.Item SPICY_CHICKEN_WING = new ItemFood("spicy_chicken_wing", 4, 1.4F);
	public static net.minecraft.item.Item BUCKET_OF_FRIED_CHICKEN = new BucketOfFriedChickenItem("bucket_of_fried_chicken", 6, 0.6F);
	
	public static net.minecraft.item.Item TOP_BUN = new ItemFood("top_bun", 4, 0.6F);
	public static net.minecraft.item.Item BOTTOM_BUN = new ItemFood("bottom_bun", 4, 0.6F);
	public static net.minecraft.item.Item HAMBURGER = new ItemFood("hamburger", 9, 0.6F);
	public static net.minecraft.item.Item CHICKENBURGER = new ItemFood("chickenburger", 9, 0.6F);
	public static net.minecraft.item.Item CHEESEBURGER = new ItemFood("cheeseburger", 10, 0.6F);
	public static net.minecraft.item.Item HOT_DOG = new ItemFood("hot_dog", 8, 0.6F);
	public static net.minecraft.item.Item SAUSAGE_ROLL = new ItemFood("sausage_roll", 7, 0.6F);
	public static net.minecraft.item.Item SLICE_OF_PIZZA = new ItemFood("slice_of_pizza", 7, 0.6F);
	public static net.minecraft.item.Item TORTILLA = new ItemFood("tortilla", 4, 0.6F);
	public static net.minecraft.item.Item TACO = new ItemFood("taco", 7, 0.6F);
	public static net.minecraft.item.Item BURRITO = new ItemFood("burrito", 7, 0.6F);
	public static net.minecraft.item.Item KEBAB = new ItemFood("kebab", 12, 0.4F);

	// Sandwiches
	public static net.minecraft.item.Item CHICKEN_SANDWICH = new ItemFood("chicken_sandwich", 10, 0.6F);
	public static net.minecraft.item.Item BLT_SANDWICH = new ItemFood("blt_sandwich", 12, 0.4F);
	public static net.minecraft.item.Item BREAKFAST_SANDWICH = new ItemFood("breakfast_sandwich", 8, 0.6F);
	public static net.minecraft.item.Item GRILLED_CHEESE_SANDWICH = new ItemFood("grilled_cheese_sandwich", 11, 0.4F);
	public static net.minecraft.item.Item ICE_CREAM_SANDWICH = new ItemFood("ice_cream_sandwich", 6, 0.6F);

	// Sushi
	public static net.minecraft.item.Item FUTOMAKI = new ItemFood("futomaki", 4, 0.6F);
	public static net.minecraft.item.Item URAMAKI = new ItemFood("uramaki", 9, 0.4F);
	public static net.minecraft.item.Item OSHIZUSHI = new ItemFood("oshizushi", 12, 0.2F);

	// Salads
	public static net.minecraft.item.Item GARDEN_SALAD = new BowlItem("garden_salad", 5, 0.6F);
	public static net.minecraft.item.Item CHICKEN_SALAD = new BowlItem("chicken_salad", 8, 0.6F);
	public static net.minecraft.item.Item CAESAR_SALAD = new BowlItem("caesar_salad", 6, 0.6F);
	public static net.minecraft.item.Item ONION_SALAD = new BowlItem("onion_salad", 4, 0.6F);
	public static net.minecraft.item.Item TACO_SALAD = new BowlItem("taco_salad", 10, 0.6F);

	// Soups and Stews
	public static net.minecraft.item.Item CUCUMBER_SOUP = new BowlItem("cucumber_soup", 6, 0.6F);
	public static net.minecraft.item.Item TOMATO_SOUP = new BowlItem("tomato_soup", 3, 0.6F);
	public static net.minecraft.item.Item VEGETABLE_SOUP = new BowlItem("vegetable_soup", 8, 0.6F);
	public static net.minecraft.item.Item CHICKEN_SOUP = new BowlItem("chicken_soup", 10, 0.6F);
	public static net.minecraft.item.Item BEEF_STEW = new BowlItem("beef_stew", 12, 0.6F);
	public static net.minecraft.item.Item PUMPKIN_STEW = new ItemFood("pumpkin_stew", 6, 0.6F);

	// Desserts
	public static net.minecraft.item.Item CARAMEL_APPLE = new ItemFood("caramel_apple", 6, 0.6F);
	public static net.minecraft.item.Item MARSHMALLOW = new ItemFood("marshmallow", 1, 0.6F);
	public static net.minecraft.item.Item ROASTED_MARSHMALLOW = new ItemFood("roasted_marshmallow", 2, 0.6F);
	public static net.minecraft.item.Item CHOCOLATE_COOKIE = new ItemFood("chocolate_cookie", 3, 0.6F);
	public static net.minecraft.item.Item VANILLA_COOKIE = new ItemFood("vanilla_cookie", 4, 0.6F);
	public static net.minecraft.item.Item BROWNIE = new ItemFood("brownie", 3, 0.6F);
	public static net.minecraft.item.Item BOURBON_BISCUIT = new ItemFood("bourbon_biscuit", 3, 0.6F);
	public static net.minecraft.item.Item CHOCOLATE = new ItemFood("chocolate", 1, 0.6F);
	public static net.minecraft.item.Item ICE_CREAM_CONE = new ItemFood("ice_cream_cone", 3, 1.2F);
	public static net.minecraft.item.Item CHOCOLATE_ICE_CREAM = new ItemFood("chocolate_ice_cream", 4, 0.6F);
	public static net.minecraft.item.Item VANILLA_ICE_CREAM = new ItemFood("vanilla_ice_cream", 4, 0.6F);
	public static net.minecraft.item.Item STRAWBERRY_ICE_CREAM = new ItemFood("strawberry_ice_cream", 4, 0.6F);
	public static net.minecraft.item.Item CRESCENT_ROLL = new ItemFood("crescent_roll", 6, 0.6F);
	public static net.minecraft.item.Item DONUT = new ItemFood("donut", 4, 0.6F);
	public static net.minecraft.item.Item SUGAR_DONUT = new ItemFood("sugar_donut", 5, 0.6F);
	public static net.minecraft.item.Item CHOCOLATE_DONUT = new ItemFood("chocolate_donut", 5, 0.6F);
	public static net.minecraft.item.Item VANILLA_DONUT = new ItemFood("vanilla_donut", 5, 0.6F);

	// Cupcakes
	public static net.minecraft.item.Item VANILLA_CUPCAKE = new ItemFood("vanilla_cupcake", 2, 0.6F);
	public static net.minecraft.item.Item CHOCOLATE_CUPCAKE = new ItemFood("chocolate_cupcake", 3, 0.6F);
	public static net.minecraft.item.Item CHOCOLATE_COOKIE_CUPCAKE = new ItemFood("chocolate_cookie_cupcake", 5, 0.6F);
	public static net.minecraft.item.Item STRAWBERRY_CUPCAKE = new ItemFood("strawberry_cupcake", 3, 0.6F);

	// Pies
	public static net.minecraft.item.Item APPLE_PIE = new ItemFood("apple_pie", 8, 0.6F);
	public static net.minecraft.item.Item GOLDEN_APPLE_PIE = new ItemFood("golden_apple_pie", 8, 0.6F);
	public static net.minecraft.item.Item CHEESE_PIE = new ItemFood("cheese_pie", 8, 0.6F);
	public static net.minecraft.item.Item CHICKEN_POT_PIE = new ItemFood("chicken_pot_pie", 8, 0.6F);
	public static net.minecraft.item.Item CHOCOLATE_PIE = new ItemFood("chocolate_pie", 8, 0.6F);
	public static net.minecraft.item.Item BACON_PIE = new ItemFood("bacon_pie", 8, 0.6F);
	public static net.minecraft.item.Item FISH_PIE = new ItemFood("fish_pie", 8, 0.6F);
	public static net.minecraft.item.Item STRAWBERRY_PIE = new ItemFood("strawberry_pie", 8, 0.6F);

	// Drinks
	public static net.minecraft.item.Item SPEEDY_ENERGY_DRINK = new SpeedyEnergyDrinkItem("speedy_energy_drink", 0, 0.0F);
    public static net.minecraft.item.Item HEALTHY_ENERGY_DRINK = new HealthyEnergyDrinkItem("healthy_energy_drink", 0, 0.0F);
    public static net.minecraft.item.Item STEALTHY_ENERGY_DRINK = new StealthyEnergyDrinkItem("stealthy_energy_drink", 0, 0.0F);
    public static net.minecraft.item.Item STRONG_ENERGY_DRINK = new StrongEnergyDrinkItem("strong_energy_drink", 0, 0.0F);
	public static net.minecraft.item.Item DEADLY_ENERGY_DRINK = new DeadlyEnergyDrinkItem("deadly_energy_drink", 0, 0.0F);
	public static net.minecraft.item.Item SUPER_ENERGY_DRINK = new SuperEnergyDrinkItem("super_energy_drink", 10, 10F);
	public static net.minecraft.item.Item BEER = new BeerItem("beer", 4, 0.2F);
	public static net.minecraft.item.Item COFFEE = new CoffeeItem("coffee", 2, 40F);
	public static net.minecraft.item.Item CAPPUCCINO = new CappucinoItem("cappuccino", 4, 60F);
	public static net.minecraft.item.Item LEMON_JUICE = new JuiceItem("lemon_juice", 2, 0.2F, net.minecraft.item.Items.GLASS_BOTTLE);
	public static net.minecraft.item.Item STRAWBERRY_JUICE = new JuiceItem("strawberry_juice", 2, 0.2F, net.minecraft.item.Items.GLASS_BOTTLE);
	public static net.minecraft.item.Item PINEAPPLE_JUICE = new JuiceItem("pineapple_juice", 2, 0.2F, net.minecraft.item.Items.GLASS_BOTTLE);
	public static net.minecraft.item.Item LEMON_SYRUP = new JuiceItem("lemon_syrup", 2, 0.2F, net.minecraft.item.Items.GLASS_BOTTLE);
	public static net.minecraft.item.Item STRAWBERRY_SYRUP = new JuiceItem("strawberry_syrup", 2, 0.2F, net.minecraft.item.Items.GLASS_BOTTLE);
	public static net.minecraft.item.Item PINEAPPLE_SYRUP = new JuiceItem("pineapple_syrup", 2, 0.2F, net.minecraft.item.Items.GLASS_BOTTLE);
	public static net.minecraft.item.Item LEMON_SLUSHIE = new JuiceItem("lemon_slushie", 3, 0.4F, net.minecraft.item.Items.GLASS_BOTTLE);
	public static net.minecraft.item.Item STRAWBERRY_SLUSHIE = new JuiceItem("strawberry_slushie", 3, 0.4F, net.minecraft.item.Items.GLASS_BOTTLE);
	public static net.minecraft.item.Item PINEAPPLE_SLUSHIE = new JuiceItem("pineapple_slushie", 3, 0.4F, net.minecraft.item.Items.GLASS_BOTTLE);

}
