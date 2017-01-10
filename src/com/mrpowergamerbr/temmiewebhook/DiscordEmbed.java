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
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public FooterEmbed getFooter() {
		return footer;
	}

	public void setFooter(FooterEmbed footer) {
		this.footer = footer;
	}

	public ImageEmbed getImage() {
		return image;
	}

	public void setImage(ImageEmbed image) {
		this.image = image;
	}

	public ThumbnailEmbed getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(ThumbnailEmbed thumbnail) {
		this.thumbnail = thumbnail;
	}

	public VideoEmbed getVideo() {
		return video;
	}

	public void setVideo(VideoEmbed video) {
		this.video = video;
	}

	public ProviderEmbed getProvider() {
		return provider;
	}

	public void setProvider(ProviderEmbed provider) {
		this.provider = provider;
	}

	public AuthorEmbed getAuthor() {
		return author;
	}

	public void setAuthor(AuthorEmbed author) {
		this.author = author;
	}

	public ArrayList<FieldEmbed> getFields() {
		return fields;
	}

	public void setFields(ArrayList<FieldEmbed> fields) {
		this.fields = fields;
	}
}
