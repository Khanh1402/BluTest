package me.phuongblu.blutest;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigFile {

    private static File file;
    private static FileConfiguration config;

    public void createConfigFile() {
        ConfigFile.file = new File(Main.getPlugin().getDataFolder(), ("config.yml"));
        if (!ConfigFile.file.exists()) {
            ConfigFile.file.getParentFile().mkdirs();
            Main.getPlugin().saveResource("config.yml", false);
        }

        ConfigFile.config = new YamlConfiguration();
        try {
            ConfigFile.config.load(ConfigFile.file);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
