package com.mrpowergamerbr.temmiewebhook;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.mrpowergamerbr.temmiewebhook.exceptions.WebhookException;

public class TemmieWebhook {
	public static final Gson gson = new Gson();
	public String url;
	boolean blockMainThread = false;

	public TemmieWebhook(String url) {
		this(url, false);
	}

	public TemmieWebhook(String url, boolean blocking) {
		this.url = url;
		this.blockMainThread = blocking;
	}

	public void sendMessage(DiscordMessage dm) {
		Runnable r = new Runnable() {
			public void run() {
				String strResponse = HttpRequest.post(url)
						.acceptJson()
						.contentType("application/json")
						.header("User-Agent", "Mozilla/5.0 (X11; U; Linux i686) Gecko/20071127 Firefox/2.0.0.11") // Why? Because discordapp.com blocks the default User Agent
						.send(gson.toJson(dm))
						.body();

				if (!strResponse.isEmpty()) {
					Response response = gson.fromJson(strResponse, Response.class);
					try {
						if (response.getMessage().equals("You are being rate limited.")) {
							// If we are rate limited, let's wait a few seconds before sending
							// the message again.
							try {
								// TODO: Should we really block the main thread just to send the message?
								// Blocking the main thread isn't a good idea... at all...
								Thread.sleep(response.getRetryAfter());
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							sendMessage(dm);
						} else {
							throw new WebhookException(response.getMessage());
						}
					} catch (Exception e) {
						throw new WebhookException(strResponse);
					}
				}
			}
		};

		if (blockMainThread) {
			r.run();
		} else {
			Thread t = new Thread(r);
			t.start();
		}
	}
}
