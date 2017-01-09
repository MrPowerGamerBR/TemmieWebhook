# TemmieWebHook
<div style="text-align:center"><img src ="https://media.tenor.co/images/7f4a3d7eb223757a5eb36b355948060b/raw" /></div>
## A simple, straightforward, Discord Webhook API for Java
So simple, that we don't even need a huge tutorial for it.

```
TemmieWebhook temmie = new TemmieWebhook("Your Webhook URL here (Get it by going to your server configurations -> Webhook");
// Username, Content, Avatar URL
DiscordMessage dm = new DiscordMessage("Temmie", "hOI, im TEMMIE!", "https://media.tenor.co/images/d205ef37ba5aad7b84fc21f6ffb36c6b/raw");
temmie.sendMessage(dm);
```

Simple as that, have fun!

### Dependencies
Gson

[HttpRequest](https://github.com/kevinsawicki/http-request) by @kevinsawicki

### Why Temmie?
Why not Temmie?