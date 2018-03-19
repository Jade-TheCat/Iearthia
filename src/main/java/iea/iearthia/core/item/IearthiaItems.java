package iea.iearthia.core.item;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IearthiaItems {
    @GameRegistry.ObjectHolder("iearthia-core:ingotenderite")
    public static ItemIngotEnderite ingotEnderite;

    @GameRegistry.ObjectHolder("iearthia-core:ingotnetherite")
    public static ItemIngotNetherite ingotNetherite;

    @GameRegistry.ObjectHolder("iearthia-core:gemenderite")
    public static ItemGemEnderite gemEnderite;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ingotEnderite.initModel();
        ingotNetherite.initModel();
        gemEnderite.initModel();
    }
}
