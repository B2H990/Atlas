package best.reich.ingros.module.modules.movement;

import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;

// made by sn0wy01

        @ModuleManifest(label = "SmartTunnel", category = ModuleCategory.MOVEMENT)
        public class SmartTunnel extends ToggleableModule {

        @Override
        public void onEnable() {
        mc.player.sendChatMessage("#tunnel");
        mc.player.sendChatMessage("#path");
        return;
        } @Override
        public void onDisable() {
        mc.player.sendChatMessage("#stop");
        return;
        }

        }






