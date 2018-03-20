package iea.iearthia.item;

import iea.iearthia.util.Constants;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemIngotTitanium extends Item {
    public ItemIngotTitanium() {
        setRegistryName("ingottitanium");
        setUnlocalizedName(Constants.MODID + ".ingottitanium");
        setCreativeTab(CreativeTabs.MATERIALS);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
