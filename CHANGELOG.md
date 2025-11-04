# Changelog

All notable changes and updates to this template.

## [1.0.0] - 2025-11-01

### Initial Template Creation

Complete NeoForge mod template for Minecraft 1.21.1 with all essential files and documentation.

#### Added
- Complete Gradle build system with NeoForge ModDevGradle plugin 2.0.28-beta
- Gradle wrapper for Windows (gradlew.bat)
- Main mod class template (YourModName.java)
- Item registration example (ModItems.java)
- Block registration example (ModBlocks.java)
- Creative tab registration example (ModCreativeTabs.java)
- Mod metadata configuration (neoforge.mods.toml) with property placeholders
- Resource pack metadata (pack.mcmeta)
- Language file template (en_us.json)
- Logo placeholder instructions (logo_PLACEHOLDER.txt)
- VS Code launch configurations for Client, Server, Data, and GameTestServer
- Proper asset folder structure (textures, models, lang)
- Proper data folder structure (recipes, loot tables, tags, advancements)
- Data generation folder and documentation
- Package organization guides
- Template TODO list for mod development
- MIT License template

#### Documentation
- README.md - Main template documentation
- SETUP_INSTRUCTIONS.md - Detailed setup guide
- CHECKLIST.md - Step-by-step setup checklist
- FILE_STRUCTURE.md - Complete folder structure reference
- GITIGNORE_EXPLAINED.md - Understanding the two .gitignore files
- TODO.md - Template task list for users

#### Configuration
- gradle.properties with all mod metadata properties
- settings.gradle for project name
- .gitignore (minimal for template repository)
- .gitignore.example (full for mod development)

### Critical Fixes

#### .gitignore Configuration (2025-11-01)
**Problem**: Original .gitignore would have excluded essential template files from GitHub (gradle-wrapper.jar, VS Code configs, etc.), resulting in broken template when cloned.

**Solution**: 
- Created minimal .gitignore for template repository (only ignores OS files and backups)
- Created .gitignore.example with full configuration for mod development
- Added GITIGNORE_EXPLAINED.md with detailed explanation
- Updated all documentation to include .gitignore replacement step
- Users must replace .gitignore with .gitignore.example when creating new mod

**Result**: Template now safely commits all necessary files to GitHub while providing proper .gitignore for mod development.

### Template Features

#### Build System
- NeoForge 21.1.57 for Minecraft 1.21.1
- Java 21 toolchain
- Parchment mappings 2024.11.17
- JUnit 5 testing support
- Property-based configuration system

#### Source Code Examples
- Main mod class with logger and event bus
- Deferred registration pattern for items
- Deferred registration pattern for blocks
- Creative tab registration with display items
- Proper package structure

#### Resource Management
- Assets folder for client resources
- Data folder for server/data pack resources
- Automatic property expansion in neoforge.mods.toml
- Resource pack format 34 for 1.21.1

#### IDE Support
- VS Code launch configurations using ModDevGradle
- Debug support for client and server
- Data generation runner
- Game test server runner

#### Best Practices
- Follows NeoForge community standards
- Uses DeferredRegister pattern
- Property-based metadata management
- Organized package structure
- Comprehensive inline comments

### File Count
- **Total Files**: 33
- Source Code: 6 files
- Resources: 6 files
- Gradle: 6 files
- Documentation: 6 files
- Configuration: 3 files
- Generated: 1 file

### Notes
- Template is based on working Stockpile mod structure
- All placeholder values use "yourmodid" for easy find-and-replace
- Gradle wrapper included - no Gradle installation required
- All example code is commented with explanations
- Data generation folder ready but empty (filled during development)

---

## Version Format

This changelog follows [Keep a Changelog](https://keepachangelog.com/en/1.0.0/) format.

Version numbers: [Major.Minor.Patch]
- **Major**: Significant changes, Minecraft/NeoForge version updates
- **Minor**: New features, template improvements
- **Patch**: Bug fixes, documentation updates
