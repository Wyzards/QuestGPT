package com.Theeef.me;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class QuestGPT extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Start questing");
    }

}
