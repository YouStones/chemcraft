package com.example.chemcraft.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ChemcraftCreativeModeTab {
    public static final CreativeModeTab CHEMCRAFT_TAB = new CreativeModeTab("Chemcraft") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HYDROGEN.get());
        }
    };
}
