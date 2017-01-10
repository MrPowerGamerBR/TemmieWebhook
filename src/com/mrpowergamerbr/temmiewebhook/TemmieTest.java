package com.mrpowergamerbr.temmiewebhook;

public class TemmieTest {
	public static void main(String[] args) {
		TemmieWebhook t = new TemmieWebhook("https://discordapp.com/api/webhooks/266185886104813568/KJCT1OurPHemam39Q8WZx1NbHxFJ0NFlhpITg5LLTRQ1-LB-oGMIWDUDQbEFXP_NR5qS");
		
		DiscordEmbed embed = new DiscordEmbed();
		embed.title = "Embed Test";
		embed.description = "Hello World!";
		DiscordMessage dm = new DiscordMessage("Temmie", "", "https://img04.deviantart.net/360e/i/2015/300/9/d/temmie_by_ilovegir64-d9elpal.png");
		dm.embeds.add(embed);
		t.sendMessage(dm);
	}
}
