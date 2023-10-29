package net.racialgamer.smallpop.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

import static me.shedaniel.autoconfig.AutoConfig.getConfigHolder;


@Config(name = "smallpop")
public class Gui implements ConfigData {

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.BoundedDiscrete(min = -2, max = 2)
    @ConfigEntry.Gui.PrefixText
    public float popSize = 0.3f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.BoundedDiscrete(min = -2, max = 2)
    @ConfigEntry.Gui.PrefixText
    public float totemSize = 1f;

    public static Gui get() {
        return getConfigHolder(Gui.class).getConfig();
    }
}