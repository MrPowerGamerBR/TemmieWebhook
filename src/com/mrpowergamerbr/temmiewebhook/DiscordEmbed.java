package com.mrpowergamerbr.temmiewebhook;

import java.util.ArrayList;

import com.mrpowergamerbr.temmiewebhook.embed.*;

import lombok.*;

/**
 * A discord embed
 * 
 * @author MrPowerGamerBR
 */
@Getter
@Setter
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
	ArrayList<FieldEmbed> fields = new ArrayList<FieldEmbed>();
	
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
}
