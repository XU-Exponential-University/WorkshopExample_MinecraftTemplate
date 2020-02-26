package com.xu.example.DeinPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

// Mit dieser Annotation sagen wir dem Server das dies hier ein neuer Command wird. 
// Der Parameter Name muss dem Befehl im Spiel entsprechen.
@org.bukkit.plugin.java.annotation.command.Command(name="Beispiel") 
public class BeispielCommand implements CommandExecutor {

    DeinPlugin plugin;

    public BeispielCommand(DeinPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        sender.sendMessage("Command erfolgreich ausgeführt!");
        return true;

    }
}
