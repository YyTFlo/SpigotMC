package de.pixelmc.bchallenges.commands;

import de.pixelmc.bchallenges.Challenge;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Diese Datei wurde von Florian A. am 25.05.2021 erstellt.
 * Jede nutzung dieser Datei ist nur nach erlaubnis von Florian erlaubt.
 * Kontakt:
 * Discord: YyTFlo#6608
 * Email: yytflo.tw@gmail.com
 **/
public class GamemodeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(!(commandSender instanceof Player)) {
            commandSender.sendMessage(Challenge.getInstance().getData().getMessegePrefix() + "The Console are not alowed to use any Commands!");
            return true;
        }

        Player player = (Player) commandSender;

        if(!(player.hasPermission("bchallenge.gamemode") || player.isOp())) {
            player.sendMessage(Challenge.getInstance().getData().getMessegePrefix() + "You do not have the permmission to execute this Command!");
            return true;
        }

        if(strings.length!=2) {
            player.sendMessage(Challenge.getInstance().getData().getMessegePrefix() + "Use: /gm <0/1/2/3>");
            return true;
        }

        if(strings[1].equalsIgnoreCase("1") || strings[1].equalsIgnoreCase("creative")) {
            player.setGameMode(GameMode.CREATIVE);
            return true;
        }

        if(strings[1].equalsIgnoreCase("0") || strings[1].equalsIgnoreCase("survival")) {
            player.setGameMode(GameMode.SURVIVAL);
            return true;
        }

        if(strings[1].equalsIgnoreCase("2") || strings[1].equalsIgnoreCase("adventure")) {
            player.setGameMode(GameMode.ADVENTURE);
            return true;
        }

        if(strings[1].equalsIgnoreCase("3") || strings[1].equalsIgnoreCase("spectator")) {
            player.setGameMode(GameMode.SPECTATOR);
            return true;
        }

        return false;
    }
}
