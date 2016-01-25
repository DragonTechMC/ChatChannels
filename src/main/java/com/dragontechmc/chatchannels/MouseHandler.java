package com.dragontechmc.chatchannels;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.GuiScreenEvent.MouseInputEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MouseHandler {
	
	private Minecraft mc;
	
	public MouseHandler(Minecraft mc)
	{
		super();
		this.mc = mc;
	}
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onMouseEvent(MouseInputEvent event)
	{
		mc.thePlayer.addChatMessage(new ChatComponentText("" + event.getResult()));
	}
}
