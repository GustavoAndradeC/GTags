import API.ChatInterativo;
import Command.Tag;
import Command.Tags;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Main plugin;

    public static Main getPlugin() {
        return plugin;
    }
    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();
        RegisterEvents();
        RegisterCommand();
        Bukkit.getConsoleSender().sendMessage("       §3§lPlugin Ativado com sucesso");
        Bukkit.getConsoleSender().sendMessage("      §3§lTodas funcionalidades ativas");

    }

    public void RegisterEvents () {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new ChatInterativo(),this);
    }

    public void RegisterCommand () {
        getCommand("tags").setExecutor(new Tags());
        getCommand("tag").setExecutor(new Tag());
    }
}
