package eu.jxstcolin.main;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class MCLandsBanSystem extends Plugin {

    @Override
    public void onEnable() {
        register();

        ProxyServer.getInstance().getLogger().info("Das Plugin wurde aktiviert.");
    }

    public void register(){

    }

    @Override
    public void onDisable() {
        ProxyServer.getInstance().getLogger().info("Das Plugin wurde deaktiviert.");
    }
}
