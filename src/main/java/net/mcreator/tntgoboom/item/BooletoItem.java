
package net.mcreator.tntgoboom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class BooletoItem extends Item {
	public BooletoItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("booleto");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
