package pl.demon.news;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import pl.demon.news.listener.NewsListener;

public class Main extends JavaPlugin {
    public static Main instance;
	public void onEnable() {
	    instance = this;
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        Config.loadConfiguration();
        final PluginDescriptionFile p = this.getDescription();
        if (!p.getName().contains("DemoN-News")) {
            System.out.println("[News] Wylaczanie pluginu z powodu edytowania pliku plugin.yml");
            Bukkit.getServer().getPluginManager().disablePlugin((Plugin)this);
        }
        if (!p.getAuthors().contains("_DemoNN_")) {
            System.out.println("[News] Wylaczanie pluginu z powodu edytowania pliku plugin.yml");
            Bukkit.getServer().getPluginManager().disablePlugin((Plugin)this);
        }
        Config.loadConfiguration();
    	this.getLogger().info("-----------------");
    	this.getLogger().info("Wlaczono DemoN-News");
    	this.getLogger().info("Wersja: 1.0");
    	this.getLogger().info("Autor: _DemoNN_");
    	this.getLogger().info("Web: demondev.pl");
    	this.getLogger().info("-------------------");
        Bukkit.getPluginManager().registerEvents((Listener)new NewsListener(), (Plugin)this);
        }
    public void onDisable() {
    	this.getLogger().info("[News] Wylaczanie pluginu...");
    }
	public static void info(String string) {
		// TODO Auto-generated method stub
		
	}
    public static Main getInstance() {
        return Main.instance;
    }

}
