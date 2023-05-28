/**
*
* @author Saadet Elif Tokuoğlu saadet.tokuoglu@ogr.sakarya.edu.tr
* @since 06.05.2023
* <p>
* Her seferinde sürücüyü yeniden kod yazarak atamamak için sürücü atama fonksiyonu
* </p>
*/
package pkt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SurucuAta {
	public static WebDriver surucuAta(String URL) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver\\ChromeDriver\\chromedriver.exe");
	WebDriver surucu = new ChromeDriver();
	surucu.get(URL);
	surucu.manage().window().maximize();
	Thread.sleep(2000);
	return surucu;
	}
	
	
}
