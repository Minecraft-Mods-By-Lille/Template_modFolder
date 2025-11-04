# Generated Resources Folder

This folder is automatically created when you run data generation.

## What is Data Generation?

Data generation is a feature that allows you to programmatically create:
- Block states
- Block and item models
- Recipes
- Loot tables
- Tags
- Advancements
- And more!

## How to Use

1. Create data generator classes in `src/main/java/net/yourmodid/datagen/`
2. Run the "Data" configuration in VS Code (or `./gradlew runData`)
3. Generated files will appear here in `src/generated/resources/`
4. Review the generated files
5. If they look correct, copy them to `src/main/resources/` for your mod

## Example Data Generator Classes

You might create:
- `ModBlockStateProvider.java` - Generates block states
- `ModItemModelProvider.java` - Generates item models
- `ModRecipeProvider.java` - Generates recipes
- `ModLootTableProvider.java` - Generates loot tables
- `ModBlockTagProvider.java` - Generates block tags

## Benefits

- Consistency across similar items/blocks
- Less manual JSON writing
- Easier to maintain large numbers of similar items
- Reduces copy-paste errors

## Note

This folder (`src/generated/`) is typically added to `.gitignore` since it's generated.
Only commit the final files you copy to `src/main/resources/`.

## Learn More

- [NeoForge Data Generation Documentation](https://docs.neoforged.net/docs/datagen/)
