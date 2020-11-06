package best.reich.ingros.module.modules.Client;

import best.reich.ingros.IngrosWare;
import best.reich.ingros.events.entity.UpdateEvent;
import best.reich.ingros.events.network.PacketEvent;
import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import me.xenforu.kelo.setting.annotation.Setting;
import net.b0at.api.event.Subscribe;
import net.b0at.api.event.types.EventType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import org.lwjgl.input.Mouse;

@ModuleManifest(label = "Friends", category = ModuleCategory.OTHER, color = 0xff00ff00, hidden = true)
public class Friends extends ToggleableModule {

    @Setting("AntiFriendHit")
    public boolean Friend = true;

    @Setting("MCF")
    public boolean MCF = true;

    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.player == null || mc.world == null) return;
        if (MCF)
        if (Mouse.isButtonDown(2)) {
            final Entity entity = mc.objectMouseOver.entityHit;
            if (entity instanceof EntityPlayer) {
                if (!IngrosWare.INSTANCE.friendManager.isFriend(entity.getName())) {
                    IngrosWare.INSTANCE.friendManager.addFriend(entity.getName());
                } else {
                    IngrosWare.INSTANCE.friendManager.removeFriend(entity.getName());
                }
            }
        }
    }

    @Subscribe
    public void onPacket(PacketEvent event) {
        if (mc.world == null || mc.player == null) return;
        if (Friend)
        if (event.getType() == EventType.PRE && event.getPacket() instanceof CPacketUseEntity) {
            final CPacketUseEntity useEntityPacket = (CPacketUseEntity) event.getPacket();
            if (useEntityPacket.getAction() == CPacketUseEntity.Action.ATTACK && mc.world.getEntityByID(useEntityPacket.entityId) != null && IngrosWare.INSTANCE.friendManager.isFriend(mc.world.getEntityByID(useEntityPacket.entityId).getName())) {
                event.setCancelled(true);
            }
        }
    }
}


