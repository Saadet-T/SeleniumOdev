/**
*
* @author Saadet Elif Tokuoğlu saadet.tokuoglu@ogr.sakarya.edu.tr
* @since 06.05.2023
* <p>
* Resim display ediliyor mu? Link resim düzgün çalışıyor mu? gibi testler
* </p>
*/
package pkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImageTest {
	FeaturesTest featureTest = new FeaturesTest();
	public void tokaResimDisplay() throws InterruptedException {
		WebDriver surucu = featureTest.login();
		surucu.get("https://www.trendyol.com/monalisa/kadin-50-li-havlu-lastik-toka-seti-p-646676991?boutiqueId=61&merchantId=496056");
		WebElement tokaResim = surucu.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/img"));
		if(tokaResim.isDisplayed()) {
			System.out.println("Toka resmi gösteriliyor mu?:Evet. Test başarılı");
			System.out.println("Resim alternatif metni :" + tokaResim.getAttribute("alt"));
		}else {
			System.out.println("Toka resmi gösteriliyor mu?: Hayır . Test başarısız. ");
		}
	} 
	
	public void kadınLinkResimTest() throws InterruptedException {
		WebDriver surucu = featureTest.login();
		surucu.get("https://www.trendyol.com/butik/liste/1/kadin");
		WebElement kadinResim = surucu.findElement(By.xpath("//*[@id=\"logo\"]/img"));
		if(kadinResim.isDisplayed()) {
			System.out.println("Kadın resim alanı geldi mi?:Evet");
			kadinResim.click();
			String hedefURL="https://www.trendyol.com/";
			if(surucu.getCurrentUrl().equals(hedefURL)) {
				System.out.println("Resime tıklandı ve doğru alana yönlendirildi.Test başarılı.");
				
			}else {
				System.out.println("Resim yönlendirilmesinde hata oluştu.Test başarısız.");
			}
		}else {
			System.out.println("Toka resmi gösteriliyor mu?: Hayır. Test başarısız ");
		}
	} 
}
