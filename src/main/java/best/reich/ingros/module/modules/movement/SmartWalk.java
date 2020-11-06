package best.reich.ingros.module.modules.movement;


import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;

@ModuleManifest(label = "SmartWalk", category = ModuleCategory.MOVEMENT)
        public class SmartWalk extends ToggleableModule {

@Override
        public void onEnable() {
        mc.player.sendChatMessage("#thisway 100000");
        mc.player.sendChatMessage("#path");
        return;
        } @Override
        public void onDisable() {
        mc.player.sendChatMessage("#stop");
        return;
        }

        }





