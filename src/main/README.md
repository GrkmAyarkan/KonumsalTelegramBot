BOT OLUŞTURMA VE TOKEN ALMA

Bot oluşturma işlemini telegramda bir bot kullanarak yapıyoruz.

Telegram arama çubuğundan "@BotFather" olarak arama yaparak ulaşabiliriz.
(Orjinal hesap mavi tikli)

Sohbete "/start" yazarak sohbeti başlatırız.

Bot bize kullanabileceğimiz komutlatların bir listesini mesaj olarak gönderir.

"/newbot" yazarak bot oluşturma işlemi başlatırız.

Önce bot isim yazarız. Daha sonra kullanıcı adı yazmamızı ister.

Bunları girdiğimizde bize oluşturduğu botun token'ını verir.

Bot ile ilgili farklı ayarları "BotFather" sohbetinden, verilen diğer komularla yapabiliriz.

CHAT_ID BİLGİSİNE ULAŞMA

Botu kullanmak istediğimiz gruba standant bir kullanıcı ekleme işlemi gibi ekleriz.

Botu ekledikten sonra, bota yöneticilik vermeliyiz.

Herhangi bir tarayıcıdan "https://api.telegram.org/bot<BotToken>/getUpdates" adresini giderek chat_id sinie ulaşabiliriz.
Ekranda çıkan listelede istediğimiz grubun type'ı "supergrup" ı olanın id değeri, bizim işimize yaracak olan "Chat_Id" bilgisidir. 

"ok": true,
"result": [
{
"update_id": 35****02,
"my_chat_member": {
"chat": {
"id": -1002******817,
"title": "Konumsal",
"type": "supergroup"
},