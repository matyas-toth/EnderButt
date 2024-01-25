package me.reigniteh.enderbutt.listeners;

import org.bukkit.Material;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PearlClickListener implements Listener {

    @EventHandler
    public void onPlayerClick(PlayerInteractEvent e) {

        Player p = e.getPlayer();

        if ((e.getAction() == Action.RIGHT_CLICK_BLOCK)||(e.getAction() == Action.RIGHT_CLICK_AIR)||(e.getAction() == Action.LEFT_CLICK_BLOCK)||(e.getAction() == Action.LEFT_CLICK_AIR)) {

            if(p.getItemInHand().getType() == Material.ENDER_PEARL) {

                e.setCancelled(true);
                EnderPearl ep = p.launchProjectile(EnderPearl.class);

            }

        }

    }

}
