package API;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatInterativo implements Listener {

    @EventHandler
    public void Chat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        e.setFormat(String.valueOf(p.getDisplayName()) + ChatColor.WHITE + " " + ChatColor.GRAY + e.getMessage().replace("%", "Porcento(s)"));
    }

}
