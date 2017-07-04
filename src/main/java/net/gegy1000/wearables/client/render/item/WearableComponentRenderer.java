package net.gegy1000.wearables.client.render.item;

import net.gegy1000.wearables.client.render.ComponentRenderHandler;
import net.gegy1000.wearables.server.block.entity.wearable.WearableComponentEntity;
import net.gegy1000.wearables.server.core.WearablesClientHooks;
import net.gegy1000.wearables.server.item.WearableComponentItem;
import net.gegy1000.wearables.server.wearable.component.WearableComponent;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class WearableComponentRenderer extends TileEntitySpecialRenderer<WearableComponentEntity> {
    @Override
    public void render(WearableComponentEntity entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
        WearableComponent component = WearableComponentItem.getComponent(WearablesClientHooks.getRenderedStack());
        ComponentRenderHandler.fitSlot(component.getType().getBounds());
        ComponentRenderHandler.renderComponent(component, false);
        GlStateManager.popMatrix();
    }
}
