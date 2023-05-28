/**
*
* @author Saadet Elif Tokuoğlu saadet.tokuoglu@ogr.sakarya.edu.tr
* @since 06.05.2023
* <p>
* Yazılan fonksiyonların çalıştırıldığı kısım
* </p>
*/
package pkt;

import java.util.Scanner;

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
		System.out.println("Hoşgeldiniz aşağıdaki menülerden yapmak istediğiniz seçimin yanındaki sayıyı giriniz;\n");
		System.out.println("1)Ekleme-Çıkarma Testleri\n");
		System.out.println("2)Feature kontrol testleri\n");
		System.out.println("3)Renk kontrolü testleri\n");
		System.out.println("4)Resim kontrolü testleri\n");
		Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            switch (input) {
            case "1":
        		aart.sepetCikarmaTest();
        		aart.favoriEklemeCikarmaTest(); //iki test var içeride favorilere ekledikten sonra sorun olmasın diye çıkarıyor 
        		aart.koleksiyonaUrunEkleveSil();//iki test sayilacak
        		aart.sepeteEkleTest();
        		System.out.println("Ekleme Çıkarma Testleri Bitti. Yeni bir test denemek ister misiniz?\n");
        		System.out.println("1)Ekleme-Çıkarma Testleri\n");
        		System.out.println("2)Feature kontrol testleri\n");
        		System.out.println("3)Renk kontrolü testleri\n");
        		System.out.println("4)Resim kontrolü testleri\n");
              break;
            case "2":
            	featureTest.scrollUpCheck();
        		featureTest.asusCheckBox();
        		featureTest.sepeteEkleFiyatArtisTest();
        		featureTest.loginTest();
        		featureTest.koleksiyonOlusturma(); // iki test var koleksiyon oluşturma ve silme
        		featureTest.takipEdilenKoleksiyonSilme();
        		featureTest.duyuruTercihleriGuncelleme();
        		featureTest.gecmisiAcKapaGuncelleme(); //İki test sayılacak açma ve kapama 
        		featureTest.magazaTakipEtmeBirakma();//iki test sayilacak
        		featureTest.urunSorularinaGit();
        		System.out.println("\nFeature Testleri Bitti. Yeni bir test denemek ister misiniz?\n");
        		System.out.println("1)Ekleme-Çıkarma Testleri\n");
        		System.out.println("2)Feature kontrol testleri\n");
        		System.out.println("3)Renk kontrolü testleri\n");
        		System.out.println("4)Resim kontrolü testleri\n");
              break;
            case "3":
        		colorcheck.sepeteEkleButonYaziRenkKontrol();
        		colorcheck.sepeteEkleButonRenkKontrol();
        		colorcheck.listeRenkKontrol();
        		colorcheck.urunUcretRenkKontrol();
        		System.out.println("\nRenk Kontrolü Testleri Bitti. Yeni bir test denemek ister misiniz?\n");
        		System.out.println("1)Ekleme-Çıkarma Testleri\n");
        		System.out.println("2)Feature kontrol testleri\n");
        		System.out.println("3)Renk kontrolü testleri\n");
        		System.out.println("4)Resim kontrolü testleri\n");
              break;
            case "4":
        		imageTest.tokaResimDisplay();
        		imageTest.kadınLinkResimTest();
        		System.out.println("\nResim Kontrolü Testleri Bitti. Yeni bir test denemek ister misiniz?\n");
        		System.out.println("1)Ekleme-Çıkarma Testleri\n");
        		System.out.println("2)Feature kontrol testleri\n");
        		System.out.println("3)Renk kontrolü testleri\n");
        		System.out.println("4)Resim kontrolü testleri\n");
              break;
              }
        }

}}
