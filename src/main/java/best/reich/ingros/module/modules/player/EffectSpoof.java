package best.reich.ingros.module.modules.player;

import best.reich.ingros.events.entity.UpdateEvent;
import me.xenforu.kelo.module.ModuleCategory;
import me.xenforu.kelo.module.annotation.ModuleManifest;
import me.xenforu.kelo.module.type.ToggleableModule;
import me.xenforu.kelo.setting.annotation.Setting;
import net.b0at.api.event.Subscribe;
import net.b0at.api.event.types.EventType;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

/*
* @author sn01
*
* 22/10/2020
 */


@ModuleManifest(label = "EffectSpoof", category = ModuleCategory.PLAYER, color = 0xFAEEAF)
public class EffectSpoof extends ToggleableModule {

    @Setting("absorption")
    public boolean absorption = false;
    @Setting("regeneration")
    public boolean regen = true;
    @Setting("fire resistance")
    public boolean fire = true;
    @Setting("levitation")
    public boolean levitation = true;
    @Setting("haste")
    public boolean haste = true;
    @Setting("resistance")
    public boolean resistance = true;
    @Setting("strength")
    public boolean strength = true;
    @Setting("speed")
    public boolean speed = true;
    @Setting("nightvision")
    public boolean bright = true;
    @Setting("jump boost")
    public boolean jumpboost = true;
    @Setting("nausea")
    public boolean nausea = true;

    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (event.getType() == EventType.PRE) {

            if (absorption) {
                mc.player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 100, 2));
            }
            if (fire) {

                mc.player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 100, 2));

            }
            if (levitation) {
                mc.player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 100, 2));
            }
            if (haste) {
                mc.player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 100, 2));
            }
            if (resistance) {
                mc.player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 100, 2));
            }
            if (strength) {
                mc.player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 100, 2));
            }
            if (speed) {
                mc.player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 100, 2));
            }
            if (bright) {
                mc.player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 100, 2));
            }
            if (jumpboost) {
                mc.player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 100, 2));
            }
            if (nausea)
                mc.player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 100, 2));
        }

    }
    }
    //@Override
// public void onDisable(){}
