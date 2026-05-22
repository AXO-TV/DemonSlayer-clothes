# Demon Slayer Cosmetics - Minecraft 1.12.2 Port

Port du mod original **steelhngr's Demon Slayer Cosmetics** (1.20.1) vers Minecraft **1.12.2** avec Forge.

## Contenu

- **78 pièces d'armure cosmétiques** : tenues complètes de tous les Hashira et personnages principaux
- **16 armes** : Lames Nichirin de chaque personnage
- **1 matériau** : Lingot Nichirin

### Personnages inclus
Tanjiro, Zenitsu, Inosuke, Giyu, Shinobu, Rengoku, Tengen, Mitsuri, Muichiro, Obanai, Sanemi, Gyomei, Genya, Kanao, Kanae + uniformes génériques du Corps des Pourfendeurs

## Installation

1. Installer **Minecraft Forge 1.12.2** (version 14.23.5.2860 ou supérieure)
2. Placer le `.jar` compilé dans le dossier `mods/`
3. Lancer Minecraft

## Compilation depuis les sources

Prérequis : JDK 8, Gradle

```bash
./gradlew setupDecompWorkspace
./gradlew build
```

Le JAR compilé se trouvera dans `build/libs/`.

## Structure du projet

```
src/main/java/net/demonslayercosmetics/
  DemonSlayerCosmetics.java       - Classe principale du mod
  init/ItemInit.java              - Enregistrement des items
  item/ItemArmor112.java          - Classe armure cosmétique
  item/ItemSword112.java          - Classe épée cosmétique
  proxy/CommonProxy.java          - Proxy serveur
  proxy/ClientProxy.java          - Proxy client (enregistrement modèles)

src/main/resources/assets/demonslayercosmetics/
  textures/items/    - 94 textures d'icônes
  textures/armor/    - 2 textures d'armure (layer 1 & 2)
  models/item/       - 95 modèles JSON d'items
  lang/en_us.lang    - Traductions
```

## Crédits

- Textures originales : **steelhngrs / Kenneth** (mod 1.20.1)
- Licence : Academic Free License v3.0
