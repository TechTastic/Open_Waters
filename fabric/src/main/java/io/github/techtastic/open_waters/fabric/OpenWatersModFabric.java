package io.github.techtastic.open_waters.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import io.github.techtastic.open_waters.OpenWatersMod;
import org.valkyrienskies.mod.fabric.common.ValkyrienSkiesModFabric;

public class OpenWatersModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // force VS2 to load before eureka
        new ValkyrienSkiesModFabric().onInitialize();

        OpenWatersMod.init();
    }

    @Environment(EnvType.CLIENT)
    public static class Client implements ClientModInitializer {

        @Override
        public void onInitializeClient() {
            OpenWatersMod.initClient();
        }
    }
}
