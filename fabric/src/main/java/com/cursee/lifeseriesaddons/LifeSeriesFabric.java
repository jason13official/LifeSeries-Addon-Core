package com.cursee.lifeseriesaddons;

import net.fabricmc.api.ModInitializer;

public class LifeSeriesFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        LifeSeries.init();
    }
}
