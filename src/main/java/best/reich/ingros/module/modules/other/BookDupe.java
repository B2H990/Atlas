package best.reich.ingros.module.modules.other;

import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;

//module by sn01
// ok for real doe wtf does -book do

@ModuleManifest(label = "BookDupe", category = ModuleCategory.OTHER)
public class BookDupe extends ToggleableModule {

    @Override
    public void onEnable() {
        mc.player.sendChatMessage("-book");
        mc.player.sendChatMessage("EZ bookdupe conducted with atlas!");
        toggle();
        return;
    }
}






