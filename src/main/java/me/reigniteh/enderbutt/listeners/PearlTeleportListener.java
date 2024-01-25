package me.reigniteh.enderbutt.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class PearlTeleportListener implements Listener {

    @EventHandler
    public void onPlayerTeleport(PlayerTeleportEvent e) {

        if(e.getCause() == PlayerTeleportEvent.TeleportCause.ENDER_PEARL) {

            e.setCancelled(true);

        }

    }

}
