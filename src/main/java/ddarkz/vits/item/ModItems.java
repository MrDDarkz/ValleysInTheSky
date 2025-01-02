package ddarkz.vits.item;

import ddarkz.vits.ValleysInTheSky;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(ValleysInTheSky.MOD_ID, id);
        Item registerdItem = Registry.register(Registries.ITEM, itemID, item);
        return registerdItem;
    }
    public static final Item GENERIC_SCYTHE = register(
            new Item(new Item.Settings()),
            "generic_scythe"
    );
    public static final Item VALLEY_TOMATO = register(
            new Item(new Item.Settings()),
            "valley_tomato"
    );
    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(ModItems.GENERIC_SCYTHE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(ModItems.VALLEY_TOMATO));
    }
}
