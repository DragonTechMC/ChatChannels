package com.dragontechmc.chatchannels;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatHandler {
	
	private Minecraft mc;
	
	public ChatHandler(Minecraft mc)
	{
		super();
		this.mc = mc;
	}
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onChatEvent(ServerChatEvent event)
	{
		event.setCanceled(true);
		for (WorldServer world : MinecraftServer.getServer().worldServers){
			
			List<EntityPlayer> players = world.playerEntities;
			
			for (EntityPlayer player : players){
				
				player.getEntityData().setString("ChatChannel", "norwegian");
				
				NBTTagCompound tag = player.getEntityData();
				
				if (tag.getString("ChatChannel") != null)
					if (tag.getString("ChatChannel").equals("norwegian"))
						player.addChatMessage(new ChatComponentText("[Ch: " + tag.getString("ChatChannel") + "]" + event.username + ": " + event.message));
			}
		}
	}
}
