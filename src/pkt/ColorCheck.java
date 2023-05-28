/**
*
* @author Saadet Elif Tokuoğlu saadet.tokuoglu@ogr.sakarya.edu.tr
* @since 06.05.2023
* <p>
* Renk testlerinin yapıldığı kısım
* </p>
*/
package pkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import pkt.SurucuAta;

public class ColorCheck {
	SurucuAta surucuAta = new SurucuAta();
	public  void listeRenkKontrol() throws InterruptedException {
		WebDriver surucu=SurucuAta.surucuAta("https://www.trendyol.com/butik/liste/1/kadin");
		//Liste elementlerinin gri renkte olup olmadığını kanıtlayan test.
		WebElement liA = surucu.findElement(By.xpath("//ul/li/a[contains(text(),'Çaydanlık')]"));
		String rgb = liA.getCssValue("color");
		String renk = Color.fromString(rgb).asHex();
		if(renk.equals("#666666")) {
			System.out.println("Test Başarılı");
		} else {
			System.out.println("Test Başarısız");
		}
	}
	
	public  void urunUcretRenkKontrol() throws InterruptedException {
		WebDriver surucu=SurucuAta.surucuAta("https://www.trendyol.com/trendyolmilla/siyah-straight-dokuma-yuksek-bel-nervur-dikisli-pantolon-twoss21pl0093-p-71519125?boutiqueId=620835&merchantId=968&sav=true");
		WebElement cookieAccept = surucu.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
		cookieAccept.click();
		WebElement fiyatRenk = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div/div/span"));
		String renkFiyat = fiyatRenk.getCssValue("color");
		String renkFiyatHex = Color.fromString(renkFiyat).asHex();
		if(renkFiyatHex.equals("#f27a1a")) {
			System.out.println("Test Başarılı");
		} else {
			System.out.println("Test Başarısız");
		}
		Thread.sleep(2000);
		
	}
	public void sepeteEkleButonYaziRenkKontrol() throws InterruptedException {
		WebDriver surucu=SurucuAta.surucuAta("https://www.trendyol.com/trendyolmilla/siyah-straight-dokuma-yuksek-bel-nervur-dikisli-pantolon-twoss21pl0093-p-71519125?boutiqueId=620835&merchantId=968&sav=true");
		WebElement butonRenk = surucu.findElement(By.xpath("//button/div[@class='add-to-basket-button-text']"));
		String renkButon = butonRenk.getCssValue("color");
		String renkFiyatHex = Color.fromString(renkButon).asHex();
		if(renkFiyatHex.equals("#ffffff")) {
			System.out.println("Test Başarılı");
		} else {
			System.out.println("Test Başarısız");
		}
		Thread.sleep(2000);
		
	}
	public void sepeteEkleButonRenkKontrol() throws InterruptedException {
		WebDriver surucu=SurucuAta.surucuAta("https://www.trendyol.com/trendyolmilla/siyah-straight-dokuma-yuksek-bel-nervur-dikisli-pantolon-twoss21pl0093-p-71519125?boutiqueId=620835&merchantId=968&sav=true");
		WebElement butonRenk = surucu.findElement(By.xpath("//button[@class='add-to-basket']"));
		String renkButon = butonRenk.getCssValue("color");
		String renkFiyatHex = Color.fromString(renkButon).asHex();
		if(renkFiyatHex.equals("#f27a1a")) {
			System.out.println("Test Başarılı");
		} else {
			System.out.println("Test Başarısız");
		}
		Thread.sleep(2000);
		
	}
	
	

}
