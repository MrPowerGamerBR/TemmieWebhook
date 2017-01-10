package com.mrpowergamerbr.temmiewebhook.embed;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImageEmbed {
	String url;
	String proxy_url;
	int height;
	int width;
}
