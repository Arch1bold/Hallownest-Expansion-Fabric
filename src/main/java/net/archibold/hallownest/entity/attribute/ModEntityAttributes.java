package net.archibold.hallownest.entity.attribute;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.registry.Registry;

public class ModEntityAttributes extends EntityAttributes {
    public static final EntityAttribute GENERIC_BOUNCE_RESISTANCE = ModEntityAttributes.register("generic.bounce_resistance", new ClampedEntityAttribute("attribute.name.generic.bounce_resistance", 0.0, 0.0, 1.0));
    public static final EntityAttribute GENERIC_ATTACK_BOUNCE = ModEntityAttributes.register("generic.attack_bounce", new ClampedEntityAttribute("attribute.name.generic.attack_bounce", 0.0, 0.0, 0.0));

    private static EntityAttribute register(String id, EntityAttribute attribute) {
        return Registry.register(Registry.ATTRIBUTE, id, attribute);
    }
}
