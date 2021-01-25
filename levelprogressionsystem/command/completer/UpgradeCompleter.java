package com.ro11enteam.levelprogressionsystem.command.completer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class UpgradeCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (command.getName().equalsIgnoreCase("upgrade") ) {
            if (sender instanceof Player) {

                List<String> list = Arrays.asList("mining", "harvesting", "defense", "attack", "magic");

                return list;

            }
        }

        return null;
    }
}
