package com.mrpowergamerbr.temmiewebhook;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;

public class TemmieWebhook {
	public static final Gson gson = new Gson();
	public String url;
	
	public TemmieWebhook(String url) {
		this.url = url;
	}
	
	public void sendMessage(DiscordMessage dm) {
		HttpRequest.post("https://discordapp.com/api/webhooks/266185886104813568/KJCT1OurPHemam39Q8WZx1NbHxFJ0NFlhpITg5LLTRQ1-LB-oGMIWDUDQbEFXP_NR5qS")
				.acceptJson()
				.contentType("application/json")
				.header("User-Agent", "Mozilla/5.0 (X11; U; Linux i686) Gecko/20071127 Firefox/2.0.0.11") // Why? Because discordapp.com blocks the default User Agent
				.send(gson.toJson(dm))
				.body();
	}
	
	public void sendEmbed() {
		// soon
	}
}
