package net.archibold.hallownest.entity.client;

import net.archibold.hallownest.Hallownest;
import net.archibold.hallownest.entity.custom.TiktikEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TiktikRenderer extends GeoEntityRenderer<TiktikEntity> {
    public TiktikRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new TiktikModel());
    }

    public Identifier getTextureLocation(TiktikEntity instance) {
        return new Identifier(Hallownest.MOD_ID, "textures/entity/tiktik/tiktik.png");
    }
}
