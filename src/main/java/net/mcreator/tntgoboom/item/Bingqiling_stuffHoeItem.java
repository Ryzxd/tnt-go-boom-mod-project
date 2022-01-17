
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class Bingqiling_stuffHoeItem extends HoeItem {
	public Bingqiling_stuffHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1741;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 56;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TntGoBoomModItems.BINGQILING_STUFF_INGOT));
			}
		},

				0, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));

		setRegistryName("bingqiling_stuff_hoe");
	}

}
