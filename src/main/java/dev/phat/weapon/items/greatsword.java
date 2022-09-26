package dev.phat.weapon.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class greatsword extends SwordItem {
    public greatsword(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (hand == InteractionHand.MAIN_HAND && !level.isClientSide()) {
            if(player.getHealth()>10){
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 400, 19));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 6));
            player.setHealth(player.getHealth()-10);
            player.getCooldowns().addCooldown(player.getMainHandItem().getItem(), 600);
        }}
        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        super.appendHoverText(stack, level, components, flag);
        components.add(Component.literal("Right click to get an extremely fast attack buff and a massive attack damage buff at the cost of 10 health."));
    }
}
