package io.github.techtastic.open_waters.forge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import io.github.techtastic.open_waters.OpenWatersMod;

@Mod(OpenWatersMod.MOD_ID)
public class OpenWatersModForge {
    boolean happendClientSetup = false;
    static IEventBus MOD_BUS;

    public OpenWatersModForge() {
        // Submit our event bus to let architectury register our content on the right time
        MOD_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        MOD_BUS.addListener(this::clientSetup);

        OpenWatersMod.init();
    }

    void clientSetup(final FMLClientSetupEvent event) {
        if (happendClientSetup) {
            return;
        }
        happendClientSetup = true;

        OpenWatersMod.initClient();
    }
}
