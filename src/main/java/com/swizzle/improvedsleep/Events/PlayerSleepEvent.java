package com.swizzle.improvedsleep.Events;

import com.swizzle.improvedsleep.ImprovedSleep;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import java.util.*;

public class PlayerSleepEvent implements Listener {

    @EventHandler
    public void onPlayerSleep(PlayerBedEnterEvent e){
        if (e.getBedEnterResult().equals(PlayerBedEnterEvent.BedEnterResult.OK)){
            Bukkit.getScheduler().scheduleSyncDelayedTask(ImprovedSleep.getInstance(), new Runnable() {
                @Override
                public void run() {
                    e.getPlayer().getWorld().setTime(0);
                }
            }, 20L);
        }
    }
}