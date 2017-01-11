package com.mrpowergamerbr.temmiewebhook;

import java.util.ArrayList;
import java.util.List;

import com.mrpowergamerbr.temmiewebhook.embed.AuthorEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.FieldEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.FooterEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.ImageEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.ProviderEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.ThumbnailEmbed;
import com.mrpowergamerbr.temmiewebhook.embed.VideoEmbed;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * A discord embed
 * 
 * @author MrPowerGamerBR
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class DiscordEmbed {
	String title;
	String type;
	String description;
	String url;
	String timestamp;
	int color;
	FooterEmbed footer;
	ImageEmbed image;
	ThumbnailEmbed thumbnail;
	VideoEmbed video;
	ProviderEmbed provider;
	AuthorEmbed author;
	List<FieldEmbed> fields = new ArrayList<FieldEmbed>();
	
	public DiscordEmbed() {

	}
	
	public DiscordEmbed(String title, String description) {
		this(title, description, null);
	}
	
	public DiscordEmbed(String title, String description, String url) {
		setTitle(title);
		setDescription(description);
		setUrl(url);
	}
	
	public static DiscordMessage toDiscordMessage(DiscordEmbed embed, String username, String avatarUrl) {
		DiscordMessage dm = DiscordMessage.builder()
				.username(username)
				.avatarUrl(avatarUrl)
				.content("")
				.embed(embed)
				.build();
		
		return dm;
	}
	
	public DiscordMessage toDiscordMessage(String username, String avatarUrl) {
		return DiscordEmbed.toDiscordMessage(this, username, avatarUrl);
	}
	
	public static class DiscordEmbedBuilder {
		List<FieldEmbed> fields = new ArrayList<FieldEmbed>();
		
		public DiscordEmbedBuilder field(FieldEmbed field) {
			fields.add(field);
			return this;
		}
	}
}
