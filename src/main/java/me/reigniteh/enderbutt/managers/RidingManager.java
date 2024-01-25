package me.reigniteh.enderbutt.managers;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class RidingManager {

    public static RidingManager instance;

    public static final ArrayList<Player> ridingPlayers = new ArrayList<Player>();

    public RidingManager() {


        instance = this;

    }

    public static RidingManager getInstance() {

        return instance;

    }

}
