package net.archibold.hallownest.block;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Dismounting;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.BlockView;
import net.minecraft.world.CollisionView;

import java.util.Optional;

import static net.minecraft.state.property.Properties.OCCUPIED;

public class BenchBlock {
    private static final ImmutableList<Vec3i> VALID_HORIZONTAL_SPAWN_OFFSETS = ImmutableList.of(new Vec3i(0, 0, -1), new Vec3i(-1, 0, 0), new Vec3i(0, 0, 1), new Vec3i(1, 0, 0), new Vec3i(-1, 0, -1), new Vec3i(1, 0, -1), new Vec3i(-1, 0, 1), new Vec3i(1, 0, 1));
    private static final ImmutableList<Vec3i> VALID_SPAWN_OFFSETS = new ImmutableList.Builder().addAll(VALID_HORIZONTAL_SPAWN_OFFSETS).addAll(VALID_HORIZONTAL_SPAWN_OFFSETS.stream().map(Vec3i::down).iterator()).addAll(VALID_HORIZONTAL_SPAWN_OFFSETS.stream().map(Vec3i::up).iterator()).add(new Vec3i(0, 1, 0)).build();

    public ActionResult onUse(BlockState state, BlockPos pos, PlayerEntity player) {
        if (state.get(OCCUPIED).booleanValue()) {
            {
                player.sendMessage(Text.translatable("block.minecraft.bed.occupied"), true);
            }
            return ActionResult.SUCCESS;
        }
        player.trySleep(pos).ifLeft(reason -> {
            if (reason.getMessage() != null) {
                player.sendMessage(reason.getMessage(), true);
            }
        });
        return ActionResult.SUCCESS;
    }

    public static Optional<Vec3d> findRespawnPosition(EntityType<?> entity, CollisionView world, BlockPos pos) {
        Optional<Vec3d> optional = BenchBlock.findRespawnPosition(entity, world, pos, true);
        if (optional.isPresent()) {
            return optional;
        }
        return BenchBlock.findRespawnPosition(entity, world, pos, false);
    }

    private static Optional<Vec3d> findRespawnPosition(EntityType<?> entity, CollisionView world, BlockPos pos, boolean ignoreInvalidPos) {
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        for (Vec3i vec3i : VALID_SPAWN_OFFSETS) {
            mutable.set(pos).move(vec3i);
            Vec3d vec3d = Dismounting.findRespawnPos(entity, world, mutable, ignoreInvalidPos);
            if (vec3d == null) continue;
            return Optional.of(vec3d);
        }
        return Optional.empty();
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}

