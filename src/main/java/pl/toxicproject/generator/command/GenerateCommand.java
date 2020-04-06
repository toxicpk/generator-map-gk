package pl.toxicproject.generator.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.toxicproject.generator.generator.MapGenerator;

public class GenerateCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("generate"))
            MapGenerator.generateMap(player, Integer.parseInt(args[0]), Integer.parseInt(args[1]), Material.getMaterial(Integer.parseInt(args[2])));
        return false;
    }
}
