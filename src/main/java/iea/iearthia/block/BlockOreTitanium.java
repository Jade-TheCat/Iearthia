package iea.iearthia.block;

import iea.iearthia.util.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOreTitanium extends Block {
    public BlockOreTitanium() {
        super(Material.ROCK);
        setUnlocalizedName(Constants.MODID + ".oretitanium");
        setRegistryName("oretitanium");
        setCreativeTab(CreativeTabs.MATERIALS);
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
