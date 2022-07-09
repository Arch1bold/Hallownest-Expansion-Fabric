package net.archibold.hallownest.entity;

import net.archibold.hallownest.Hallownest;
import net.archibold.hallownest.entity.attribute.ModEntityAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ModLivingEntity extends LivingEntity {
    protected ModLivingEntity(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    public float bounceVelocity;

    public static DefaultAttributeContainer.Builder createLivingAttributes() {
        return DefaultAttributeContainer.builder().add(EntityAttributes.GENERIC_MAX_HEALTH).add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE).add(ModEntityAttributes.GENERIC_BOUNCE_RESISTANCE).add(EntityAttributes.GENERIC_MOVEMENT_SPEED).add(EntityAttributes.GENERIC_ARMOR).add(EntityAttributes.GENERIC_ARMOR_TOUGHNESS);
    }

    protected void takeShieldHit(ModLivingEntity attacker) {
        attacker.bounce(this);
    }

    public void bounce(ModLivingEntity target) {
        target.takeBounce(0.5, target.getX() - this.getX(), target.getZ() - this.getZ());
    }

    public void takeBounce(double strength, double x, double z) {
        if ((strength *= 1.0 - this.getAttributeValue(ModEntityAttributes.GENERIC_BOUNCE_RESISTANCE)) <= 0.0) {
            return;


        }
        this.velocityDirty = true;
        Vec3d vec3d = this.getVelocity();
        Vec3d vec3d2 = new Vec3d(x, 0.0, z).normalize().multiply(strength);
        this.setVelocity(vec3d.x / 2.0 - vec3d2.x, this.onGround ? Math.min(0.4, vec3d.y / 2.0 + strength) : vec3d.y, vec3d.z / 2.0 - vec3d2.z);
    }


    public static void registerModLivingEntity() {
        System.out.println("Registering Living Entities for " + Hallownest.MOD_ID);
    }

    @Override
    public void animateDamage() {
        this.hurtTime = this.maxHurtTime = 10;
        this.bounceVelocity = 0.0f;
    }

    @Override
    public Iterable<ItemStack> getArmorItems() {
        return null;
    }

    @Override
    public ItemStack getEquippedStack(EquipmentSlot slot) {
        return null;
    }

    @Override
    public void equipStack(EquipmentSlot slot, ItemStack stack) {

    }

    @Override
    public Arm getMainArm() {
        return null;
    }

    @Override
    public boolean cannotBeSilenced() {
        return super.cannotBeSilenced();

    }
}