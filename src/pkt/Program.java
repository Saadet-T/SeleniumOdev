/**
*
* @author Saadet Elif Tokuoğlu saadet.tokuoglu@ogr.sakarya.edu.tr
* @since 06.05.2023
* <p>
* Yazılan fonksiyonların çalıştırıldığı kısım
* </p>
*/
package pkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Program {
	public static void main(String[] args) throws InterruptedException {
		ColorCheck colorcheck = new ColorCheck();
		FeaturesTest featureTest = new FeaturesTest();
		ImageTest imageTest = new ImageTest();
		AddingAndRemovalTest aart = new AddingAndRemovalTest();
		colorcheck.sepeteEkleButonYaziRenkKontrol();
		colorcheck.sepeteEkleButonRenkKontrol();
		colorcheck.listeRenkKontrol();
		colorcheck.urunUcretRenkKontrol();
		featureTest.scrollUpCheck();
		featureTest.asusCheckBox();
		featureTest.sepeteEkleFiyatArtisTest();
		aart.sepeteEkleTest();
		aart.sepetCikarmaTest();
		featureTest.loginTest();
		aart.favoriEklemeCikarmaTest(); //iki test var içeride favorilere ekledikten sonra sorun olmasın diye çıkarıyor 
		featureTest.koleksiyonOlusturma(); // iki test var koleksiyon oluşturma ve silme
		featureTest.takipEdilenKoleksiyonSilme();
		featureTest.duyuruTercihleriGuncelleme();
		featureTest.gecmisiAcKapaGuncelleme(); //İki test sayılacak açma ve kapama 
		featureTest.magazaTakipEtmeBirakma();//iki test sayilacak
		featureTest.urunSorularinaGit();
		aart.koleksiyonaUrunEkleveSil();//iki test sayilacak
		imageTest.tokaResimDisplay();
		imageTest.kadınLinkResimTest();

	

}}
