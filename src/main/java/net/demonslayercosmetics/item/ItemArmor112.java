package net.demonslayercosmetics.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemArmor112 extends ItemArmor {

    private final String iconTexture;

    public ItemArmor112(String name, EntityEquipmentSlot slot, String iconTexture) {
        super(ArmorMaterial.DIAMOND, 0, slot);
        this.iconTexture = iconTexture;
        setRegistryName("demonslayercosmetics", name);
        setUnlocalizedName("demonslayercosmetics." + name);
        setCreativeTab(net.minecraft.creativetab.CreativeTabs.COMBAT);
    }

    @Override
    public String getArmorTexture(ItemStack stack, net.minecraft.entity.Entity entity, EntityEquipmentSlot slot, String type) {
        // Use the diamond armor texture as fallback since these are cosmetic items
        if (slot == EntityEquipmentSlot.LEGS) {
            return "demonslayercosmetics:textures/armor/diamond__layer_2.png";
        }
        return "demonslayercosmetics:textures/armor/diamond__layer_1.png";
    }

    @SideOnly(Side.CLIENT)
    public void registerModels() {
        ModelLoader.setCustomModelResourceLocation(this, 0,
            new ModelResourceLocation("demonslayercosmetics:" + iconTexture, "inventory"));
    }
}
