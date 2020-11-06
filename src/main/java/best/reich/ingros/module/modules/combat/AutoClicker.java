package best.reich.ingros.module.modules.combat;

import best.reich.ingros.events.entity.UpdateEvent;
import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import net.b0at.api.event.Subscribe;
import net.b0at.api.event.types.EventType;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.EnumHand;

/**
 * @author sn01
 * on 27/10/2020
 * 11:22am
 **/

@ModuleManifest(label = "AutoClicker", category = ModuleCategory.COMBAT, color = 0xffAEEA1E)
public class AutoClicker extends ToggleableModule {



    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.player == null) return;
        if (event.getType() == EventType.PRE) {
            {
                int click = mc.gameSettings.keyBindAttack.getKeyCode();
                KeyBinding.onTick(click);
                mc.player.swingArm(EnumHand.MAIN_HAND);
            }
        }
    }
}