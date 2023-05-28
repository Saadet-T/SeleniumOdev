package pkt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class AddingAndRemovalTest {
	
	FeaturesTest featureTest = new FeaturesTest();
	public void sepeteEkleTest() throws InterruptedException {
		WebDriver surucu = featureTest.login();
		surucu.get("https://www.trendyol.com/trendyolmilla/lacivert-straight-dokuma-yuksek-bel-nervur-dikisli-pantolon-twoss21pl0093-p-310673395?boutiqueId=620835&merchantId=968");
		WebElement urunEkle = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[6]/button/div[1]"));
		urunEkle.click();
		Thread.sleep(2000);
		surucu.get("https://www.trendyol.com/sepet");
		WebElement fiyatKontrol = surucu.findElement(By.xpath("//*[@id=\"pb-container\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/div/div"));
		String fiyat= fiyatKontrol.getText();
		if(fiyat.length()>0) {
			System.out.println("Sepete ürün ekledi mi?:Evet");
		}else {
			System.out.println("Sepete ürün ekledi mi ?: Hayır ");
		}
		WebElement sepetiBosalt = surucu.findElement(By.xpath("//*[@id=\"pb-container\"]/div/div[2]/div[2]/div/div[4]/button/i"));
		Thread.sleep(2000);
		sepetiBosalt.click();
		Thread.sleep(5000);
		surucu.quit();
	} 
	public void sepetCikarmaTest() throws InterruptedException {
		WebDriver surucu = featureTest.login();
		surucu.get("https://www.trendyol.com/trendyolmilla/lacivert-straight-dokuma-yuksek-bel-nervur-dikisli-pantolon-twoss21pl0093-p-310673395?boutiqueId=620835&merchantId=968");
		WebElement urunEkle = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[6]/button/div[1]"));
		urunEkle.click();
		Thread.sleep(2000);
		surucu.get("https://www.trendyol.com/sepet");
		WebElement sepettenCikar = surucu.findElement(By.xpath("//*[@id=\"pb-container\"]/div/div[2]/div[2]/div/div[4]/button/i"));
		sepettenCikar.click();
		Thread.sleep(5000);
		WebElement sepetSifir = surucu.findElement(By.xpath("//*[@id=\"pb-container\"]/div/div[1]/div"));
		System.out.println(sepetSifir.getText());
		if(sepetSifir.getText().contains("Sepetim (0 Ürün)")) {
			System.out.println("Sepetten ürün çıkarıldı mı ?:Evet test başarılı");
		}else {
			System.out.println("Sepete ürün ekledi mi ?: Hayır ");
		}
		Thread.sleep(5000);
		surucu.quit();
	} 
	
	public void favoriEklemeCikarmaTest() throws InterruptedException {
		WebDriver surucu = featureTest.login();
		surucu.get("https://www.trendyol.com/trendyolmilla/siyah-straight-dokuma-yuksek-bel-nervur-dikisli-pantolon-twoss21pl0093-p-71519125?boutiqueId=620835&merchantId=968&sav=true");
		WebElement favoriUrunEkle = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[7]/div/div/div[1]/button"));
		favoriUrunEkle.click();
		Thread.sleep(5000);
		WebElement favorilereGit = surucu.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/a/div/p"));
		favorilereGit.click();
		Thread.sleep(5000);
		WebElement urunKontrol = surucu.findElement(By.xpath("//*[@id=\"account-gw-favorites\"]/div/div[3]/div/div/div[1]/a/div[2]/div[1]/span[2]"));
		if(urunKontrol.getText().contains("Straight Dokuma")) {
			System.out.println("Ürün favorilere eklendi mi? : Evet. Test Başarılı.");
		}else {
			System.out.println("Ürün favorilere eklendi mi? : Hayır. Test Başarısız.");
		}
		
		WebElement favorilerCikarma = surucu.findElement(By.xpath("//*[@id=\"account-gw-favorites\"]/div/div[3]/div/div/div[3]/i"));
		favorilerCikarma.click();
		Thread.sleep(5000);
		WebElement cikarmaKontrol = surucu.findElement(By.xpath("//*[@id=\"account-gw-favorites\"]/div/div[3]/p[1]"));
		if(cikarmaKontrol.getText().contains("Favoriler Listeniz Henüz Boş")) {
			System.out.println("Ürün favorilerden çıkarıldı mı? : Evet. Test Başarılı.");
		}else {
			System.out.println("Ürün favorilerden çıkarıldı mı?  : Hayır. Test Başarısız.");
		}
		Thread.sleep(5000);
		surucu.quit();
	} 
	
	public void koleksiyonaUrunEkleveSil() throws InterruptedException {
		WebDriver surucu = featureTest.login();
		surucu.get("https://www.trendyol.com/squishmallows/squishmallow-pegasus-faisah-50-cm-p-686314080?boutiqueId=61&merchantId=4404");
		WebElement koleksiyonaEkle = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/div/div[6]/div/span[2]"));
		koleksiyonaEkle.click();
		Thread.sleep(2000);
		WebElement yeniKoleksiyonOlustur = surucu.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div[2]/div/div/div/p"));
		yeniKoleksiyonOlustur.click();
		WebElement koleksiyonAdi = surucu.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/form/div[2]/input"));
		koleksiyonAdi.sendKeys("Yazilim Testi Koleksiyon");
		WebElement koleksiyonOlusturButon = surucu.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/form/button"));
		koleksiyonOlusturButon.click();
		Thread.sleep(5000);
		surucu.get("https://www.trendyol.com/koleksiyonlar/koleksiyonlarim");
		WebElement koleksiyonaGit = surucu.findElement(By.xpath("//*[@id=\"collections-app\"]/div/div/div[3]/div/a/div[2]/a"));
		koleksiyonaGit.click();
		Thread.sleep(2000);
		WebElement urunEklendiMi = surucu.findElement(By.xpath("//*[@id=\"account-gw-collections\"]/div[2]/div/div[2]/div/div[1]/a/div[3]/div[1]/div/span[2]"));
		if(urunEklendiMi.getText().contains("Squishmallow")) {
			System.out.println("Ürün koleksiyona eklendi mi? : Evet. Test başarılı.");
		}else {
			System.out.println("Ürün koleksiyona eklendi mi?: Hayır. Test başarısız.");
		}
		WebElement urunCikarma = surucu.findElement(By.xpath("//*[@id=\"account-gw-collections\"]/div[2]/div/div[2]/div/div[3]/div/div"));
		urunCikarma.click();
		Thread.sleep(2000);
		WebElement urunCikarma2 = surucu.findElement(By.xpath("//*[@id=\"account-gw-collections\"]/div[2]/div/div[2]/div/div[3]/div/div[2]/ul/li[2]/span"));
		urunCikarma2.click();
		Thread.sleep(2000);
		WebElement urunCikarma3 = surucu.findElement(By.xpath("//*[@id=\"account-gw-collections\"]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[2]/div/button[2]"));
		urunCikarma3.click();
		Thread.sleep(2000);
		WebElement urunCikarmaKanit = surucu.findElement(By.xpath("//*[@id=\"account-gw-collections\"]/div[2]/div/div[2]/h1"));
		if(urunCikarmaKanit.getText().contains("Ürünlerin Yok")) {
			System.out.println("Ürün koleksiyondan silindi mi? : Evet. Test başarılı.");
		}else {
			System.out.println("Ürün koleksiyondan silindi mi?: Hayır. Test başarısız.");
		}

		Thread.sleep(5000);
		surucu.quit();
	} 
}
