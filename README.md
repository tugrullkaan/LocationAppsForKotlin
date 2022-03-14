# LocationAppsForKotlin
LocationApps for kotlin learning

Sosyal bir uygulama yazacağımız için sunucuları kullanmamız gerekiyor.Bunun için backend servisi olarak parse kullanacağız.Open source bir platform olan parse birçok kullanım alanı var.Android kotlin için parse kullanacağımız için kütüphanelerini entegre ettik.Kullanıcı girişi, lokasyon bilgileri gibi özellikleri ekledim ve parse kullanarak sunucuya kayıt ettim.

![image](https://user-images.githubusercontent.com/61920968/158148157-34f55e38-7129-411f-aaf6-74e119149f64.png)
![image](https://user-images.githubusercontent.com/61920968/158148181-4b85eb95-266c-44a3-a91b-e046c4ad1576.png)

Yazdığım Forsquare clone uygulamama haritalar eklentisi ekledim.Eklediğim lokasyon bilgilerini sunucuma kayıt ettikten sonra açılan ekrandan konum seçerek kullanıcı gerekli bilgilerini tamamlayarak işlemi sonlandırıyor.

![image](https://user-images.githubusercontent.com/61920968/158148279-339d507d-8285-4655-b4f3-a36cffd044e3.png)
![image](https://user-images.githubusercontent.com/61920968/158148288-471bddc6-4b3c-4d97-b565-ee939c9bb85b.png)

Yaptığım son değişiklerle beraber haritalar aktivitesinde yaptığım lokasyon seçimini parse kullanarak ismini,lokasyon tipini enlem ve boylamını,lokasyon resmini kayıt ediyor.Parse api web sitesi üzerinden de yaptığım kontroller sonucunda işlem başarıyla gerçekleşti.Sunucu üzerinde gerekli veriler başarıyla kayıt edildi.Yaptığım uygulama bunları tamamlamamla birlikte tamamlanıyor.Parsa backend servisini ve Google haritaları kullanarak verimli bir uygulama geliştirdik ve bilgilerimi tazeledim.

![image](https://user-images.githubusercontent.com/61920968/158148356-58bc560f-6a30-4ed4-8f76-8cce4f5444e7.png)
![image](https://user-images.githubusercontent.com/61920968/158148367-9df6c4bc-4bb1-4739-b569-894c08bf14aa.png)

Hazır parse kodlarını çalıştıran birçok sunucu var.Önemli olan en iyi sunucuyu bulmamızdır.Back4App kullanmanın daha iyi olacağını ve parse için yapıldığı için onu kullanmaya karar verdim.Site üzerinden kayıt oluşturduktan sonra parse üzerinden start activitiy üzerinde gerekli olan sunucu bağlantı bilgileri(appid,clientkey,server adress)kayıt ettim ve projeme entegre ettim.

![image](https://user-images.githubusercontent.com/61920968/158148440-a712d251-c549-4a39-bf80-009ce716e760.png)
![image](https://user-images.githubusercontent.com/61920968/158148457-038ea768-84c5-4912-bcf6-f6247f803d12.png)
