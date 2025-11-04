package net.yourmodid;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main mod class for YourModName
 * 
 * This is the entry point for your mod. The @Mod annotation tells NeoForge
 * that this class is a mod and uses the MOD_ID specified below.
 */
@Mod(YourModName.MOD_ID)
public class YourModName {
    // Define your mod ID here - this should match the mod_id in gradle.properties
    public static final String MOD_ID = "yourmodid";
    
    // Logger for your mod - use this instead of System.out.println()
    public static final Logger LOGGER = LoggerFactory.getLogger(YourModName.class);

    /**
     * Constructor - called when the mod is loaded
     * 
     * @param modEventBus The mod-specific event bus for registering mod-specific events
     */
    public YourModName(IEventBus modEventBus) {
        LOGGER.info("Initializing {} mod", MOD_ID);
        
        // Register your mod's content here
        // Examples:
        // ModBlocks.register(modEventBus);
        // ModItems.register(modEventBus);
        // ModCreativeTabs.register(modEventBus);
        
        // Register event handlers
        // modEventBus.addListener(this::commonSetup);
        
        LOGGER.info("{} mod initialized successfully", MOD_ID);
    }
    
    // Example setup method (uncomment if you need it)
    // private void commonSetup(final FMLCommonSetupEvent event) {
    //     LOGGER.info("Common setup for {}", MOD_ID);
    //     // Perform common setup tasks here
    // }
}
