package pl.demon.news;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;

import pl.demon.news.Main;

public class Config
{
	public static FileConfiguration cf;
    public static String news1;
    public static String news2;
    
   
    public static void loadConfiguration() {
        cf =  Main.getInstance().getConfig();
        news1 = cf.getString("news.tytul");
        news2 = cf.getString("news.podtytul");
        Main.info("Konfiguracja poprawnie zaladowana.");
        Main.getInstance().saveConfig();
    }
    }