package net.yourmodid.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yourmodid.YourModName;

/**
 * Example class for registering items
 * 
 * This demonstrates the standard pattern for registering items in NeoForge.
 * Uncomment and modify this code when you're ready to add items to your mod.
 */
public class ModItems {
    // Create a DeferredRegister for items
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(YourModName.MOD_ID);

    // Register items here - example:
    // public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item");
    
    // Or with custom properties:
    // public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
    //     () -> new Item(new Item.Properties()));

    /**
     * Call this method from your main mod class constructor
     * Example: ModItems.register(modEventBus);
     */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
