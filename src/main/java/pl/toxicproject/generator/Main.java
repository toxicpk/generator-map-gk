package pl.toxicproject.generator;

import org.bukkit.plugin.java.JavaPlugin;
import pl.toxicproject.generator.command.GenerateCommand;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Enabling...");
        getCommand("generate").setExecutor(new GenerateCommand());
    }

    @Override
    public void onDisable() {
        super.onDisable();
        System.out.println("Disabling...");
    }
}
