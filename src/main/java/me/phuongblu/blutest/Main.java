package me.phuongblu.blutest;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main main;
    private final ConfigFile config = new ConfigFile();

    public static Main getPlugin() {
        return Main.main;
    }

    public void onEnable() {
        config.createConfigFile();
    }
}
