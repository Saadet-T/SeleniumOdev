# SeleniumOdev
B191210028 / Saadet Elif Tokuoglu / Selenium Odev

Driver dosyası "D:\\Selenium Driver\\ChromeDriver\\chromedriver.exe" dizininde olmalıdır.

1. Yazılımın Geliştirilme Amacı

Bu yazılımın geliştirilme amacı oluşturulan bir web uygulama projesindeki fonksyionların ve 
işlemlerinin istenildiği gibi gerçekleştiğinden emin olmak. Resimlerin display edildiğininden linklerin 
çalıştığından, uygulamadaki renklerin istenilen renkler olduğundan emin olmak için yazılan bir testtir. 

2.Yazılımın Geliştirilmesi 

Ödeve başlarken önce “Ödevi sınıflara ayırmalı mıyım?” sorusuyla karşılaştım. Ardından sınıflara 
ayırmaya karar verdim. Toplam beş sınıf oluşturdum bu sınıflar; SurucuAta , ColorCheck, ImageTest, 
AddingAndRemovalTest ve FeaturesTest sınıflarıydı. 

SurucuAta Sınıfı: 

 Her test için her sınıf ve fonksiyonda yeniden surucu atamak gidilecek URL’i belirlemek ekranı tam 
boyuta çevirmek için gerekli olan kodları tekrar tekrar yazmak istemediğim için SurucuAta sınıfını 
ve surucuAta fonksiyonunu oluşturdum. Böylelikle kod tekrarı olmayacaktı. 

