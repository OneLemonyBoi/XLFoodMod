package onelemonyboi.xlfoodmod.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import onelemonyboi.xlfoodmod.XLFoodMod;
import onelemonyboi.xlfoodmod.init.ItemList;
import onelemonyboi.xlfoodmod.world.Configs;
import java.util.concurrent.ThreadLocalRandom;

@EventBusSubscriber(modid = XLFoodMod.MOD_ID, bus = Bus.MOD)
public class GrassDrops {
    public static void onBlock(BlockEvent.BreakEvent event) {
        Block blockIn = event.getWorld().getBlockState(event.getPos()).getBlock();
        if (blockIn == Blocks.GRASS) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
            if (Configs.enable_grass.get()) {
                if (randomNum == 1) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.CORN_SEEDS);
                }
                if (randomNum == 2) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.ONION);
                }
                if (randomNum == 3) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.RICE);
                }
                if (randomNum == 4) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.STRAWBERRY_SEEDS);
                }
                if (randomNum == 5) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.CUCUMBER_SEEDS);
                }
                if (randomNum == 6) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.LETTUCE_SEEDS);
                }
                if (randomNum == 7) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.PEPPER_SEEDS);
                }
                if (randomNum == 8) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.TOMATO_SEEDS);
                }
                if (randomNum == 9) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.LEMON_SEEDS);
                }
                if (randomNum == 10) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.PINEAPPLE_SEEDS);
                }
            }
            if (Configs.enable_vanilla.get()) {
                if (randomNum == 9) {
                    empty(event.getPlayer().level, event.getPos(), ItemList.VANILLA_FLOWER);
                }
            }
        }
    }

    public static BlockState empty(Level world, BlockPos pos, Item item) {
        if (!world.isClientSide) {
            float f = 0.7F;
            double d0 = (double) (world.random.nextFloat() * f) + (double) 0.15F;
            double d1 = (double) (world.random.nextFloat() * f) + (double) 0.060000002F + 0.6D;
            double d2 = (double) (world.random.nextFloat() * f) + (double) 0.15F;
            ItemEntity itementity = new ItemEntity(world, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(item));
            itementity.setDefaultPickUpDelay();
            world.addFreshEntity(itementity);
        }
    return null;
    }
}