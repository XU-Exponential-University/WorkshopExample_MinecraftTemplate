package com.xu.example.DeinPlugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;

@Plugin(name="DeinErstesPlugin", version="1.0")
@ApiVersion(ApiVersion.Target.DEFAULT)
public class DeinPlugin extends JavaPlugin {

    final BeispielJoinListener playerJoinListener = new BeispielJoinListener();

    @Override
    public void onDisable() {

        // Wird ausgeführt wenn das Plugin deaktiviert wird (zum Beispiel bei einem Reload oder einem Neustart)

    }

    @Override
    public void onEnable() {

        // Wird ausgeführt wenn das Plugin aktiviert wird (zum Beispiel beim Start des Servers)

        // Hier teilen wir den Server mit das es ab jetzt auf einen neuen Command reagieren soll. So kann dieser zum Beispiel von der automatischen Vervollständigung erkannt werden.
        getCommand("beispiel").setExecutor(new BeispielCommand(this));

        // Hier teilen wir dem Server unsere erstellten Listener mit
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(playerJoinListener, this);

    }

}
