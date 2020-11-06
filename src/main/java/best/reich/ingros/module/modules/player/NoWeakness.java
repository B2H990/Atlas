package best.reich.ingros.module.modules.player;

import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import net.b0at.api.event.Subscribe;
import net.minecraft.potion.Potion;

@ModuleManifest(label = "NoWeakness", category = ModuleCategory.PLAYER, color = 0xFAEEAF,hidden = true)
public class NoWeakness extends ToggleableModule {

    //auth sn0wy01

        @Subscribe
        public void onUpdate() {
        if (mc.player.isPotionActive(Potion.getPotionFromResourceLocation("weakness"))) {
        mc.player.removeActivePotionEffect(Potion.getPotionFromResourceLocation("weakness"));
        }
        }
        }
