package net.demonslayercosmetics.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMisc112 extends Item {

    private final String iconTexture;

    public ItemMisc112(String name, String iconTexture) {
        this.iconTexture = iconTexture;
        setRegistryName("demonslayercosmetics", name);
        setUnlocalizedName("demonslayercosmetics." + name);
        setCreativeTab(net.minecraft.creativetab.CreativeTabs.MISC);
    }

    @SideOnly(Side.CLIENT)
    public void registerModels() {
        ModelLoader.setCustomModelResourceLocation(this, 0,
            new ModelResourceLocation("demonslayercosmetics:" + iconTexture, "inventory"));
    }
}
