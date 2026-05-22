package net.demonslayercosmetics.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSword112 extends ItemSword {

    private final String iconTexture;

    public ItemSword112(String name, String iconTexture) {
        super(ToolMaterial.DIAMOND);
        this.iconTexture = iconTexture;
        setRegistryName("demonslayercosmetics", name);
        setTranslationKey("demonslayercosmetics." + name);
        setCreativeTab(net.minecraft.creativetab.CreativeTabs.COMBAT);
    }

    @SideOnly(Side.CLIENT)
    public void registerModels() {
        ModelLoader.setCustomModelResourceLocation(this, 0,
            new ModelResourceLocation("demonslayercosmetics:" + iconTexture, "inventory"));
    }
}
