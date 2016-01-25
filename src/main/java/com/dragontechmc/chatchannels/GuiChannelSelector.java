package com.dragontechmc.chatchannels;

import java.util.Collection;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.lwjgl.opengl.GL11;

public class GuiChannelSelector extends Gui
{
	private Minecraft mc;
	
	public GuiChannelSelector(Minecraft mc)
	{
		super();
		this.mc = mc;
	}
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onRenderChannelSelector(RenderGameOverlayEvent event)
	{
	    if(event.isCancelable())
	    {      
	    	return;
	    }
	    
	    //GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		//GL11.glDisable(GL11.GL_LIGHTING);
		
		ScaledResolution resolution= new ScaledResolution( this.mc, this.mc.displayWidth, this.mc.displayHeight);
		
		this.drawString(mc.fontRendererObj, "Channel: Norwegian", 6, resolution.getScaledHeight() - 25, 16777215);
  	}
}