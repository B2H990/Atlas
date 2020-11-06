package best.reich.ingros.module.modules.player;

import com.mojang.authlib.GameProfile;
import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import net.minecraft.client.entity.EntityOtherPlayerMP;

import java.util.UUID;

@ModuleManifest(label = "FakePlayer", category = ModuleCategory.PLAYER, color = 0xFAEEAF)
public class FakePlayer extends ToggleableModule {

    private EntityOtherPlayerMP fake_player;

    @Override
    public void onEnable() {

        fake_player = new EntityOtherPlayerMP(mc.world, new GameProfile(UUID.fromString("6f5b9f89-b095-43b0-9c49-03616768999b"), "urmom"));
        fake_player.copyLocationAndAnglesFrom(mc.player);
        fake_player.rotationYawHead = mc.player.rotationYawHead;
        mc.world.addEntityToWorld(-100, fake_player);

    }

    @Override
    public void onDisable() {
        try {
            mc.world.removeEntity(fake_player);
        } catch (Exception ignored) {}
    }

}