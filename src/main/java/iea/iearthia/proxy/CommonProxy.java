package iea.iearthia.proxy;

import iea.iearthia.block.BlockOreTitanium;
import iea.iearthia.block.IearthiaBlocks;
import iea.iearthia.item.*;
import iea.iearthia.util.RecipeHandler;
import iea.iearthia.world.WorldGenOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {
        RecipeHandler.registerSmelting();
        GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockOreTitanium());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemIngotEnderite());
        event.getRegistry().register(new ItemIngotNetherite());
        event.getRegistry().register(new ItemDustEnderite());
        event.getRegistry().register(new ItemDustNetherite());
        event.getRegistry().register(new ItemIngotTitanium());
        event.getRegistry().register(new ItemBlock(IearthiaBlocks.oreTitanium).setRegistryName(IearthiaBlocks.oreTitanium.getRegistryName()));
    }
}
