public class Main_2 
{

	public static void main(String[] args) 
	{
		Araç_2 araç1 = new Araç_2 ("Toyota", "Corolla", 1500, false);
		Araç_2 araç2 = new Araç_2 ("Renault", "Clio", 1200, false);
		Araç_2 araç3 = new Araç_2 ("BMW", "320i", 3000, true);
	
		System.out.println("=== ARAÇ KİRALAMA SİSTEMİ ===");
		araç1.bilgileriGoster();
		araç2.bilgileriGoster();
		araç3.bilgileriGoster();
		araç1.kirala();
		araç1.kirala();
		double kbh = araç2.kiraBedeliHesapla(5);
		System.out.println(5 + " günlük kiralama bedeli: "+ kbh + " TL");
		araç3.teslimEt();
		System.out.println("");
		System.out.println("=== GÜNCEL ARAÇ DURUMLARI ===");
		araç1.bilgileriGoster();
		araç2.bilgileriGoster();
		araç3.bilgileriGoster();
	}
}
