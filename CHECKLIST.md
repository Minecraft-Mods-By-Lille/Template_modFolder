# New Mod Setup Checklist

Use this checklist when creating a new mod from this template.

## ☐ Step 1: Copy Template
- [ ] Copy the entire "Template Mod Folder" to a new location
- [ ] Rename the folder to your mod's name
- [ ] Replace `.gitignore` with `.gitignore.example` (rename it to `.gitignore`)

## ☐ Step 2: Update gradle.properties
- [ ] Change `mod_id` to your unique mod ID (lowercase, no spaces)
- [ ] Change `mod_name` to your mod's display name
- [ ] Change `mod_version` to your starting version (usually 1.0.0)
- [ ] Change `mod_authors` to your name
- [ ] Change `mod_description` to describe your mod
- [ ] Change `mod_credits` if you have any credits to add
- [ ] Update `mod_license` if not using MIT

## ☐ Step 3: Update settings.gradle
- [ ] Change `rootProject.name = 'yourmodid'` to match your mod_id

## ☐ Step 4: Rename Folders
- [ ] Rename `src/main/java/net/yourmodid/` to `src/main/java/net/YOUR_MOD_ID/`
- [ ] Rename `src/main/resources/assets/yourmodid/` to match your mod_id
- [ ] Rename `src/main/resources/data/yourmodid/` to match your mod_id

## ☐ Step 5: Update Main Mod Class
- [ ] Open `src/main/java/net/YOUR_MOD_ID/YourModName.java`
- [ ] Update package declaration: `package net.YOUR_MOD_ID;`
- [ ] Change `MOD_ID` constant to match your mod_id
- [ ] Rename the file to match your mod's name (e.g., `AwesomeMod.java`)
- [ ] Rename the class to match the filename

## ☐ Step 6: Update Language File
- [ ] Open `src/main/resources/assets/YOUR_MOD_ID/lang/en_us.json`
- [ ] Update `"itemGroup.yourmodid"` to `"itemGroup.YOUR_MOD_ID"`

## ☐ Step 7: Add Logo (Optional)
- [ ] Create a PNG logo (256x256 recommended)
- [ ] Save it as `src/main/resources/YOUR_MOD_ID.png`
- [ ] Update `logoFile` in `neoforge.mods.toml` if using different name

## ☐ Step 8: Update Documentation
- [ ] Update `README.md` with your mod's information
- [ ] Update `LICENSE` with your name and year
- [ ] Keep or remove template documentation files as needed

## ☐ Step 9: First Build
- [ ] Open terminal in your mod folder
- [ ] Run `./gradlew build`
- [ ] Verify build completes successfully
- [ ] Check that jar file is created in `build/libs/`

## ☐ Step 10: Test in VS Code
- [ ] Open the mod folder in VS Code
- [ ] Go to Run and Debug (Ctrl+Shift+D)
- [ ] Select "Client" configuration
- [ ] Press F5 to start debugging
- [ ] Verify Minecraft launches with your mod loaded

## ☐ Step 11: Initialize Git (Optional)
- [ ] Run `git init` in your mod folder
- [ ] Run `git add .`
- [ ] Run `git commit -m "Initial commit"`
- [ ] Create a GitHub repository
- [ ] Push your code

## ☐ Step 12: Start Developing!
- [ ] Create your first block, item, or feature
- [ ] Test frequently using the VS Code debugger
- [ ] Commit your changes regularly

## Common Issues

### Build fails with "Could not find mod_id"
→ Make sure you updated `mod_id` in gradle.properties

### Mod doesn't load in game
→ Check that your MOD_ID constant matches mod_id in gradle.properties
→ Verify package names match your folder structure

### VS Code debugger won't start
→ Run `./gradlew build` first to generate the required files
→ Make sure Java 21 is installed and configured

### Missing textures/models
→ Ensure asset folders are named correctly (must match mod_id)
→ Check that resource paths in code match folder structure

## Need Help?

- [NeoForge Documentation](https://docs.neoforged.net/)
- [NeoForge Discord](https://discord.neoforged.net/)
- [Minecraft Wiki](https://minecraft.wiki/)
- [ModDevGradle Wiki](https://github.com/neoforged/ModDevGradle/wiki)

---

**Remember**: Save this checklist for future reference when creating new mods!
