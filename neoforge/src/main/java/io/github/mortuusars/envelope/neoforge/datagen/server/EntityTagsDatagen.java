package io.github.mortuusars.envelope.neoforge.datagen.server;

import io.github.mortuusars.envelope.Envelope;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EntityTagsDatagen extends EntityTypeTagsProvider {
    public static final TagKey<EntityType<?>> CAGE_CATCHABLE = TagKey.create(net.minecraft.core.registries.Registries.ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath("supplementaries", "cage_catchable"));
    public static final TagKey<EntityType<?>> CAGE_BABY_CATCHABLE = TagKey.create(net.minecraft.core.registries.Registries.ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath("supplementaries", "cage_baby_catchable"));

    public EntityTagsDatagen(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Envelope.ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(CAGE_CATCHABLE).add(Envelope.EntityTypes.PIGEON.get());
        tag(CAGE_BABY_CATCHABLE).add(Envelope.EntityTypes.PIGEON.get());
    }
}
