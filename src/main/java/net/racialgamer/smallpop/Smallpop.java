package net.racialgamer.smallpop;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Smallpop implements ModInitializer {

	@Override
	public void onInitialize() {
		AutoConfig.register(Gui.class, GsonConfigSerializer::new);
	}
}
