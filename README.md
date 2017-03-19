# TemmieWebhook
<p align="center"><img src ="https://media.tenor.co/images/7f4a3d7eb223757a5eb36b355948060b/raw"></img></p>

## A simple, straightforward, Discord Webhook API for Java
So simple, that we don't even need a huge tutorial for it.

### Messages
**Code:**
```
TemmieWebhook temmie = new TemmieWebhook("Your Webhook URL here (Get it by going to your server configurations -> Webhook");
// Username, Content, Avatar URL
DiscordMessage dm = new DiscordMessage("Temmie", "hOI, im TEMMIE!", "https://media.tenor.co/images/d205ef37ba5aad7b84fc21f6ffb36c6b/raw");
temmie.sendMessage(dm);
```
**Output:**

![http://i.imgur.com/83eUEi3.png](http://i.imgur.com/83eUEi3.png)
### Embeds
Because all the fancy programmers are using embeds in Discord, so why shouldn't we?

**Code:**
```
TemmieWebhook temmie = new TemmieWebhook("Your Webhook URL here (Get it by going to your server configurations -> Webhook");
DiscordEmbed de = new DiscordEmbed("Temmie", "Temmie (/ˈtɛ.miː/) is a species of monster in the Underground. They appear as a unique enemy in Waterfall, residents of Temmie Village, and the vendor of Tem Shop. ");
ThumbnailEmbed te = new ThumbnailEmbed();
te.setUrl("http://vignette3.wikia.nocookie.net/undertale/images/9/9c/Temmie.gif/revision/latest?cb=20151206115948");
te.setHeight(96);
te.setWidth(96);
de.setThumbnail(te);
DiscordMessage dm = new DiscordMessage("Temmie", "", "https://img04.deviantart.net/360e/i/2015/300/9/d/temmie_by_ilovegir64-d9elpal.png");
dm.getEmbeds().add(de);
temmie.sendMessage(dm);
```
**Output:**

![http://i.imgur.com/g5qsrKh.png](http://i.imgur.com/g5qsrKh.png)
### Builders
Do you prefer using builders? No problem!

#### Messages Builder
**Code:**

```
TemmieWebhook temmie = new TemmieWebhook("Your Webhook URL here (Get it by going to your server configurations -> Webhook");
DiscordMessage dm = DiscordMessage.builder()
		.username("Temmie") // We are creating a message with the username "Temmie"...
		.content("RATED TEM OUTTA TEM.") // with this content...
		.avatarUrl("http://img14.deviantart.net/de17/i/2015/364/0/4/undertale_temmie_by_silvishinystar-d9lpf55.png") // with this avatar...
		.build(); // and now we build the message!
		
temmie.sendMessage(dm);
```
**Output:**

![http://i.imgur.com/gpzksDu.png](http://i.imgur.com/gpzksDu.png)

#### Embed Builder
**Code:**

```
TemmieWebhook temmie = new TemmieWebhook("Your Webhook URL here (Get it by going to your server configurations -> Webhook");
DiscordEmbed de = DiscordEmbed.builder()
		.title("RATED TEM OUTTA TEM.") // We are creating a embed with this title...
		.description("fhsdhjfdsfjsddshjfsd ") // with this description...
		.url("https://github.com/MrPowerGamerBR/TemmieWebhook") // that, when clicked, goes to the TemmieWebhook repo...
		.footer(FooterEmbed.builder() // with a fancy footer...
				.text("TemmieWebhook!") // this footer will have the text "TemmieWebhook!"...
				.icon_url("http://vignette2.wikia.nocookie.net/undertale-brasil/images/4/4f/Temmie.jpg/revision/latest?cb=20160221005012&path-prefix=pt-br") // with this icon on the footer
				.build()) // and now we build the footer...
		.thumbnail(ThumbnailEmbed.builder() // with a fancy thumbnail...
				.url("http://i.imgur.com/7kznsnS.png") // with this thumbnail...
				.height(128) // not too big because we don't want to flood the user chats with a huge image, right?
				.build()) // and now we build the thumbnail...
		.fields(Arrays.asList( // with fields...
				FieldEmbed.builder()
				.name("hOI!!!!!! i'm tEMMIE!!")
				.value("awwAwa cute!! (pets u)")
				.build(),
				FieldEmbed.builder()
				.name("OMG!! humans TOO CUTE (dies)")
				.value("NO!!!!! muscles r... NOT CUTE | NO!!!!!")
				.build(),
				FieldEmbed.builder()
				.name("NO!!! so hungr... (dies) ")
				.value("FOOB!!! ")
				.build()
				))
		.build(); // and finally, we build the embed
	
DiscordMessage dm = DiscordMessage.builder()
		.username("Temmie") // We are creating a message with the username "Temmie"...
		.content("") // with no content because we are going to use the embed...
		.avatarUrl("http://img06.deviantart.net/a35d/i/2016/056/c/3/temmie___undertale_by_tartifondue-d9t3h1h.png") // with this avatar...
		.embeds(Arrays.asList(de)) // with the our embed...
		.build(); // and now we build the message!
	
temmie.sendMessage(dm);
```
**Output:**

![http://i.imgur.com/ttSOjsU.png](http://i.imgur.com/ttSOjsU.png)

___

Simple as that, have fun!

### Maven
You can use TemmieWebhook with Maven by using Jitpack. (sorry, I don't have a maven repo yet :cry:)
```
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
    </repository>
</repositories>
```
```
<dependency>
    <groupId>com.github.MrPowerGamerBR</groupId>
	<artifactId>TemmieWebhook</artifactId>
	<version>-SNAPSHOT</version>
</dependency>
```
### Dependencies
Gson

[HttpRequest](https://github.com/kevinsawicki/http-request) by @kevinsawicki

lombok

### Why Temmie?
Why not Temmie?
