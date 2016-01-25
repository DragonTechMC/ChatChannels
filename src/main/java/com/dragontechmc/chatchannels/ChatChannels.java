package com.dragontechmc.chatchannels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
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
        MinecraftForge.EVENT_BUS.register(new GuiChannelSelector(Minecraft.getMinecraft()));
        MinecraftForge.EVENT_BUS.register(new ChatHandler(Minecraft.getMinecraft()));
        //MinecraftForge.EVENT_BUS.register();
        FMLCommonHandler.instance().bus().register(new MouseHandler(Minecraft.getMinecraft()));
    }
}
