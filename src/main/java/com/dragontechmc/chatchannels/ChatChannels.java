package com.dragontechmc.chatchannels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ChatChannels.MODID, version = ChatChannels.VERSION)
public class ChatChannels
{
    public static final String MODID = "chatchannels";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.addRecipe(new ItemStack(Blocks.obsidian),
        		"AAA",
        		"A A",
        		"AAA",
        		'A', Items.wooden_axe
        );
    }
}
