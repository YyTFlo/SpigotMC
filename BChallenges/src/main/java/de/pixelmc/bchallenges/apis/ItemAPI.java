package de.pixelmc.bchallenges.apis;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Diese Datei wurde von Florian A. am 25.05.2021 erstellt.
 * Jede nutzung dieser Datei ist nur nach erlaubnis von Florian erlaubt.
 * Kontakt:
 * Discord: YyTFlo#6608
 * Email: yytflo.tw@gmail.com
 **/
public class ItemAPI {

    public static ItemStack createItem(Material material, String name) {
        ItemStack itemStack = new ItemStack(material, 1);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setDisplayName(name);

        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

}
