package best.reich.ingros.module.modules.other;

import best.reich.ingros.events.entity.UpdateEvent;
import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import me.xenforu.kelo.setting.annotation.Setting;
import net.b0at.api.event.Subscribe;
import net.minecraft.util.EnumHand;

@ModuleManifest(label = "AFKswing", category = ModuleCategory.OTHER)
public class AFKswing extends ToggleableModule {

    @Setting("lefthand")
    public boolean lefthand = true;
    @Setting("righthand")
    public boolean righthand = true;


    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.world == null || mc.player == null) return;
        mc.player.swingArm(EnumHand.MAIN_HAND);
    }
}