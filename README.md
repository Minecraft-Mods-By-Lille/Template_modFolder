# NeoForge Mod Template

A complete, ready-to-use template for creating Minecraft 1.21.1 mods with NeoForge. Everything you need to start developing mods quickly and efficiently.

## 🚀 Quick Start

1. **Copy or clone** this template
2. **Replace .gitignore** with .gitignore.example:
   ```powershell
   Remove-Item .gitignore; Rename-Item .gitignore.example .gitignore
   ```
3. **Update** `gradle.properties` with your mod information
4. **Rename folders**: Change `yourmodid` to your actual mod ID
5. **Build**: Run `./gradlew build`

See [Setup Instructions](SETUP_INSTRUCTIONS.md) for detailed steps.

## 📋 What's Included

- ✅ Complete Gradle build system with NeoForge plugin
- ✅ Example mod class with proper structure
- ✅ Item and block registration examples
- ✅ Creative tab registration example
- ✅ VS Code debug configurations (Client, Server, Data, GameTestServer)
- ✅ Proper resource folder structure
- ✅ Language file template
- ✅ Data generation support
- ✅ Comprehensive documentation

## 📦 Template Contents

### Build System
- Gradle 8.8+ configuration
- NeoForge ModDevGradle plugin 2.0.28-beta
- Parchment mappings for better code readability
- Gradle wrapper (no installation needed)

### Source Code
- Main mod class template (`YourModName.java`)
- Item registration example (`ModItems.java`)
- Block registration example (`ModBlocks.java`)
- Creative tab example (`ModCreativeTabs.java`)

### Resources
- Mod metadata configuration (`neoforge.mods.toml`)
- Resource pack metadata (`pack.mcmeta`)
- Assets folder structure (textures, models, lang)
- Data folder structure (recipes, loot tables, tags)

## 🔧 Technical Details

- **Minecraft Version**: 1.21.1
- **NeoForge Version**: 21.1.57
- **Java Version**: 21
- **Gradle Version**: 8.8 (via wrapper)
- **Template Version**: 1.0.0

## 📚 Documentation

- [Setup Instructions](SETUP_INSTRUCTIONS.md) - Detailed setup guide
- [Setup Checklist](CHECKLIST.md) - Step-by-step checklist
- [File Structure](FILE_STRUCTURE.md) - Complete folder structure reference

## ⚠️ Important: Replace .gitignore

When creating a new mod, **replace .gitignore with .gitignore.example**:
```powershell
Remove-Item .gitignore; Rename-Item .gitignore.example .gitignore
```

This swaps the minimal template .gitignore for the full development version.

## 🎯 Features

### Property-Based Configuration
All mod metadata in `gradle.properties` automatically fills into `neoforge.mods.toml`. Change once, updates everywhere.

### VS Code Integration
Pre-configured launch configurations for:
- Running Minecraft client with your mod
- Running dedicated server
- Generating data files
- Running game tests

### Data Generation
Built-in support for generating:
- Block states and models
- Item models
- Recipes
- Loot tables
- Tags

### Best Practices
Follows NeoForge community standards and recommended project structure.

## 📖 Learning Resources

- [NeoForge Documentation](https://docs.neoforged.net/)
- [NeoForge Discord](https://discord.neoforged.net/)
- [Minecraft Wiki](https://minecraft.wiki/)

## 🤝 Support & Feedback

If you find any bugs or have suggestions for improvement, please:
- Open an issue using our [Bug Report](.github/ISSUE_TEMPLATE/bug_report.md) template
- Suggest features using our [Feature Request](.github/ISSUE_TEMPLATE/feature_request.md) template
- Check our [Contributing Guide](.github/CONTRIBUTING.md) to help improve this template

## 📝 License

This template is provided under the MIT License. See [LICENSE](LICENSE) for details.

Your mod can use any license you choose.

## 🏆 Credits

### Template Author
**Lille** - Edge Gaming

### Contributors
See [Contributors](../../graphs/contributors) for everyone who has helped improve this template.

## 📌 Version

**1.0.0** - Initial Release

---

## 🎮 Ready to Start Modding?

1. Check out the [Setup Checklist](CHECKLIST.md)
2. Follow the [Setup Instructions](SETUP_INSTRUCTIONS.md)
3. Start coding your mod!

Happy modding! ✨
