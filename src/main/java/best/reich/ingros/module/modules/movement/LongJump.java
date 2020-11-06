package best.reich.ingros.module.modules.movement;

import me.xenforu.kelo.module.ModuleCategory;
import net.b0at.api.event.Subscribe;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import me.xenforu.kelo.setting.annotation.Clamp;
import me.xenforu.kelo.setting.annotation.Setting;

@ModuleManifest(label = "LongJump", category = ModuleCategory.PLAYER)
public class LongJump extends ToggleableModule {

    @Clamp(maximum = "5")
    @Setting("DownSpeed")
    public double DownSpeed = 1.5;
    int Ticks = 0;
    double YVel = 0;
    @Subscribe
    public void onUpdate() {
        if (mc.player.motionY <= 0 && !mc.player.onGround) {
            YVel -= ( 100 / DownSpeed);
            mc.player.motionY = YVel;
        } else {
        }YVel = 0;
    }
}