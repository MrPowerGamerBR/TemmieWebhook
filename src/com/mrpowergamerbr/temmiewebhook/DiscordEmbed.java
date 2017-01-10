package com.mrpowergamerbr.temmiewebhook;

import java.util.ArrayList;

import com.mrpowergamerbr.temmiewebhook.embed.*;

/**
 * A discord embed
 * 
 * @author MrPowerGamerBR
 */
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
	ArrayList<FieldEmbed> fields;
	
	public DiscordEmbed() {
		
	}
}
