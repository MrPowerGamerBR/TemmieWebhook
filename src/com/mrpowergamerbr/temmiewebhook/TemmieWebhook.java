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
		String response = HttpRequest.post(url)
				.acceptJson()
				.contentType("application/json")
				.header("User-Agent", "Mozilla/5.0 (X11; U; Linux i686) Gecko/20071127 Firefox/2.0.0.11") // Why? Because discordapp.com blocks the default User Agent
				.send(gson.toJson(dm))
				.body();

		if (!response.isEmpty()) {
			System.out.println(response);
		}
	}
}
