package ddarkz.vits.item;

import ddarkz.vits.ValleysInTheSky;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item register(Item.Settings itemSettings, String name) {
        Identifier id = Identifier.of(ValleysInTheSky.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = itemSettings.registryKey(key);
        return Registry.register(Registries.ITEM, key, new Item(settings));
    }
    //ITEMS
    public static final Item GENERIC_SCYTHE = register(
            new Item.Settings().maxDamage(255),
            "generic_scythe"
    );
    public static final Item VALLEY_TOMATO = register(
            new Item.Settings(),
            "valley_tomato"
    );
    public static final Item VALLEY_WHEAT = register(
            new Item.Settings(),
            "valley_wheat"
    );
    public static final Item BREAD_ROLL = register(
            new Item.Settings(),
            "bread_roll"
    );

    public static void initialize() {
        ValleysInTheSky.LOGGER.info("Registering Item: " + ValleysInTheSky.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.GENERIC_SCYTHE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(ModItems.VALLEY_TOMATO));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(itemGroup -> itemGroup.add(ModItems.VALLEY_WHEAT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register(itemGroup -> itemGroup.add(ModItems.BREAD_ROLL));
    }
}
