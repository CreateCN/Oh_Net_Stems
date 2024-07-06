
package io.github.createcn.ohnetstems.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetStemOreItem extends Item {
	public NetStemOreItem() {
		super(new Item.Properties().stacksTo(32).rarity(Rarity.COMMON));
	}
}
