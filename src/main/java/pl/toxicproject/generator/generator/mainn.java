package pl.toxicproject.generator.generator;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class mainn extends JavaPlugin {
    public void onEnable() {}

    public void onDisable() {}

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("generate"))
            mow.generateMap(player, Integer.parseInt(args[0]), Integer.parseInt(args[1]), Material.getMaterial(Integer.parseInt(args[2])));
        return false;
    }
}

