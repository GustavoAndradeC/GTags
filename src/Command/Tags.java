package Command;

import API.API;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tags implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;

        if (commandSender.getName().equalsIgnoreCase("tags")) {
            String[] tags = {
                    "tag.dono", "tag.admin", "tag.gerente", "tag.mod+", "tag.mod", "tag.trial", "tag.helper",
                    "tag.builder+", "tag.builder", "tag.youtuber+", "tag.youtuber", "tag.spro", "tag.mvp",
                    "tag.pro", "tag.vip", "tag.normal"
            };

            for (String tag : tags) {
                if (commandSender.hasPermission(tag)) {
                    p.sendMessage(API.Prefix + ChatColor.GRAY + "Voce possui as tags: <tags>");
                    return true;
                }
            }

            p.sendMessage(API.Prefix + ChatColor.GRAY + "Voce nao possui nenhuma tag.");
            return true;
        }
        return false;
    }
}