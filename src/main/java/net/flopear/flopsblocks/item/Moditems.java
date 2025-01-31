package net.flopear.flopsblocks.item;

import net.flopear.flopsblocks.flopsblocks;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(NeoForgeRegistries.ITEMS, flopsblocks.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
