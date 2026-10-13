import java.util.Scanner;

public class Öğrenci_Not_Analizi_Sistemi {
	// 1. Kullanicidan notlari al     
	public static void notlariAl(int[] notlar) {          
		Scanner notAl = new Scanner(System.in);
				
		for (int i=0; i<=4; i++) { 
			System.out.print(i+1 + ". Öğrencinin Notu: ");
			notlar[i] = notAl.nextInt();
		} 
		notAl.close();
	}
	// 2. Sinif ortalamasini hesapla
	public static double ortalamaHesapla(int[] notlar) {
		int toplam = 0;
		for (int not : notlar) {
			toplam = toplam + not;
		}
		double ortalama = (double) toplam/notlar.length;
		return ortalama;
	}
      
	// 3. En yuksek notu bul     
	public static int enYuksekNot(int[] notlar) {	
		int enYuksek = notlar[0];
		for (int i=0;i <=4 ; i++) {
			if (notlar[i]>enYuksek) {
				enYuksek=notlar[i];
			}
		}		
		return enYuksek;
		    
	}
	public static int basariliSayisi(int[] notlar) {
		int basarili = 0;
		for (int i=0; i<=4; i++) {
		if (notlar[i] >= 50) {
			basarili++;
		}
		}
		return basarili;
	}   
	public static void sonuclariYazdir(double ortalama, int enYuksek, int basarili) {
		
		System.out.println("");          
		System.out.println("===== ANALİZ SONUÇLARI =====");          
		System.out.println("Sınıf Ortalaması: " + ortalama);
		System.out.println("En Yüksek Not: " + enYuksek);
		System.out.println("Başarılı Öğrenci Sayısı: " + basarili);
	}
	
	public static void main(String[] args) {
	int[] notlar = new int[5];
	System.out.println("===== ÖĞRENCİ NOT ANALİZ SİSTEMİ =====");          
	notlariAl(notlar);      
	double ortalama = ortalamaHesapla(notlar);
	int enYuksek = enYuksekNot(notlar);
	int basarili = basariliSayisi(notlar);
	sonuclariYazdir(ortalama, enYuksek, basarili);
	}
 
}


