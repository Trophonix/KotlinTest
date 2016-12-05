package com.trophonix.kotlintest

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin

/**
 * Created by Lucas on 12/5/2016.
 */
class Main : JavaPlugin() {

    override fun onEnable() {
        val listener = Liztener(this)
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (command.name == "hello") {
            sender.sendMessage(ChatColor.BLUE.toString() + "Hello!");
        }
        return true;
    }

}