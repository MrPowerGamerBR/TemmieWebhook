package com.mrpowergamerbr.temmiewebhook.builders;

import com.mrpowergamerbr.temmiewebhook.DiscordMessage;

/**
 * Builder for {@link DiscordMessage}
 * 
 * @author MrPowerGamerBR
 */
public class DiscordMessageBuilder {
	public String username;
	public String content;
	public String avatar_url;
	
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
	
	public DiscordMessage build() {
		return new DiscordMessage(username, content, avatar_url);
	}
}
