package net.demonslayercosmetics.proxy;

import net.demonslayercosmetics.init.ItemInit;
import net.demonslayercosmetics.item.ItemArmor112;
import net.demonslayercosmetics.item.ItemSword112;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        registerModels();
    }

    private void registerModels() {
        ((ItemArmor112) ItemInit.BASIC_CAPE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.BASIC_HAORIE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.GENYA_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.GENYA_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.GENYA_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.GENYA_OUTFIT_LEGGINGS).registerModels();
        ((ItemArmor112) ItemInit.GIYU_HAORIE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.GIYU_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.GIYU_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.GIYU_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.GYOMEI_CAPE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.GYOMEI_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.GYOMEI_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.GYOMEI_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.GYOMEI_SHIRT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.HASHIRA_OUTFIT_2_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.HASHIRA_OUTFIT_3_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.HASHIRA_OUTFIT_4_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.HASHIRA_OUTFIT_5_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.HASHIRA_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.INOSUKE_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.INOSUKE_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.INOSUKE_OUTFIT_LEGGINGS).registerModels();
        ((ItemArmor112) ItemInit.KANAE_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.KANAE_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.KANAO_CAPE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.KANAO_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.KANAO_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.KANAO_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.KANAO_OUTFIT_LEGGINGS).registerModels();
        ((ItemArmor112) ItemInit.MITSURI_HAORIE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.MITSURI_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.MITSURI_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.MITSURI_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.MITSURI_OUTFIT_LEGGINGS).registerModels();
        ((ItemArmor112) ItemInit.MUICHIRO_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.MUICHIRO_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.MUICHIRO_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.MUICHIRO_OUTFIT_LEGGINGS).registerModels();
        ((ItemArmor112) ItemInit.OBANAI_HAORIE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.OBANAI_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.OBANAI_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.OBANAI_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.RENGOKU_CAPE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.RENGOKU_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.RENGOKU_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.RENGOKU_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.SANEMI_HAORIE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.SANEMI_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.SANEMI_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.SANEMI_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.SANEMI_SHIRT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.SHINOBU_HAORIE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.SHINOBU_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.SHINOBU_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.SHINOBU_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_BOOTS_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_OUTFIT_2_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_OUTFIT_2_LEGGINGS).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_OUTFIT_3_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_OUTFIT_3_LEGGINGS).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_OUTFIT_4_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_OUTFIT_4_LEGGINGS).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_OUTFIT_5_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_OUTFIT_5_LEGGINGS).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.STANDARD_OUTFIT_LEGGINGS).registerModels();
        ((ItemArmor112) ItemInit.TANJIRO_HAORIE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.TANJIRO_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.TANJIRO_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.TANJIRO_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.TENGEN_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.TENGEN_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.TENGEN_OUTFIT_HELMET).registerModels();
        ((ItemArmor112) ItemInit.ZENITSU_HAORIE_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.ZENITSU_OUTFIT_BOOTS).registerModels();
        ((ItemArmor112) ItemInit.ZENITSU_OUTFIT_CHESTPLATE).registerModels();
        ((ItemArmor112) ItemInit.ZENITSU_OUTFIT_HELMET).registerModels();
        ((ItemSword112) ItemInit.GENYA_SWORD).registerModels();
        ((ItemSword112) ItemInit.GIYU_SWORD).registerModels();
        ((ItemSword112) ItemInit.GYOMEI_AXE).registerModels();
        ((ItemSword112) ItemInit.GYOMEI_SPIKED_BALL).registerModels();
        ((ItemSword112) ItemInit.INOSUKE_SWORD).registerModels();
        ((ItemSword112) ItemInit.KANAE_SWORD).registerModels();
        ((ItemSword112) ItemInit.KANAO_SWORD).registerModels();
        ((ItemSword112) ItemInit.MITSURI_SWORD).registerModels();
        ((ItemSword112) ItemInit.MUICHIRO_SWORD).registerModels();
        ((ItemSword112) ItemInit.NICHIRIN_BLADE).registerModels();
        ((ItemSword112) ItemInit.OBANAI_SWORD).registerModels();
        ((ItemSword112) ItemInit.RENGOKU_SWORD).registerModels();
        ((ItemSword112) ItemInit.SANEMI_SWORD).registerModels();
        ((ItemSword112) ItemInit.SHINOBU_SWORD).registerModels();
        ((ItemSword112) ItemInit.TENGEN_SWORD).registerModels();
        ((ItemSword112) ItemInit.ZENITSU_SWORD).registerModels();
    }
}
