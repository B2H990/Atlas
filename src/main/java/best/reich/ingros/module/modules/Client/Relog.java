package best.reich.ingros.module.modules.Client;

import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;

//made by sn01

@ModuleManifest(label = "Relog", category = ModuleCategory.CLIENT)
public class Relog extends ToggleableModule {

    @Override
    public void onEnable() {
        mc.player.sendChatMessage("-relog");
        toggle();
        return;
    }
}






