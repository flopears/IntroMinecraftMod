package net.flopear.flopsblocks.item;

import net.minecraft.world.item.Item;
import net.flopear.flopsblocks.flopsblocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(flopsblocks.MOD_ID);

    public static final DeferredItem<Item> Sapphire = ITEMS.registerItem( "sapphire",
            Item::new,
            new Item.Properties()
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
