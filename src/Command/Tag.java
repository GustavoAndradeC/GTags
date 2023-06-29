package Command;

import API.API;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tag implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (command.getName().equalsIgnoreCase("tag")) {
            if (strings.length == 0) {
                p.sendMessage(API.Prefix + ChatColor.GRAY + "Use /tag <tag>");
                return true;
            }

            String tagName = strings[0].toLowerCase();
            ChatColor tagColor = ChatColor.GRAY;

            if (tagName.equals("normal") && p.hasPermission("tag.normal")) {
                tagColor = ChatColor.GRAY;
            } else if (tagName.equals("vip") && p.hasPermission("tag.vip")) {
                tagColor = ChatColor.GREEN;
            } else if (tagName.equals("pro") && p.hasPermission("tag.pro")) {
                tagColor = ChatColor.GOLD;
            } else if (tagName.equals("mvp") && p.hasPermission("tag.mvp")) {
                tagColor = ChatColor.BLUE;
            } else if (tagName.equals("spro") && p.hasPermission("tag.spro")) {
                tagColor = ChatColor.YELLOW;
            } else if (tagName.equals("youtuber") && p.hasPermission("tag.youtuber")) {
                tagColor = ChatColor.AQUA;
            } else if (tagName.equals("youtuber+") && p.hasPermission("tag.youtuber+")) {
                tagColor = ChatColor.DARK_AQUA;
            } else if (tagName.equals("builder") && p.hasPermission("tag.builder")) {
                tagColor = ChatColor.YELLOW;
            } else if (tagName.equals("builder+") && p.hasPermission("tag.builder+")) {
                tagColor = ChatColor.GOLD;
            } else if (tagName.equals("helper") && p.hasPermission("tag.helper")) {
                tagColor = ChatColor.BLUE;
            } else if (tagName.equals("trial") && p.hasPermission("tag.trial")) {
                tagColor = ChatColor.LIGHT_PURPLE;
            } else if (tagName.equals("mod") && p.hasPermission("tag.mod")) {
                tagColor = ChatColor.DARK_PURPLE;
            } else if (tagName.equals("mod+") && p.hasPermission("tag.mod+")) {
                tagColor = ChatColor.DARK_PURPLE;
            } else if (tagName.equals("gerente") && p.hasPermission("tag.gerente")) {
                tagColor = ChatColor.RED;
            } else if (tagName.equals("admin") && p.hasPermission("tag.admin")) {
                tagColor = ChatColor.RED;
            } else if (tagName.equals("dono") && p.hasPermission("tag.dono")) {
                tagColor = ChatColor.DARK_RED;
            }

            if (tagColor != ChatColor.GRAY) {
                p.sendMessage(API.Prefix + ChatColor.GRAY + "Voce selecionou a tag: " + tagColor + ChatColor.BOLD + tagName.toUpperCase() + ChatColor.GRAY + "!");
                p.setCustomName(tagColor.toString() + ChatColor.BOLD + tagName.toUpperCase() + " " + tagColor + p.getName());
                p.setCustomNameVisible(true);
                p.setDisplayName(tagColor.toString() + ChatColor.BOLD + tagName.toUpperCase() + " " + tagColor + p.getName());
            } else {
                p.sendMessage(API.Prefix + ChatColor.RED + "Voce nao tem permissao para usar essa tag!");
            }
        }
        return false;
    }
}