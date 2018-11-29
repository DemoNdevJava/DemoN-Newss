package pl.demon.news.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import pl.demon.news.Config;
import pl.demon.news.utils.Util;

public class NewsListener implements Listener
{
    @EventHandler
    public void JoinMessage(final PlayerJoinEvent event) {
        final Player p = event.getPlayer();
        {
        }
        Util.sendTitle(p, Util.fixChatColor(Config.news1));
        Util.sendSubTitle(p, Util.fixChatColor(Config.news2));
    }
}