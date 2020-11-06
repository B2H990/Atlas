package best.reich.ingros.mixin.impl;

import best.reich.ingros.IngrosWare;
import best.reich.ingros.module.modules.render.Glimmer;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class MixinItem {

    @Inject(method = "hasEffect", at = @At("HEAD"), cancellable = true)
    public void hasEffect(CallbackInfoReturnable<Boolean> cir) {
        Glimmer glimmer = (Glimmer) IngrosWare.INSTANCE.moduleManager.getToggleByName("Glimmer");
        if(glimmer.isEnabled())
            cir.setReturnValue(true);
    }

}