![image](https://github.com/Saadet-T/SeleniumOdev/assets/68515706/1e737e46-2e7f-4c79-b2e6-6d968430cacd)

ColorCheck Sınıfı: 

ColorCheck sınıfı ilk yazdığım sınıftı hem selenium’a alışmak için hemde xpath kullanımını 
öğrenmek için yardımcı oldu. İçinde dört fonksiyon bulunmakta. Bu fonksiyonlar Trendyol 
sitesindeki “Sepete Ekle” butonunun rengi, buton üzerindeki yazının renk kontrolü , ürün ücretlerinin 
renk kontrolü ve sitedeki navbar listelerinin renk kontrollerini yapmaktan sorumluydu. 

ImageTest Sınıfı: 

ImageTest sınıfında iki fonksiyon vardı bu fonksiyonlardan tokaResimDisplay belirlenen bir resmin 
display edilip edilmediğimi test ederken ve resim ile ilgili bir sorun olmazsa resmin “alt” metnini 
ekrana yazarken, kadinLinkResimTest link görevi gören bir resimin tıklandıktan sonra yönlendirme 
görevi verilen URL’e doğru bir şekilde yönlendirmenin gerçekleşip gerçekleşmediğini test etmek 
göreviydi. 

AddingAndRemovalTestSınıfı: 

Normalde ödeve ilk başladığımda bütün fonksiyonellik testlerini FeaturesTest sınıfında yapmayı 
düşünüyordum ama ödevin ilerleyen süreçlerinde FeaturesTest sınıfının çok dolduğunu fark ettim ve 
farklı ekleme ve çıkarma fonksiyonlarının burada toplandığını bunları ayrı bir sınıfta 
toplayabileceğime karar verip bu sınıfı oluşturdum. (Buradaki bütün fonksiyonlarda FeaturesTest 
içinden login() fonksiyonu çağırılmaktadır. Fonksiyonu FeaturesTest sınıfını anlatırken anlatacağım 
için burada bahsetmedim.) 

sepeteEkleTest fonksiyonu verilen URL’deki ürünün sepete eklenip eklenmediğini kontrol ediyor. 
Burada ürün sepete eklendikten sonra /sepet dizinindeki ürüne ait fiyatın belirtildiği kısıma gidiyor ve 
fiyat kısmı boş değilse sepet ürüne eklenmiştir diyor. Diğer testlerde karışıklık olmasın diye eklenen 
ürün ardından sepetten çıkartılıyor. 

sepetCikarmaTest fonksiyonu verilen URL’deki ürünü sepete ekledikten sonra sepete giderek 
sepette bulunan “trash” işareti ile sepetteki ürünü kaldırıyor. Ardından sitede bulunan ve sepetteki 
ürün sayısını belirten elementte Text’in içeriğinin “Sepetim (0 Ürün)” olup olmadığını kontrol ederek 
sepetten ürünün çıkartımının yapılıp yapılmadığını test ediyor. 

favoriEklemeCikarmaTest bu fonksiyon iki testi bir arada yapmakta ve iki çıktı vermekte . Bu 
fonksiyon önce kendine verilen URL’e gidiyor. Bu URL’deki ürünü favorilerine ekliyor ardından 
“Favorilerim” kısmına giderek (URL ile değil XPath ile tıklayarak gidiyor) ürünün favorileri arasına 
eklenip eklenmediğine favorilerdeki ürünün “ Straight Dokuma” yazısını içerip içermediğini kontrol 
ederek karar veriyor . Ardından ürünü favorilerden kaldırıyor ve web elementinde “ Favoriler Listeniz 
Henüz Boş” yazısını içerip içermediğini kontrol ederek ürünün kaldırıldığını kontrol ediyor. 

koleksiyonaUrunEkleveSil bu fonksiyon iki testi bir arada yapmakta ve iki çıktı vermekte .Bu 
fonksiyon önce ürüne gidiyor ürünü koleksiyona eklemek için yeni bir koleksiyon oluşturuyor. 
Kolesiyonu oluşturduktan sonra koleksiyona “Yazilim Testi Koleksiyon” adını veriyor ve 
koleksiyona ürünü ekliyor. Koleksiyona giderek ürünün eklenip eklenmediğini kontrol ediyor. 
Ardından ürünü çıkarıyor ve ürünün çıkarılıp çıkarılmadığını kontrol ediyor. 

FeaturesTest Sınıfı: 

Login bu fonksiyon herhangi bir test için yazılmamıştır. Fonksiyon kod tekrarı olmasın diye 
oluşturulmuştur görevi kendine verilen girdilerle siteye giriş yapmaktır. 
asusCheckBox fonksiyonu Windows araması yapılmış searchbar’da tercihler üzerinden laptop olarak 
ASUS chechbox’ını işaretlemek ve fonksiyonun işaretlenip işaretlenmediğini kontrol etmek için 
yazılmıştır. 

scrollUpCheck sitede aşağıya kaydırma yapıldığında “ Yukarı Çık” yazılı bir buton oluşmaktadır ve 
bu buton site görünüşünü en başa getirmektedir. Burada fonksiyon yazılırken iki zorlukla karşılaştım 
birincisi siteyi aşağıya doğru kaydırılmasını sağlamaktı. Siteyi kaydırdıktan sonra karşıma çıkan sorun 
ise çerezleri kabul etme butonunun yukarı çık butonunun önüne geçmesinden kaynaklı olarak yukarı 
çık butonunu kullanamamaktı o yüzden bir de çerezleri kabul etmesini sağladım fonksiyonun. 

sepeteEkleFiyatArtisTest bu fonksiyon sepete bir ürün ekliyor ürünü ekledikten sonra sepette 
sayısını bir arttırıyor . Ürünün sayısının arttırıldıktan sonra fiyatının da doğru arttırılıp arttırılmadığını 
test ediyor. 

loginTest bu fonksiyon siteye kayıtlı bir kullanıcının bilgileri verildikten sonra siteye giriş yapıp 
yapmadığını kontrol ediyor. Kontrol için DOM üzerinde kullanıcının mailinin bulunmasını 
kullanıyor. 

koleksiyonOlusturma bu fonksiyon iki testi bir arada yapmakta ve iki çıktı vermekte .Bu fonksiyon 
/koleksiyonlarım dizininden yeni bir koleksiyon oluşturup adını atıyor. Ardından koleksiyonun 
oluşturulup oluşturulmadığını kontrol ediyor. Ve ardından oluşturulan koleksiyonu siliyor ve silinip 
silinmediğini kontrol ediyor. 

takipEdilenKoleksiyonSilme bu fonksiyonun temel görevi kullanıcı giriş yaptıktan sonra takip ettiği 
koleksiyonlara giderek oradan bir koleksiyon silmek. Bu fonksiyonda bana sorun olan kısım şuydu ki 
Trendyol’un web sitesinde koleksiyon ekleme fonksiyonu bulunmamaktaydı ama mobil 
uygulamasında bulunmaktaydı. Koleksiyon takip etmek ile ilgili de bir test yapmak istiyordum ama 
bu yüzden telefondan koleksiyonları takip ettim ve koleksiyon silme testini yazdım. 

duyuruTercihleriGuncelleme bu fonksiyon sitede bulunan duyuruları telefondan veya mail 
üzerinden almak isterim kısmını test ediyor. Mail üzerinden almak isterimi açmak veya kapatmak 
üzerine ayarlandı. İki durumda da pop-up çıkarak “Değişiklikler kaydedildi” dediği için kontrol temeli 
olarak bu pop-up’ın oluşmasını alıyor . 

gecmisiAcKapaGuncelle bu fonksiyon site üzerinde iki test yapıyor öncelikle kendisine verilen iki 
ürünü ziyaret ettikten sonra /önceden-gezdiklerim dizinine gidiyor burada geçmişi kapatıyor ve 
geçmişin kapatılıp kapatılmadığını ürünlerin listelenmediğini görerek karar veriyor. Ardından geçmişi 
açıyor ve kendine verilen bir ürünü ziyaret ettikten sonra yeniden /önceden-gezdiklerim dizinine 
gidiyor ve ürünün bu dizinde bulunmasından yola çıkarak geçmişin açıldığını onaylıyor. 

magazaTakipEtmeBirakma bu fonksiyon site üzerinde iki test yapıyor . İlk olarak kendine verilen 
bir ürüne gidiyor ve sol tarafta bulunan mağaza takip etme butonundan mağazayı takip ediyor. 
Ardından butonun üzerindeki yazının “Takip Ediliyor” yazısına dönüp dönmediğini kontrol ediyor. 
Ardından takipten çıkıp üzerindeki yazının “Takip Et” yazısına dönüp dönmediğini kontrol ediyor. 

urunSorularinaGit bu fonksiyon kendisine verilen ürüne gittikten sonra ürünle ilgili soruların 
bulunduğu URL’e ilerleyip ilerlemediğini kontrol ediyor. 

ANA KONSOL 

Ana konsolda dört durum var bu dört durumdan birinin seçilmesi durumunda o testler çalıştırılıyor. 
Testler bittikten sonra bildirim geliyor ve farklı testler denenmek istenirse gerekli numaranın girilmesi 
durumunda testler gerçekleniyor. 
