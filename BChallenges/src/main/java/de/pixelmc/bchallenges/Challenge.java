package de.pixelmc.bchallenges;

import de.pixelmc.bchallenges.commands.GamemodeCommand;
import de.pixelmc.bchallenges.listener.JoinListener;
import de.pixelmc.bchallenges.utils.Data;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Diese Datei wurde von Florian A. am 25.05.2021 erstellt.
 * Jede nutzung dieser Datei ist nur nach erlaubnis von Florian erlaubt.
 * Kontakt:
 * Discord: YyTFlo#6608
 * Email: yytflo.tw@gmail.com
 **/
public class Challenge extends JavaPlugin {
    private static Challenge instance;
    private Data data;

    public void onEnable() {
        instance = this;
        data = new Data();
        registerCommands();
        registerListener();
        Bukkit.getConsoleSender().sendMessage( getData().getMessegePrefix()+ "The Plugin was enabled! \nVersion: " + Bukkit.getPluginManager().getPlugin("Better-Challenges").getDescription().getVersion());
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage( getData().getMessegePrefix()+ "The Plugin was disabled! \nVersion: " + Bukkit.getPluginManager().getPlugin("Better-Challenges").getDescription().getVersion());
    }

    private void registerCommands() {
        Bukkit.getPluginCommand("gamemode").setExecutor(new GamemodeCommand());
    }

    private void registerListener() {
        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
    }

    //**getter**//

    public static Challenge getInstance() {
        return instance;
    }

    public Data getData() {
        return data;
    }
}
