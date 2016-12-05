package com.trophonix.kotlintest

import org.bukkit.plugin.java.JavaPlugin

/**
 * Created by Lucas on 12/5/2016.
 */
class Main : JavaPlugin() {

    override fun onEnable() {
        Liztener(this)
    }

}