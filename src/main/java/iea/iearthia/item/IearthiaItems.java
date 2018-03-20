package iea.iearthia.item;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IearthiaItems {
    @GameRegistry.ObjectHolder("iearthia:ingotenderite")
    public static ItemIngotEnderite ingotEnderite;

    @GameRegistry.ObjectHolder("iearthia:ingotnetherite")
    public static ItemIngotNetherite ingotNetherite;

    @GameRegistry.ObjectHolder("iearthia:ingottitanium")
    public static ItemIngotTitanium ingotTitanium;

    @GameRegistry.ObjectHolder("iearthia:dustenderite")
    public static ItemDustEnderite dustEnderite;

    @GameRegistry.ObjectHolder("iearthia:dustnetherite")
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
