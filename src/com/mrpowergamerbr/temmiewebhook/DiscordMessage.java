package com.mrpowergamerbr.temmiewebhook;

import java.util.ArrayList;

/**
 * A discord message
 * 
 * @author MrPowerGamerBR
 */
public class DiscordMessage {
	String username;
	String content;
	String avatar_url;
	boolean tts;
	ArrayList<DiscordEmbed> embeds = new ArrayList<DiscordEmbed>();
	
	public DiscordMessage() {
		
	}
	
	public DiscordMessage(String username, String content, String avatar_url) {
		setUsername(username);
		setContent(content);
		setAvatarUrl(avatar_url);
	}
	
	public DiscordMessage(String username, String content, String avatar_url, boolean tts) {
		setUsername(username);
		setContent(content);
		setAvatarUrl(avatar_url);
		setTextToSpeech(tts);
	}
	
	public void setUsername(String username) {
		this.username = username.substring(0, Math.min(32, username.length()));
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setAvatarUrl(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	
	public void setTextToSpeech(boolean tts) {
		this.tts = tts;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getAvatarUrl() {
		return avatar_url;
	}
	
	public boolean isTextToSpeech() {
		return tts;
	}
	
	public ArrayList<DiscordEmbed> getEmbeds() {
		return embeds;
	}
}
