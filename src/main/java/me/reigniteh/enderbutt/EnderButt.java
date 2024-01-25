package me.reigniteh.enderbutt;

import me.reigniteh.enderbutt.listeners.PearlClickListener;
import me.reigniteh.enderbutt.listeners.PearlTeleportListener;
import me.reigniteh.enderbutt.listeners.PearlThrowListener;
import me.reigniteh.enderbutt.listeners.PlayerQuitListener;
import me.reigniteh.enderbutt.managers.RidingManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderButt extends JavaPlugin {

    public static EnderButt instance;
    public static RidingManager ridingManager;

    @Override
    public void onEnable() {
        instance = this;
        ridingManager = new RidingManager();

        this.getServer().getPluginManager().registerEvents(new PearlClickListener(), this);
        this.getServer().getPluginManager().registerEvents(new PearlThrowListener(), this);
        this.getServer().getPluginManager().registerEvents(new PearlTeleportListener(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerQuitListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public EnderButt getInstance() {

        return instance;

    }
}
