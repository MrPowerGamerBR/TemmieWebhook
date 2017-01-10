package com.mrpowergamerbr.temmiewebhook.builders;

import com.mrpowergamerbr.temmiewebhook.DiscordEmbed;
import com.mrpowergamerbr.temmiewebhook.DiscordMessage;

/**
 * Builder for {@link DiscordMessage}
 * 
 * @author MrPowerGamerBR
 */
public class DiscordMessageBuilder {
	String username;
	String content;
	String avatar_url;
	boolean tts;
	DiscordEmbed[] embeds;
	
	public DiscordMessageBuilder() {
		
	}
	
	public DiscordMessageBuilder withUsername(String username) {
		this.username = username;
		return this;
	}
	
	public DiscordMessageBuilder withContent(String content) {
		this.content = content;
		return this;
	}
	
	public DiscordMessageBuilder withAvatarUrl(String avatar_url) {
		this.avatar_url = avatar_url;
		return this;
	}
	
	public DiscordMessageBuilder withTextToSpeech(boolean tts) {
		this.tts = tts;
		return this;
	}
	
	public DiscordMessageBuilder withEmbed(DiscordEmbed... embeds) {
		this.embeds = embeds;
		return this;
	}
	
	public DiscordMessage build() {
		DiscordMessage dm = new DiscordMessage(username, content, avatar_url, tts);
		for (DiscordEmbed embed : embeds) {
			dm.getEmbeds().add(embed);
		}
		return dm;
	}
}
