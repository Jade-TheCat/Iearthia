package iea.iearthia.core.item;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IearthiaItems {
    @GameRegistry.ObjectHolder("iearthia-core:ingotenderite")
    public static ItemIngotEnderite ingotEnderite;

    @GameRegistry.ObjectHolder("iearthia-core:ingotnetherite")
    public static ItemIngotNetherite ingotNetherite;

    @GameRegistry.ObjectHolder("iearthia-core:ingottitanium")
    public static ItemIngotTitanium ingotTitanium;

    @GameRegistry.ObjectHolder("iearthia-core:dustenderite")
    public static ItemDustEnderite dustEnderite;

    @GameRegistry.ObjectHolder("iearthia-core:dustnetherite")
    public static ItemDustNetherite dustNetherite;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ingotEnderite.initModel();
        ingotNetherite.initModel();
        ingotTitanium.initModel();
        dustEnderite.initModel();
        dustNetherite.initModel();
    }
}
