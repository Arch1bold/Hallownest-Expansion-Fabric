package net.archibold.hallownest;

import net.archibold.hallownest.entity.ModEntities;
import net.archibold.hallownest.entity.client.TiktikRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class HallownestClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TIKTIK, TiktikRenderer::new);
    }
}
