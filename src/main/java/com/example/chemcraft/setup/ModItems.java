package com.example.chemcraft.setup;

import com.example.chemcraft.Chemcraft;
import com.example.chemcraft.item.element.ElementEnum;
import com.example.chemcraft.item.element.ElementItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.spongepowered.asm.mixin.MixinEnvironment;

@Mod.EventBusSubscriber(modid = Chemcraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Chemcraft.MODID);
    public static final RegistryObject<Item> HYDROGEN = ITEMS.register("hydrogen", () -> new Item(new Item.Properties().tab(ChemcraftCreativeModeTab.CHEMCRAFT_TAB)));

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ElementItem.elementItems.toArray(new Item[0]));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
