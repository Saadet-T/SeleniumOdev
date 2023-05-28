/**
*
* @author Saadet Elif Tokuoğlu saadet.tokuoglu@ogr.sakarya.edu.tr
* @since 06.05.2023
* <p>
* Sitedeki ana birbirinden farklı fonksiyonların test edildiği kısım
* </p>
*/
package pkt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class FeaturesTest {
	public WebDriver login() throws InterruptedException {
		WebDriver surucu=SurucuAta.surucuAta("https://www.trendyol.com/giris?cb=https%3A%2F%2Fwww.trendyol.com%2F");
		WebElement username = surucu.findElement(By.id("login-email"));
		WebElement	password = surucu.findElement(By.id("login-password-input"));
		username.sendKeys("elifyazilimtesti@gmail.com");
		password.sendKeys("test123!test");
		Thread.sleep(2000);
		WebElement	loginButton = surucu.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button"));
		loginButton.click();
		Thread.sleep(2000);
		return surucu;
		
	} 
	public void asusCheckBox() throws InterruptedException {
		WebDriver surucu =login();
		surucu.get("https://www.trendyol.com/sr?q=windows&qt=windows&st=windows&os=1");
		WebElement asusCheckbox = surucu.findElement(By.xpath("//div/a/div[@class='fltr-item-text'][contains(text(),'ASUS')]"));
		asusCheckbox.click();
		Thread.sleep(2000);
		if(surucu.findElements(By.xpath("//div/a/div[@class='fltr-item-text chckd'][contains(text(),'ASUS')]")).size()>0) {
			System.out.println("CheckBox seçildi mi?:Evet");
		}else {
			System.out.println("Checkbox seçildi mi?: Hayır ");
		}
		Thread.sleep(5000);
		surucu.quit();
	} 
	
	public void scrollUpCheck() throws InterruptedException {
		WebDriver surucu=SurucuAta.surucuAta("https://www.trendyol.com/butik/liste/1/kadin");
//		WebDriver surucu = login();
//		surucu.get("https://www.trendyol.com/butik/liste/1/kadin");
		WebElement cookieAccept = surucu.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
		cookieAccept.click();
		JavascriptExecutor js = (JavascriptExecutor) surucu;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		WebElement scrollUpButton = surucu.findElement(By.xpath("//*[@id=\"scrollToUp\"]/div/div/span"));
		scrollUpButton.click();
		Thread.sleep(2000);
		if(surucu.findElements(By.xpath("//*[@id=\"scrollToUp\"]/div/div/span")).size()>0) {
			System.out.println("Yukarı çıktı mı?:Evet");
		}else {
			System.out.println("Yukarı çıktı mı ?: Hayır ");
		}
		Thread.sleep(5000);
		surucu.quit();
	} 
	
	
	public void sepeteEkleFiyatArtisTest() throws InterruptedException {
		WebDriver surucu = login();
		surucu.get("https://www.trendyol.com/trendyolmilla/siyah-straight-dokuma-yuksek-bel-nervur-dikisli-pantolon-twoss21pl0093-p-71519125?boutiqueId=620835&merchantId=968&sav=true");
		WebElement urunEkle = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[7]/button/div[1]"));
		urunEkle.click();
		Thread.sleep(5000);
		surucu.get("https://www.trendyol.com/sepet");
		WebElement sepettenEkle = surucu.findElement(By.xpath("//*[@id=\"pb-container\"]/div/div[2]/div[2]/div/div[4]/div/div[1]/div/div/button[2]"));
		sepettenEkle.click();
		Thread.sleep(5000);
		WebElement fiyatKontrol = surucu.findElement(By.xpath("//*[@id=\"pb-container\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div"));
	//	String fiyat= fiyatKontrol.getText();
		if(fiyatKontrol.getText().equals("327,98 TL")) {
			System.out.println("Sepete ürün ekledi mi?:Evet");
		}else {
			System.out.println("Sepete ürün ekledi mi ?: Hayır ");
		}
		WebElement sepetiBosalt = surucu.findElement(By.xpath("//*[@id=\"pb-container\"]/div/div[2]/div[2]/div/div[4]/button/i"));
		sepetiBosalt.click();
		Thread.sleep(5000);
		surucu.quit();
	} 
	
	public void loginTest() throws InterruptedException {
		WebDriver surucu=SurucuAta.surucuAta("https://www.trendyol.com/giris?cb=https%3A%2F%2Fwww.trendyol.com%2F");
//		WebDriver surucu = login();
//		surucu.get("https://www.trendyol.com/giris?cb=https%3A%2F%2Fwww.trendyol.com%2F");
		WebElement username = surucu.findElement(By.id("login-email"));
		WebElement	password = surucu.findElement(By.id("login-password-input"));
		username.sendKeys("elifyazilimtesti@gmail.com");
		password.sendKeys("test123!test");
		Thread.sleep(2000);
		WebElement	loginButton = surucu.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button"));
		loginButton.click();
		Thread.sleep(2000);
		surucu.get("https://www.trendyol.com/hesabim/siparislerim");
		WebElement kullaniciGirisKontrol = surucu.findElement(By.xpath("//*[@id=\"account-layout-container\"]/div/section[1]/p"));
		if(kullaniciGirisKontrol.getText().equals("elifyazilimtesti@gmail.com")) {
			System.out.println("Kullanıcı girişi yapıldı mı ?:Evet. Test başarılı. ");
		}else {
			System.out.println("Kullanıcı girişi yapıldı mı?: Hayır. Test başarısız. ");
		}
		Thread.sleep(5000);
		surucu.quit();
	} 
	
	
	public void koleksiyonOlusturma() throws InterruptedException {
		WebDriver surucu = login();
		surucu.get("https://www.trendyol.com/koleksiyonlar/koleksiyonlarim");
		WebElement koleksiyonEkle = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div/div[2]/div/div/button"));
		koleksiyonEkle.click();
		Thread.sleep(5000);
		WebElement koleksiyonAdi = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div[1]/div/div/div/div[2]/form/div[1]/div/input"));
		koleksiyonAdi.sendKeys("Yazilim Testi Koleksiyon");
		WebElement sepettenEkle = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div[1]/div/div/div/div[2]/form/button"));
		sepettenEkle.click();
		Thread.sleep(5000);
		surucu.get("https://www.trendyol.com/koleksiyonlar/koleksiyonlarim");
		WebElement fiyatKontrol = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div/div[3]/div/div[1]/div/span"));
		if(fiyatKontrol.getText().contains("Yazilim Testi")) {
			System.out.println("Koleksiyon oluşturuldu mu?:Evet. Test başarılı.");
		}else {
			System.out.println("Koleksiyon oluşturuldu mu?:Hayır. Test başarısız.");
		}
		
		WebElement koleksiyonSilme = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div/div[3]/div/div[1]/ul/li/div/div/div"));
		koleksiyonSilme.click();
		Thread.sleep(2000);
		WebElement koleksiyonSilme2 = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div/div[3]/div/div[1]/ul/li/div/div/ul/li[3]/span"));
		koleksiyonSilme2.click();
		Thread.sleep(5000);
		WebElement koleksiyonSilme3 = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div[1]/div/div[2]/div/button[2]"));
		koleksiyonSilme3.click();
		surucu.get("https://www.trendyol.com/koleksiyonlar/koleksiyonlarim");
		Thread.sleep(2000);
		WebElement cikarmaKontrol = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div/div[3]/div/div/span[1]"));
		if(cikarmaKontrol.getText().contains("Koleksiyonunuz Yok")) {
			System.out.println("Koleksiyon silindi mi? : Evet. Test Başarılı.");
		}else {
			System.out.println("Koleksiyon silindi mi? : Hayır. Test Başarısız.");
		}
		Thread.sleep(5000);
		surucu.quit();
	} 
	
	public void takipEdilenKoleksiyonSilme() throws InterruptedException {
		WebDriver surucu = login();
		surucu.get("https://www.trendyol.com/koleksiyonlar/takip-ettiklerim");
		WebElement koleksiyonSil = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div/div[3]/div[1]/div/ul/li[2]/div/div/div"));
		koleksiyonSil.click();
		Thread.sleep(5000);
		WebElement koleksiyonIsim = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div/div[2]/ul/li[2]/a"));
		String silinecekKoleksiyonIsim = koleksiyonIsim.getText();
		WebElement koleksiyonSil2 = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div/div[3]/div[1]/div/ul/li[2]/div/div/ul/li/span"));
		koleksiyonSil2.click();
		Thread.sleep(5000);
		WebElement silinecekKoleksiyonIsim2 = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div/div[2]/ul/li[2]/a"));
		String silinmeyenKoleksiyonIsim = silinecekKoleksiyonIsim2.getText();
		if(silinecekKoleksiyonIsim.equals(silinmeyenKoleksiyonIsim)) {
			System.out.println("Takip edilen koleksiyon silindi mi ? : Hayır. Test başarısız.");
		}else {
			System.out.println("Takip edilen koleksiyon silindi mi ? : Evet. Test başarılı. ");
		}
		Thread.sleep(5000);
		surucu.quit();
	} 
	
	public void duyuruTercihleriGuncelleme() throws InterruptedException {// Geri Don
		WebDriver surucu = login();
		surucu.get("https://www.trendyol.com/Hesabim/DuyuruTercihleri");
		WebElement tercihSec = surucu.findElement(By.xpath("//*[@id=\"root\"]/div[3]/main/section/form/div[3]/div[1]/div/label"));
		tercihSec.click();
		Thread.sleep(5000);
		WebElement tercihGuncelle = surucu.findElement(By.xpath("//*[@id=\"root\"]/div[3]/main/section/form/div[4]/button"));
		tercihGuncelle.click();
		Thread.sleep(1000);
		WebElement guncellemeKayit = surucu.findElement(By.xpath("//*[@id=\"root\"]/div[3]/main/section/div"));
//		String silinmeyenKoleksiyonIsim = silinecekKoleksiyonIsim2.getText();
	if(guncellemeKayit.getText().equals("Değişiklikler Kaydedildi")) {
			System.out.println("Tercihler güncellendi mi ? : Evet. Test başarılı.");
		}else {
			System.out.println("Tercihler güncellendi mi ? : Hayır. Test başarısız. ");
		}
	Thread.sleep(5000);
	surucu.quit();
	} 
	
	public void gecmisiAcKapaGuncelleme() throws InterruptedException {// Geri Don
		WebDriver surucu = login();
		surucu.get("https://www.trendyol.com/yuceerhome/cocuk-masa-sandalye-ozel-isimli-cekmeceli-yaz-sil-oyun-etkinlik-1-adet-masa-1-adet-sandalye-p-363433155?boutiqueId=617849&merchantId=382772");
		surucu.get("https://www.trendyol.com/yurudesign/new-home-genc-odasi-takimi-5-li-set-beton-kahve-hm16-cg-p-124883050?boutiqueId=617849&merchantId=106314");
		surucu.get("https://www.trendyol.com/onceden-gezdiklerim");
		WebElement gecmisiKapa = surucu.findElement(By.xpath("//*[@id=\"reco-gw-browsing-history\"]/div/div[1]/div/div[2]/div/div[2]"));
		gecmisiKapa.click();
		Thread.sleep(5000);
		WebElement tercihGuncelle = surucu.findElement(By.xpath("//*[@id=\"reco-gw-browsing-history\"]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/button[2]"));
		tercihGuncelle.click();
		Thread.sleep(1000);
		WebElement gecmisKapaliMiKontrol = surucu.findElement(By.xpath("//*[@id=\"reco-gw-browsing-history\"]/div/div[2]/span[1]"));
//		String silinmeyenKoleksiyonIsim = silinecekKoleksiyonIsim2.getText();
	if(gecmisKapaliMiKontrol.getText().equals("Listelenecek Ürün Bulunmamaktadır")) {
			System.out.println("Gecmis kapandi mi ? : Evet. Test başarılı.");
		}else {
			System.out.println("Gecmis kapandı mı ? : Hayır. Test başarısız. ");
		}
		WebElement gecmisiAc = surucu.findElement(By.xpath("//*[@id=\"reco-gw-browsing-history\"]/div/div[1]/div/div[2]/div/div[2]"));
		gecmisiAc.click();
		Thread.sleep(5000);
		surucu.get("https://www.trendyol.com/yuceerhome/cocuk-masa-sandalye-ozel-isimli-cekmeceli-yaz-sil-oyun-etkinlik-1-adet-masa-1-adet-sandalye-p-363433155?boutiqueId=617849&merchantId=382772");
		surucu.get("https://www.trendyol.com/onceden-gezdiklerim");
		WebElement gecmisAcikmiKontrol = surucu.findElement(By.xpath("//*[@id=\"reco-gw-browsing-history\"]/div/div[2]/div/div/a/div[2]/div[1]/span[2]"));
		if(gecmisAcikmiKontrol.getText().contains("Çocuk Masa Sandalye Özel Isimli Çekmeceli Yaz Sil Oyun Etkinlik 1 Adet Masa 1 Adet Sandalye")) {
			System.out.println("Gecmis açıldı mi ? : Evet. Test başarılı.");
		}else {
			System.out.println("Gecmis açıldı mı ? : Hayır. Test başarısız. ");
		}
		Thread.sleep(5000);
		surucu.quit();
	} 
	public void magazaTakipEtmeBirakma() throws InterruptedException {
		WebDriver surucu = login();
		surucu.get("https://www.trendyol.com/rise-and-shine/antiperspirant-whitening-roll-on-75-ml-p-316160450?boutiqueId=61&merchantId=750978");
		WebElement magazaTakipEt = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/section/div/button"));
		magazaTakipEt.click();
		Thread.sleep(5000);
		WebElement takipEdildiMi = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/section/div/button"));
		if(takipEdildiMi.getText().contains("Takip Ediliyor")) {
			System.out.println("Mağaza takip edildi mi  ? : Evet. Test başarılı.");
		}else {
			System.out.println("Mağaza takip edildi mi  ? : Hayir. Test başarısız. ");
		}
		WebElement magazaTakipCik = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/section/div/button"));
		magazaTakipCik.click();
		Thread.sleep(5000);
		WebElement takipButonYazi = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/section/div/button"));
		if(takipButonYazi.getText().contains("Takip Et")) {
			System.out.println("Mağaza takipten çıkıldı mı? : Evet . Test Başarılı.");
		}else {
			System.out.println("Mağaza takipten çıkıldı mı? : Hayır . Test Başarısız. ");
		}
		Thread.sleep(5000);
		surucu.quit();
	}
	
	public void urunSorularinaGit() throws InterruptedException {
		WebDriver surucu = login();
		surucu.get("https://www.trendyol.com/trendyol-curve/siyah-orme-yuksek-bel-toparlayici-tayt-tbbss22ta0022-p-196000002?boutiqueId=620831&merchantId=968");
		WebElement urunEkle = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/section/a[2]"));
		urunEkle.click();
		Thread.sleep(2000);
		surucu.getCurrentUrl();
		if(surucu.getCurrentUrl().equals("https://www.trendyol.com/trendyol-curve/siyah-orme-yuksek-bel-toparlayici-tayt-tbbss22ta0022-p-196000002/saticiya-sor?merchantId=968")) {
			System.out.println("Ürün sorularına gidildi mi? : Evet. Test başarılı.");
		}else {
			System.out.println("Ürün sorularına gidildi mi? : Hayır. Test başarısız.");
		}
		Thread.sleep(5000);
		surucu.quit();
	} 
	

	
}
