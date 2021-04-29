package com.supermartijn642.forgelanissue;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Created 1/22/2021 by SuperMartijn642
 */
@Mod("forgelanissue")
public class ForgeLanIssue {

    public ForgeLanIssue(){
    }

    // 1. Start a Minecraft instance, create a world and save it, and close the instance
    // 2. Comment out the class Events below
    // 3. Start two Minecraft instances
    // 4. Load the previously created world and open it to LAN in one of the instances
    // 5. Try to join the LAN session with the other instance

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Events {
        @SubscribeEvent
        public static void onBlockRegistry(RegistryEvent.Register<Block> e){
            e.getRegistry().register(new Block(AbstractBlock.Properties.create(Material.ROCK)).setRegistryName("block"));
        }
    }

}
