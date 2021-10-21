package onelemonyboi.xlfoodmod.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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
                    case 1:
                        empty(event.getPlayer().level, event.getPos(), ItemList.CORN_SEEDS);
                        break;

                    case 2:
                        empty(event.getPlayer().level, event.getPos(), ItemList.ONION);
                        break;

                    case 3:
                        empty(event.getPlayer().level, event.getPos(), ItemList.RICE);
                        break;

                    case 4:
                        empty(event.getPlayer().level, event.getPos(), ItemList.STRAWBERRY_SEEDS);
                        break;

                    case 5:
                        empty(event.getPlayer().level, event.getPos(), ItemList.CUCUMBER_SEEDS);
                        break;

                    case 6:
                        empty(event.getPlayer().level, event.getPos(), ItemList.LETTUCE_SEEDS);
                        break;

                    case 7:
                        empty(event.getPlayer().level, event.getPos(), ItemList.PEPPER_SEEDS);
                        break;

                    case 8:
                        empty(event.getPlayer().level, event.getPos(), ItemList.TOMATO_SEEDS);
                        break;

                    case 9:
                        empty(event.getPlayer().level, event.getPos(), ItemList.LEMON_SEEDS);
                        break;

                    case 10:
                        empty(event.getPlayer().level, event.getPos(), ItemList.PINEAPPLE_SEEDS);
                        break;
                }
            }

            if (XLFoodMod.CONFIGURATION.enableVanilla.get()) {
                if (randomNum == 9) empty(event.getPlayer().level, event.getPos(), ItemList.VANILLA_FLOWER);
            }
        }
    }

    public static void empty(World world, BlockPos pos, Item item) {
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
