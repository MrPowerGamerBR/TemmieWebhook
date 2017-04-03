package com.mrpowergamerbr.temmiewebhook.exceptions;

public class WebhookException extends RuntimeException {
	public WebhookException(String reason) {
		super(reason);
	}
}
