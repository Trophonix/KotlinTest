package com.trophonix.kotlintest

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.plugin.java.JavaPlugin

/**
 * Created by Lucas on 12/5/2016.
 */
class Liztener(val plugin : JavaPlugin) : Listener {

    init {
        plugin.server.pluginManager.registerEvents(this, plugin)
    }

    @EventHandler
    fun onChat(event: AsyncPlayerChatEvent) {
        if (event.message.toLowerCase().contains("hello, world")) { // This is even nicer than Lambda!
            Bukkit.getScheduler().runTaskLater(plugin, {
                event.player.sendMessage(ChatColor.BLUE.toString() + "Hello!")
            }, 1)
            event.player.sendMessage("Hello!")
        }
    }

}