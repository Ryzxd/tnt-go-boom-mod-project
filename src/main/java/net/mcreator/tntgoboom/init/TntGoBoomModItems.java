
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tntgoboom.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tntgoboom.item.SapphireSwordItem;
import net.mcreator.tntgoboom.item.SapphireShovelItem;
import net.mcreator.tntgoboom.item.SapphirePickaxeItem;
import net.mcreator.tntgoboom.item.SapphireItem;
import net.mcreator.tntgoboom.item.SapphireHoeItem;
import net.mcreator.tntgoboom.item.SapphireAxeItem;
import net.mcreator.tntgoboom.item.SapphireArmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TntGoBoomModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SAPPHIRE = register(new SapphireItem());
	public static final Item SAPPHIRE_ORE = register(TntGoBoomModBlocks.SAPPHIRE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SAPPHIRE_BLOCK = register(TntGoBoomModBlocks.SAPPHIRE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SAPPHIRE_PICKAXE = register(new SapphirePickaxeItem());
	public static final Item SAPPHIRE_AXE = register(new SapphireAxeItem());
	public static final Item SAPPHIRE_SWORD = register(new SapphireSwordItem());
	public static final Item SAPPHIRE_SHOVEL = register(new SapphireShovelItem());
	public static final Item SAPPHIRE_HOE = register(new SapphireHoeItem());
	public static final Item SAPPHIRE_ARMOR_HELMET = register(new SapphireArmorItem.Helmet());
	public static final Item SAPPHIRE_ARMOR_CHESTPLATE = register(new SapphireArmorItem.Chestplate());
	public static final Item SAPPHIRE_ARMOR_LEGGINGS = register(new SapphireArmorItem.Leggings());
	public static final Item SAPPHIRE_ARMOR_BOOTS = register(new SapphireArmorItem.Boots());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
