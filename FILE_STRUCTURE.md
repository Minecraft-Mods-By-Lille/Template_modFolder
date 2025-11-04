# NeoForge Mod Template - File Structure

This template provides a complete starting point for creating Minecraft 1.21.1 NeoForge mods.

## Root Files

- **build.gradle** - Gradle build configuration with NeoForge plugin setup
- **settings.gradle** - Project name configuration (UPDATE THIS)
- **gradle.properties** - Mod metadata and version configuration (UPDATE THIS)
- **gradlew.bat** - Gradle wrapper script for Windows
- **README.md** - Main template documentation and quick start
- **SETUP_INSTRUCTIONS.md** - Detailed setup guide
- **CHECKLIST.md** - Step-by-step setup checklist
- **FILE_STRUCTURE.md** - This file - complete structure reference
- **CHANGELOG.md** - Version history and updates
- **TODO.md** - Template task list for users
- **WIKI.md** - Guide for setting up GitHub Wiki
- **LICENSE** - MIT License template
- **.gitignore** - Minimal (for template repository)
- **.gitignore.example** - Full version (for mod development - replace .gitignore with this)

## Gradle Configuration

### gradle/wrapper/
- **gradle-wrapper.jar** - Gradle wrapper executable
- **gradle-wrapper.properties** - Gradle wrapper configuration

## Source Code

### src/main/java/net/yourmodid/
- **YourModName.java** - Main mod class template
- **README.txt** - Package organization guide

## Resources

### src/main/resources/
- **pack.mcmeta** - Resource pack metadata
- **META-INF/neoforge.mods.toml** - Mod metadata for NeoForge

### src/main/resources/assets/yourmodid/
- **lang/en_us.json** - English language file template
- **README.txt** - Assets folder structure guide

Subfolders to create as needed:
- blockstates/ - Block state definitions
- models/block/ - Block models
- models/item/ - Item models
- textures/block/ - Block textures
- textures/item/ - Item textures
- sounds/ - Sound files
- sounds.json - Sound definitions

### src/main/resources/data/yourmodid/
- **README.txt** - Data folder structure guide

Subfolders to create as needed:
- advancement/ - Custom advancements
- loot_table/ - Loot tables
- recipe/ - Crafting recipes
- tags/block/ - Block tags
- tags/item/ - Item tags
- worldgen/ - World generation data

## IDE Configuration

### .vscode/
- **launch.json** - VS Code debug configurations for:
  - Client (run Minecraft client)
  - Server (run dedicated server)
  - Data (generate data files)
  - GameTestServer (run tests)

## Usage

1. Copy this entire folder to create a new mod project
2. Follow the [Setup Instructions](SETUP_INSTRUCTIONS.md) or [Setup Checklist](CHECKLIST.md)
3. Replace .gitignore with .gitignore.example
4. Update gradle.properties with your mod information
5. Update settings.gradle with your mod ID
6. Rename the yourmodid folders to match your mod ID
7. Run `./gradlew build` to verify setup
8. Use VS Code launch configurations to run and debug

## Key Technologies

- **Minecraft Version**: 1.21.1
- **NeoForge Version**: 21.1.57
- **Java Version**: 21
- **Gradle Version**: 8.8 (via wrapper)
- **ModDevGradle Plugin**: 2.0.28-beta

## Building Your Mod

```bash
# Build the mod
./gradlew build

# Clean build artifacts
./gradlew clean

# Run client (alternative to VS Code launcher)
./gradlew runClient

# Run data generation
./gradlew runData
```

The compiled mod jar will be in `build/libs/` after building.
