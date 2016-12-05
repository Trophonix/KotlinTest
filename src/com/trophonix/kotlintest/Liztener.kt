package com.trophonix.kotlintest

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.plugin.java.JavaPlugin

/**
 * Created by Lucas on 12/5/2016.
 */

class Liztener(plugin: JavaPlugin) : Listener {init {
    plugin.server.pluginManager.registerEvents(this, plugin)
}

    @EventHandler
    fun onChat(event : AsyncPlayerChatEvent) {
        if (event.message.toLowerCase().contains("hello, world")) {
            event.player.sendMessage("Hello!");
        }
    }

}