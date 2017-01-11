package com.mrpowergamerbr.temmiewebhook;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.mrpowergamerbr.temmiewebhook.embed.AuthorEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.FieldEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.FooterEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.ImageEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.ProviderEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.ThumbnailEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.VideoEmbed;

import lombok.*;

/**
 * A discord message
 * 
 * @author MrPowerGamerBR
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class DiscordMessage {
	String username;
	String content;
	@SerializedName("avatar_url")
	String avatarUrl;
	@SerializedName("tts")
	boolean textToSpeech;
	List<DiscordEmbed> embeds = new ArrayList<DiscordEmbed>();
	
	public DiscordMessage() {
		
	}
	
	public DiscordMessage(String username, String content, String avatar_url) {
		this(username, content, avatar_url, false);
	}
	
	public DiscordMessage(String username, String content, String avatar_url, boolean tts) {
		setUsername(username);
		setContent(content);
		setAvatarUrl(avatar_url);
		setTextToSpeech(tts);
	}
	
	public void setUsername(String username) {
		if (username != null) {
			this.username = username.substring(0, Math.min(32, username.length()));
		} else {
			this.username = null;
		}
	}
}
