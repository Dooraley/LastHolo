package com.gmail.JyckoSianjaya.LastHolo.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.gmail.JyckoSianjaya.LastHolo.Utility.Utility;

public class LHListener implements Listener {
	private SimpleHandler handler = SimpleHandler.getInstance();
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		handler.onJoin(e);
	}
	/*@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		handler.manageChat(e);
	}*/
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		handler.manageMove(e);
}
	@EventHandler
	public void onDisconnect(PlayerKickEvent e) {
		handler.manageKick(e);
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		handler.manageQuit(e);
	}
}
