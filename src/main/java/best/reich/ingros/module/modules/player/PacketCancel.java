package best.reich.ingros.module.modules.player;

import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import me.xenforu.kelo.setting.annotation.Setting;
import org.sn01.Atlas.event.PacketEvent;
import net.b0at.api.event.Subscribe;
import net.minecraft.network.login.client.CPacketEncryptionResponse;
import net.minecraft.network.play.client.*;
import net.minecraft.network.status.client.CPacketPing;
import net.minecraft.network.status.client.CPacketServerQuery;

@ModuleManifest(label = "PacketCancel", category = ModuleCategory.PLAYER)
public class PacketCancel extends ToggleableModule {
    @Setting("Animation")
    public boolean animation = false;
    @Setting("KeepAlive")
    public boolean keepalive = false;
    @Setting("ChatMessage")
    public boolean chatmessage = false;
    @Setting("ClickWindow")
    public boolean clickwindow = false;
    @Setting("ClientSettings")
    public boolean clientsettings = false;
    @Setting("ClientStatus")
    public boolean clientstatus = false;
    @Setting("CloseWindow")
    public boolean closewindow = false;
    @Setting("ConfirmTeleport")
    public boolean confirmteleport = false;
    @Setting("ConfirmTransaction")
    public boolean confirmtransaction = false;
    @Setting("CreativeInventoryAction")
    public boolean creativeinventoryaction = false;
    @Setting("CustomPayload")
    public boolean custompayload = false;
    @Setting("HeldItemChange")
    public boolean helditemchange = false;
    @Setting("EnchantItem")
    public boolean enchantitem = false;
    @Setting("EntityAction")
    public boolean entityaction = false;
    @Setting("PlaceRecipe")
    public boolean placerecipe = false;
    @Setting("Input")
    public boolean input = false;
    @Setting("Player")
    public boolean player = false;
    @Setting("PlayerAbilities")
    public boolean playerabilities = false;
    @Setting("PlayerTryUseItem")
    public boolean tryuseitem = false;
    @Setting("PlayerTryUseItemOnBlock")
    public boolean tryuseitemonblock = false;
    @Setting("PlayerDigging")
    public boolean playerdigging = false;
    @Setting("RecipeInfo")
    public boolean recipeinfo = false;
    @Setting("ResourcePackStatus")
    public boolean resourcepackstatus = false;
    @Setting("SeenAdvancements")
    public boolean seendadvancements = false;
    @Setting("Spectate")
    public boolean spectate = false;
    @Setting("SteerBoat")
    public boolean steerboat = false;
    @Setting("TabComplete")
    public boolean tabcomplete = false;
    @Setting("UpdateSign")
    public boolean updatesign = false;
    @Setting("VehicleMove")
    public boolean vehiclemove = false;
    @Setting("EncryptionResponse")
    public boolean encryptionresponse = false;
    @Setting("Ping")
    public boolean ping = false;
    @Setting("ServerQuery")
    public boolean serverquery = false;

    @Subscribe
    public void onPacket(PacketEvent e) {
        if (animation) {
            if (e.getPacket() instanceof CPacketAnimation) {
                e.setCancelled(true);
            }
        }
        if (keepalive) {
            if (e.getPacket() instanceof CPacketKeepAlive) {
                e.setCancelled(true);
            }
        }
        if (chatmessage) {
            if (e.getPacket() instanceof CPacketChatMessage) {
                e.setCancelled(true);
            }
        }
        if (clickwindow) {
            if (e.getPacket() instanceof CPacketClickWindow) {
                e.setCancelled(true);
            }
        }
        if (clientsettings) {
            if (e.getPacket() instanceof CPacketClientSettings) {
                e.setCancelled(true);
            }
        }
        if (clientstatus) {
            if (e.getPacket() instanceof CPacketClientStatus) {
                e.setCancelled(true);
            }
        }
        if (closewindow) {
            if (e.getPacket() instanceof CPacketCloseWindow) {
                e.setCancelled(true);
            }
        }
        if (confirmteleport) {
            if (e.getPacket() instanceof CPacketConfirmTeleport) {
                e.setCancelled(true);
            }
        }
        if (confirmtransaction) {
            if (e.getPacket() instanceof CPacketConfirmTransaction) {
                e.setCancelled(true);
            }
        }
        if (creativeinventoryaction) {
            if (e.getPacket() instanceof CPacketCreativeInventoryAction) {
                e.setCancelled(true);
            }
        }
        if (custompayload) {
            if (e.getPacket() instanceof CPacketCustomPayload) {
                e.setCancelled(true);
            }
        }
        if (enchantitem) {
            if (e.getPacket() instanceof CPacketEnchantItem) {
                e.setCancelled(true);
            }
        }
        if (entityaction) {
            if (e.getPacket() instanceof CPacketEntityAction) {
                e.setCancelled(true);
            }
        }
        if (helditemchange) {
            if (e.getPacket() instanceof CPacketHeldItemChange) {
                e.setCancelled(true);
            }
        }
        if (input) {
            if (e.getPacket() instanceof CPacketInput) {
                e.setCancelled(true);
            }
        }
        if (placerecipe) {
            if (e.getPacket() instanceof CPacketPlaceRecipe) {
                e.setCancelled(true);
            }
        }
        if (player) {
            if (e.getPacket() instanceof CPacketPlayer) {
                e.setCancelled(true);
            }
        }
        if (playerabilities) {
            if (e.getPacket() instanceof CPacketPlayerAbilities) {
                e.setCancelled(true);
            }
        }    if (playerdigging) {
            if (e.getPacket() instanceof CPacketPlayerDigging) {
                e.setCancelled(true);
            }
        }    if (tryuseitem) {
            if (e.getPacket() instanceof CPacketPlayerTryUseItem) {
                e.setCancelled(true);
            }
        }
        if (tryuseitemonblock) {
            if (e.getPacket() instanceof CPacketPlayerTryUseItemOnBlock) {
                e.setCancelled(true);
            }
        }    if (recipeinfo) {
            if (e.getPacket() instanceof CPacketRecipeInfo) {
                e.setCancelled(true);
            }
        }
        if (resourcepackstatus) {
            if (e.getPacket() instanceof CPacketResourcePackStatus) {
                e.setCancelled(true);
            }
        }
        if (seendadvancements) {
            if (e.getPacket() instanceof CPacketSeenAdvancements) {
                e.setCancelled(true);
            }
        }
        if (spectate) {
            if (e.getPacket() instanceof CPacketSpectate) {
                e.setCancelled(true);
            }
        }
        if (steerboat) {
            if (e.getPacket() instanceof CPacketSteerBoat) {
                e.setCancelled(true);
            }
        }
        if (tabcomplete) {
            if (e.getPacket() instanceof CPacketTabComplete) {
                e.setCancelled(true);
            }
        }
        if (updatesign) {
            if (e.getPacket() instanceof CPacketUpdateSign) {
                e.setCancelled(true);
            }
        }
        if (vehiclemove) {
            if (e.getPacket() instanceof CPacketVehicleMove) {
                e.setCancelled(true);
            }
        }
        if (encryptionresponse) {
            if (e.getPacket() instanceof CPacketEncryptionResponse) {
                e.setCancelled(true);
            }
        }
        if (ping) {
            if (e.getPacket() instanceof CPacketPing) {
                e.setCancelled(true);
            }
        }
        if (serverquery) {
            if (e.getPacket() instanceof CPacketServerQuery) {
                e.setCancelled(true);
            }
        }

    }
}

