package net.gegy1000.wearables.client.model.component.chest;

import com.google.common.collect.ImmutableList;
import net.gegy1000.wearables.client.model.component.WearableComponentModel;
import net.ilexiconn.llibrary.client.util.Matrix;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class JetpackModel extends WearableComponentModel {
    public ModelRenderer base;
    public ModelRenderer shape124;
    public ModelRenderer shape144;
    public ModelRenderer shape124_1;
    public ModelRenderer shape124_2;
    public ModelRenderer shape151;
    public ModelRenderer shape144_1;
    public ModelRenderer shape144_2;
    public ModelRenderer shape129;
    public ModelRenderer shape129_1;
    public ModelRenderer shape129_2;
    public ModelRenderer shape124_3;
    public ModelRenderer shape129_3;
    public ModelRenderer shape147;
    public ModelRenderer shape147_1;
    public ModelRenderer shape129_4;
    public ModelRenderer shape129_5;
    public ModelRenderer shape129_6;
    public ModelRenderer shape124_4;
    public ModelRenderer shape129_7;
    public ModelRenderer shape147_2;
    public ModelRenderer shape147_3;

    public JetpackModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape147_1 = new ModelRenderer(this, 17, 1);
        this.shape147_1.setRotationPoint(-0.2F, 0.0F, -5.5F);
        this.shape147_1.addBox(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.shape147_3 = new ModelRenderer(this, 17, 1);
        this.shape147_3.setRotationPoint(0.2F, 0.0F, -5.5F);
        this.shape147_3.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.shape129_1 = new ModelRenderer(this, 0, 0);
        this.shape129_1.setRotationPoint(3.0F, 9.0F, 1.0F);
        this.shape129_1.addBox(0.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(this.shape129_1, 0.0F, 0.0F, -0.25132741228718347F);
        this.shape124_3 = new ModelRenderer(this, 2, 16);
        this.shape124_3.setRotationPoint(0.5F, 0.5F, 0.3F);
        this.shape124_3.addBox(0.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F);
        this.shape124_4 = new ModelRenderer(this, 2, 16);
        this.shape124_4.setRotationPoint(-0.5F, 0.5F, 0.3F);
        this.shape124_4.addBox(-3.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F);
        this.shape129_2 = new ModelRenderer(this, 0, 0);
        this.shape129_2.setRotationPoint(1.0F, 9.0F, 1.0F);
        this.shape129_2.addBox(-1.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(this.shape129_2, 0.0F, 0.0F, 0.25132741228718347F);
        this.shape129_4 = new ModelRenderer(this, 0, 0);
        this.shape129_4.setRotationPoint(-2.0F, 9.0F, 2.0F);
        this.shape129_4.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(this.shape129_4, 0.25132741228718347F, 0.0F, 0.0F);
        this.shape144_1 = new ModelRenderer(this, 17, 0);
        this.shape144_1.setRotationPoint(-1.0F, -0.2F, 0.1F);
        this.shape144_1.addBox(-4.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F);
        this.base = new ModelRenderer(this, 0, 7);
        this.base.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.base.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.shape129_5 = new ModelRenderer(this, 0, 0);
        this.shape129_5.setRotationPoint(-3.0F, 9.0F, 1.0F);
        this.shape129_5.addBox(-1.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(this.shape129_5, 0.0F, 0.0F, 0.25132741228718347F);
        this.shape147 = new ModelRenderer(this, 5, 0);
        this.shape147.setRotationPoint(3.74F, 6.64F, 1.13F);
        this.shape147.addBox(0.0F, 0.0F, -7.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(this.shape147, -0.09599310885968812F, -0.13735741213195374F, 0.017976891295541593F);
        this.shape129_3 = new ModelRenderer(this, 0, 0);
        this.shape129_3.setRotationPoint(2.0F, 9.0F, 0.0F);
        this.shape129_3.addBox(-2.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(this.shape129_3, -0.25132741228718347F, 0.0F, 0.0F);
        this.shape129_6 = new ModelRenderer(this, 0, 0);
        this.shape129_6.setRotationPoint(-1.0F, 9.0F, 1.0F);
        this.shape129_6.addBox(0.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(this.shape129_6, 0.0F, 0.0F, -0.25132741228718347F);
        this.shape124_1 = new ModelRenderer(this, 0, 14);
        this.shape124_1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.shape124_1.addBox(0.0F, 0.0F, -1.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(this.shape124_1, 0.0942477796076938F, 0.1884955592153876F, 0.0F);
        this.shape129 = new ModelRenderer(this, 0, 1);
        this.shape129.setRotationPoint(2.0F, 9.0F, 2.0F);
        this.shape129.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(this.shape129, 0.25132741228718347F, 0.0F, 0.0F);
        this.shape144 = new ModelRenderer(this, 17, 0);
        this.shape144.setRotationPoint(3.0F, -0.7F, 0.7F);
        this.shape144.addBox(-1.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape124_2 = new ModelRenderer(this, 0, 14);
        this.shape124_2.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.shape124_2.addBox(-4.0F, 0.0F, -1.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(this.shape124_2, 0.0942477796076938F, -0.1884955592153876F, 0.0F);
        this.shape147_2 = new ModelRenderer(this, 5, 0);
        this.shape147_2.setRotationPoint(-3.74F, 6.64F, 1.13F);
        this.shape147_2.addBox(-1.0F, 0.0F, -7.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(this.shape147_2, -0.09599310885968812F, 0.13735741213195374F, -0.017976891295541593F);
        this.shape124 = new ModelRenderer(this, 26, 1);
        this.shape124.setRotationPoint(0.0F, 2.0F, 2.0F);
        this.shape124.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 2, 0.0F);
        this.shape129_7 = new ModelRenderer(this, 0, 0);
        this.shape129_7.setRotationPoint(-2.0F, 9.0F, 0.0F);
        this.shape129_7.addBox(-2.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(this.shape129_7, -0.25132741228718347F, 0.0F, 0.0F);
        this.shape151 = new ModelRenderer(this, 0, 28);
        this.shape151.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.shape151.addBox(-3.0F, 0.0F, 0.0F, 6, 8, 2, 0.0F);
        this.setRotateAngle(this.shape151, 0.06283185307179587F, 0.0F, 0.0F);
        this.shape144_2 = new ModelRenderer(this, 17, 0);
        this.shape144_2.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.shape144_2.addBox(0.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F);
        this.shape147.addChild(this.shape147_1);
        this.shape147_2.addChild(this.shape147_3);
        this.shape124_1.addChild(this.shape129_1);
        this.shape124_1.addChild(this.shape124_3);
        this.shape124_2.addChild(this.shape124_4);
        this.shape124_1.addChild(this.shape129_2);
        this.shape124_2.addChild(this.shape129_4);
        this.shape144.addChild(this.shape144_1);
        this.shape124_2.addChild(this.shape129_5);
        this.shape124_1.addChild(this.shape147);
        this.shape124_1.addChild(this.shape129_3);
        this.shape124_2.addChild(this.shape129_6);
        this.shape124.addChild(this.shape124_1);
        this.shape124_1.addChild(this.shape129);
        this.shape124.addChild(this.shape144);
        this.shape124.addChild(this.shape124_2);
        this.shape124_2.addChild(this.shape147_2);
        this.base.addChild(this.shape124);
        this.shape124_2.addChild(this.shape129_7);
        this.shape124.addChild(this.shape151);
        this.shape144.addChild(this.shape144_2);
    }

    @Override
    public void renderComponent(Entity entity, float limbSwing, float limbSwingAmount, float age, float yaw, float pitch, float scale) {
        this.renderParented(this.bipedBody, this.base, scale);
    }

    @Override
    public void buildQuads(Matrix matrix, ImmutableList.Builder<BakedQuad> builder, VertexFormat format, TextureAtlasSprite sprite, int layer) {
        this.buildCuboidParented(this.bipedBody, this.base, matrix, builder, format, sprite, layer);
    }
}
