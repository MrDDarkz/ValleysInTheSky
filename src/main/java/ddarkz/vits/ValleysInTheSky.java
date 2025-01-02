package ddarkz.vits;

import ddarkz.vits.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValleysInTheSky implements ModInitializer {
	public static final String MOD_ID = "vits";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}