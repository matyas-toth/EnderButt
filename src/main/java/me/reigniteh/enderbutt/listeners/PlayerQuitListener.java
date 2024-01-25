package me.reigniteh.enderbutt.listeners;

import me.reigniteh.enderbutt.managers.RidingManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {

        RidingManager.ridingPlayers.remove(e.getPlayer());

    }

    @EventHandler
    public void onPlayerKicked(PlayerKickEvent e) {

        RidingManager.ridingPlayers.remove(e.getPlayer());

    }

}
