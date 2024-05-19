package com.your_name.your_mod_id;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(YourModID.MOD_ID)
public class YourModID
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "your_mod_id";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public YourModID(IEventBus modEventBus) {
        // Register ourselves for server and other game events we are interested in
        NeoForge.EVENT_BUS.register(this);


    }

}
