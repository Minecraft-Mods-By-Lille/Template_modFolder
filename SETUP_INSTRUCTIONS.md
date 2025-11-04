# Template Mod Setup Instructions

This is a NeoForge mod template for Minecraft 1.21.1. Follow these steps to set up your new mod:

## Step 1: Update Mod Properties

Edit `gradle.properties` and change the following properties:

```properties
mod_id=yourmodid              # Change to your unique mod ID (lowercase, no spaces, underscores allowed)
mod_name=Your Mod Name        # Change to your mod's display name
mod_version=1.0.0            # Set your initial version
mod_description=Your mod description here
mod_authors=Your Name         # Change to your name
mod_credits=Credits here      # Add any credits (optional)
```

## Step 2: Update Settings

Edit `settings.gradle` and change:

```gradle
rootProject.name = 'yourmodid'  # Change to match your mod_id
```

## Step 3: Create Your Main Mod Class

Create your main mod class at:
`src/main/java/net/yourmodid/YourModName.java`

Example structure:
```java
package net.yourmodid;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(YourModName.MOD_ID)
public class YourModName {
    public static final String MOD_ID = "yourmodid";

    public YourModName(IEventBus modEventBus) {
        // Register mod setup here
    }
}
```

## Step 4: Set Up Resource Folders

The following folder structure is already created:
- `src/main/resources/assets/yourmodid/` - For client-side resources (textures, models, sounds)
- `src/main/resources/data/yourmodid/` - For data packs (recipes, loot tables, tags)
- `src/main/resources/META-INF/` - For mod metadata

You'll need to rename the `yourmodid` folders to match your actual mod ID.

## Step 5: Add a Logo (Optional)

Place a logo image in `src/main/resources/` named `yourmodid.png` (where `yourmodid` is your mod ID).

## Step 6: Build the Mod

Run the Gradle build:
```bash
./gradlew build
```

This will download all dependencies and build your mod for the first time.

## Step 7: Run the Mod

Use the VS Code launch configurations:
- **Client**: Runs the Minecraft client with your mod
- **Server**: Runs a dedicated server with your mod
- **Data**: Generates data files (recipes, loot tables, etc.)
- **GameTestServer**: Runs automated tests

Note: The first run will take some time as it downloads Minecraft and sets up the development environment.

## Additional Resources

- [NeoForge Documentation](https://docs.neoforged.net/)
- [Minecraft Wiki](https://minecraft.wiki/)
- [NeoForge Discord](https://discord.neoforged.net/)

## Project Structure

```
yourmodid/
├── .vscode/              # VS Code launch configurations
├── gradle/               # Gradle wrapper files
├── src/
│   └── main/
│       ├── java/         # Java source code
│       │   └── net/
│       │       └── yourmodid/
│       └── resources/    # Resources
│           ├── assets/   # Client resources
│           │   └── yourmodid/
│           ├── data/     # Data packs
│           │   └── yourmodid/
│           └── META-INF/ # Mod metadata
├── build.gradle          # Gradle build script
├── gradle.properties     # Mod properties
├── settings.gradle       # Gradle settings
└── README.md            # This file
```

## Troubleshooting

- If you get build errors, make sure you have Java 21 installed
- Delete the `.gradle` and `build` folders and run `./gradlew build` again if you encounter caching issues
- Make sure your `mod_id` in `gradle.properties` matches your folder names in `resources/`
