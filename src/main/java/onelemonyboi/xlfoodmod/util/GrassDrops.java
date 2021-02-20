package onelemonyboi.xlfoodmod.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import onelemonyboi.xlfoodmod.XLFoodMod;
import onelemonyboi.xlfoodmod.init.ItemList;
import onelemonyboi.xlfoodmod.world.Configs;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@EventBusSubscriber(modid = XLFoodMod.MOD_ID, bus = Bus.MOD)
public class GrassDrops {
    public static void onBlock(BlockEvent.BreakEvent event) {
        Block blockIn = event.getWorld().getBlockState(event.getPos()).getBlock();
        if (blockIn == Blocks.GRASS) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 41);
            if (Configs.enable_grass.get()) {
                if (randomNum == 1) {
                    empty(event.getPlayer().world, event.getPos(), ItemList.CORN_SEEDS);
                }
                if (randomNum == 2) {
                    empty(event.getPlayer().world, event.getPos(), ItemList.ONION);
                }
                if (randomNum == 3) {
                    empty(event.getPlayer().world, event.getPos(), ItemList.RICE);
                }
                if (randomNum == 4) {
                    empty(event.getPlayer().world, event.getPos(), ItemList.STRAWBERRY_SEEDS);
                }
                if (randomNum == 5) {
                    empty(event.getPlayer().world, event.getPos(), ItemList.CUCUMBER_SEEDS);
                }
                if (randomNum == 6) {
                    empty(event.getPlayer().world, event.getPos(), ItemList.LETTUCE_SEEDS);
                }
                if (randomNum == 7) {
                    empty(event.getPlayer().world, event.getPos(), ItemList.PEPPER_SEEDS);
                }
                if (randomNum == 8) {
                    empty(event.getPlayer().world, event.getPos(), ItemList.TOMATO_SEEDS);
                }
            }
            if (Configs.enable_vanilla.get()) {
                if (randomNum == 9) {
                    empty(event.getPlayer().world, event.getPos(), ItemList.VANILLA_FLOWER);
                }
            }
        }
    }

    public static BlockState empty(World world, BlockPos pos, Item item) {
        if (!world.isRemote) {
            float f = 0.7F;
            double d0 = (double) (world.rand.nextFloat() * f) + (double) 0.15F;
            double d1 = (double) (world.rand.nextFloat() * f) + (double) 0.060000002F + 0.6D;
            double d2 = (double) (world.rand.nextFloat() * f) + (double) 0.15F;
            ItemEntity itementity = new ItemEntity(world, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, new ItemStack(item));
            itementity.setDefaultPickupDelay();
            world.addEntity(itementity);
        }
    return null;
    }
}