package net.yourmodid.block;

import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yourmodid.YourModName;

/**
 * Example class for registering blocks
 * 
 * This demonstrates the standard pattern for registering blocks in NeoForge.
 * Uncomment and modify this code when you're ready to add blocks to your mod.
 */
public class ModBlocks {
    // Create a DeferredRegister for blocks
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(YourModName.MOD_ID);

    // Register blocks here - example:
    // public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", 
    //     BlockBehaviour.Properties.of());
    
    // Or with custom properties:
    // public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
    //     () -> new Block(BlockBehaviour.Properties.of()
    //         .strength(3.0F, 3.0F)
    //         .sound(SoundType.STONE)));

    /**
     * Call this method from your main mod class constructor
     * Example: ModBlocks.register(modEventBus);
     */
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
