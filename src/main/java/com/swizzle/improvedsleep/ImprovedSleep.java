package com.swizzle.improvedsleep;

import com.swizzle.improvedsleep.Events.PlayerSleepEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ImprovedSleep extends JavaPlugin {

    private static ImprovedSleep instance;

    @Override
    public void onEnable() {
        // Plugin startup logic

        instance = this;

        //Registering Events
        getServer().getPluginManager().registerEvents(new PlayerSleepEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static ImprovedSleep getInstance(){
        return instance;
    }
}
