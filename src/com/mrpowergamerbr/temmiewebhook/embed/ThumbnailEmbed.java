package com.mrpowergamerbr.temmiewebhook.embed;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ThumbnailEmbed {
	String url;
	String proxy_url;
	int height;
	int width;
}
