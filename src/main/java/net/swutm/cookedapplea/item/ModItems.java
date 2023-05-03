package net.swutm.cookedapplea.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.cookedapplea.cookedapplea;

public class ModItems {

    public static final Item COOKED_APPLES = registerItem("cooked_apples",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.COOKED_APPLES)));



    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(cookedapplea.MOD_ID, name), item);
    }

    public static void registerModItems() {
        cookedapplea.LOGGER.info("1" + cookedapplea.MOD_ID);
    }
}
