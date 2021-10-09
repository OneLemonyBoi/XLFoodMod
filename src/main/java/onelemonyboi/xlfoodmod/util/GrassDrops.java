package onelemonyboi.xlfoodmod.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import onelemonyboi.xlfoodmod.XLFoodMod;
import onelemonyboi.xlfoodmod.init.ItemList;

import java.util.concurrent.ThreadLocalRandom;

@EventBusSubscriber(modid = XLFoodMod.MOD_ID, bus = Bus.MOD)
public class GrassDrops {
    public static void onBlockBreakEvent(BlockEvent.BreakEvent event) {
        Block blockIn = event.getState().getBlock();
        if (blockIn == Blocks.GRASS) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 101);

            if (XLFoodMod.CONFIGURATION.enableGrass.get()) {
                switch (randomNum) {
                    case 1 -> empty(event.getPlayer().level, event.getPos(), ItemList.CORN_SEEDS);
                    case 2 -> empty(event.getPlayer().level, event.getPos(), ItemList.ONION);
                    case 3 -> empty(event.getPlayer().level, event.getPos(), ItemList.RICE);
                    case 4 -> empty(event.getPlayer().level, event.getPos(), ItemList.STRAWBERRY_SEEDS);
                    case 5 -> empty(event.getPlayer().level, event.getPos(), ItemList.CUCUMBER_SEEDS);
                    case 6 -> empty(event.getPlayer().level, event.getPos(), ItemList.LETTUCE_SEEDS);
                    case 7 -> empty(event.getPlayer().level, event.getPos(), ItemList.PEPPER_SEEDS);
                    case 8 -> empty(event.getPlayer().level, event.getPos(), ItemList.TOMATO_SEEDS);
                    case 9 -> empty(event.getPlayer().level, event.getPos(), ItemList.LEMON_SEEDS);
                    case 10 -> empty(event.getPlayer().level, event.getPos(), ItemList.PINEAPPLE_SEEDS);
                }
            }

            if (XLFoodMod.CONFIGURATION.enableVanilla.get()) {
                if (randomNum == 9) empty(event.getPlayer().level, event.getPos(), ItemList.VANILLA_FLOWER);
            }
        }
    }

    public static void empty(Level world, BlockPos pos, Item item) {
        if (!world.isClientSide) {
            float f = 0.7F;
            double d0 = (double) (world.random.nextFloat() * f) + (double) 0.15F;
            double d1 = (double) (world.random.nextFloat() * f) + (double) 0.060000002F + 0.6D;
            double d2 = (double) (world.random.nextFloat() * f) + (double) 0.15F;

            ItemEntity itemEntity = new ItemEntity(world, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(item));
            itemEntity.setDefaultPickUpDelay();
            world.addFreshEntity(itemEntity);
        }
    }
}
