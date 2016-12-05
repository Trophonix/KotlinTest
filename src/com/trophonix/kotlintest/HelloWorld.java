package com.trophonix.kotlintest;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Lucas on 12/5/2016.
 */
public class HelloWorld extends JavaPlugin {

    @Override
    public void onEnable() {
        new Liztener(this);
    }

}
