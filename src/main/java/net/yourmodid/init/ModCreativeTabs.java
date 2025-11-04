package net.yourmodid.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yourmodid.YourModName;

import java.util.function.Supplier;

/**
 * Example class for registering creative mode tabs
 * 
 * Creative tabs organize your items in the creative inventory.
 * Uncomment and modify this code when you're ready to add a creative tab.
 */
public class ModCreativeTabs {
    // Create a DeferredRegister for creative mode tabs
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YourModName.MOD_ID);

    // Example creative tab - uncomment when you have items to add:
    /*
    public static final Supplier<CreativeModeTab> YOUR_TAB = CREATIVE_MODE_TABS.register("your_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.yourmodid"))
                    .icon(() -> new ItemStack(Items.DIAMOND)) // Change to your item
                    .displayItems((parameters, output) -> {
                        // Add your items here
                        // output.accept(ModItems.YOUR_ITEM.get());
                        // output.accept(ModBlocks.YOUR_BLOCK.get());
                    })
                    .build()
    );
    */

    /**
     * Call this method from your main mod class constructor
     * Example: ModCreativeTabs.register(modEventBus);
     */
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
