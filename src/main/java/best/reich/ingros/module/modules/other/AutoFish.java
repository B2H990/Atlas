package best.reich.ingros.module.modules.other;

import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import me.xenforu.kelo.setting.annotation.Setting;
import net.b0at.api.event.EventHandler;
import org.sn01.Atlas.event.PacketEvent;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;

@ModuleManifest(label = "AutoFish", category = ModuleCategory.OTHER)
public class AutoFish extends ToggleableModule {

    @Setting("Cast")
    public boolean cast = false;

    // thank you mercury

    @EventHandler
    public void onPacket(PacketEvent event) {
        if (event.getType().equals(PacketEvent.Type.INCOMING)) {
            if (event.getPacket() instanceof SPacketSoundEffect) {
                SPacketSoundEffect packet = (SPacketSoundEffect)event.getPacket();
                if (packet.getCategory() == SoundCategory.NEUTRAL && packet.getSound() == SoundEvents.ENTITY_BOBBER_SPLASH) {
                    if (mc.player.getHeldItemMainhand().getItem() instanceof ItemFishingRod) {
                        click();
                        if (cast)
                            click();
                    }
                }
            }
        }
    }

    public void click() {
        mc.player.connection.sendPacket(new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
        mc.player.swingArm(EnumHand.MAIN_HAND);
    }

}
