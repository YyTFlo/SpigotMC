package de.pixelmc.bchallenges.listener;

import de.pixelmc.bchallenges.Challenge;
import de.pixelmc.bchallenges.apis.ItemAPI;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Diese Datei wurde von Florian A. am 25.05.2021 erstellt.
 * Jede nutzung dieser Datei ist nur nach erlaubnis von Florian erlaubt.
 * Kontakt:
 * Discord: YyTFlo#6608
 * Email: yytflo.tw@gmail.com
 **/
public class JoinListener implements Listener {

    @EventHandler
    public void handle(PlayerJoinEvent event) {
        event.setJoinMessage(Challenge.getInstance().getData().getMessegePrefix() + event.getPlayer().getName() + " joined the Chellenge!");

        if(event.getPlayer().hasPermission("bchellegne.settings")) {
            event.getPlayer().getInventory().addItem(ItemAPI.createItem(Material.COMPASS, "§8» §6Settings"));
        }

    }

}
