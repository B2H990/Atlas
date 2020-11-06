package best.reich.ingros.module.modules.movement;


import best.reich.ingros.events.entity.UpdateEvent;
import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import net.b0at.api.event.Subscribe;

@ModuleManifest(label = "AutoJump", category = ModuleCategory.OTHER, color = 0xfff33f00,hidden = true)
public class AutoJump extends ToggleableModule {


@Subscribe
public void onUpdate(UpdateEvent event) {
        if (mc.player.isInWater() || mc.player.isInLava()) mc.player.motionY = 0.1;
        else if (mc.player.onGround) mc.player.jump();
        }
        }
