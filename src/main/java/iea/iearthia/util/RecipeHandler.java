package iea.iearthia.util;

import iea.iearthia.block.IearthiaBlocks;
import iea.iearthia.item.IearthiaItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
    public static void registerSmelting() {
        GameRegistry.addSmelting(new ItemStack(IearthiaItems.dustEnderite, 1), new ItemStack(IearthiaItems.ingotEnderite, 1), 10);
        GameRegistry.addSmelting(new ItemStack(IearthiaItems.dustNetherite, 1),new ItemStack(IearthiaItems.ingotNetherite, 1), 10);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(IearthiaBlocks.oreTitanium)), new ItemStack(IearthiaItems.ingotTitanium), 10);
    }
}
