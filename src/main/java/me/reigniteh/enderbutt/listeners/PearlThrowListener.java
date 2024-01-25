package me.reigniteh.enderbutt.listeners;

import me.reigniteh.enderbutt.managers.RidingManager;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.spigotmc.event.entity.EntityDismountEvent;

public class PearlThrowListener implements Listener {

    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent e) {

        if(!(e.getEntity().getShooter() instanceof Player)) { return; }

        Player p = (Player) e.getEntity().getShooter();

        if(!(e.getEntity() instanceof EnderPearl)) { return; }
        if(!p.hasPermission("enderbutt.use")) { e.setCancelled(true); return; }

        e.getEntity().addPassenger(p);
        RidingManager.ridingPlayers.add(p);

    }

    @EventHandler
    public void onDismount(EntityDismountEvent e) {

        if(!(e.getEntity() instanceof Player)) { return; }

        Player p = (Player) e.getEntity();

        if(!(e.getDismounted() instanceof EnderPearl)) { return; }

        if(RidingManager.ridingPlayers.contains(p)) {

            e.getDismounted().remove();
            RidingManager.ridingPlayers.remove(p);

        }

    }

}
