package net.racialgamer.smallpop.mixin;

import net.minecraft.client.render.GameRenderer;
import net.racialgamer.smallpop.config.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

    @ModifyVariable(method = "renderFloatingItem", at = @At("STORE"), ordinal = 8)
    private float modifyRenderfloatingItem(float n) {
        return n * Gui.get().popSize;
    }
}



