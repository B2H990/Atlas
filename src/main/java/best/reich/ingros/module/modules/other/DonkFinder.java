package best.reich.ingros.module.modules.other;

import best.reich.ingros.events.other.EntityChunkEvent;
import best.reich.ingros.util.logging.Logger;
import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import me.xenforu.kelo.setting.annotation.Setting;
import net.b0at.api.event.Subscribe;
import net.b0at.api.event.types.EventType;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.init.SoundEvents;

@ModuleManifest(label = "DonkeyFinder", category = ModuleCategory.OTHER, hidden = true)
public class DonkFinder extends ToggleableModule {

    /**
     *
     * @author proto
     * updated on 22/10/2020 - sn01
     **/

    @Setting("donkey")
    public boolean EntityDonkey = true;

    @Setting("llama")
    public boolean EntityLlama = true;

    @Setting("mule")
    public boolean entitymule = true;

    @Setting("playsound")
    public boolean sound = true;

    @Subscribe
    public void onEntityEnterChunk(EntityChunkEvent event) {
        if (mc.world == null || mc.player == null) return;
        if (event.getType() == EventType.PRE) {
            if (EntityDonkey) {
                if (event.getEntity() instanceof EntityDonkey && sound == true)
                    Logger.printMessage("A chestable Donkey has entered your view distance", true);
                    mc.getSoundHandler().playSound(PositionedSoundRecord.getRecord(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 5.0F));
                }
            if (EntityLlama){
                if (event.getEntity() instanceof EntityLlama && sound == true)
                    Logger.printMessage("A chestable llama has entered your view distance", true);
                mc.getSoundHandler().playSound(PositionedSoundRecord.getRecord(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 5.0F));
            }
            if (entitymule){
                if (event.getEntity() instanceof EntityMule && sound == true)
                    Logger.printMessage("A chestable mule has entered your view distance", true);
                mc.getSoundHandler().playSound(PositionedSoundRecord.getRecord(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 5.0F));
            }
        }
    }
}
