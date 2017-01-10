package com.mrpowergamerbr.temmiewebhook.embed;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FieldEmbed {
	String name;
	String value;
	boolean inline;
}
