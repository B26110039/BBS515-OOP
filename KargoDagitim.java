
public class KargoDagitim {

	public static void main(String[] args) {
		double toplam_gelir = 0;
		for (int teslimat = 1; teslimat <=10; teslimat++) {
			int t_mesafe;
			t_mesafe = 5 + (teslimat-1)*5;
			int t_ucret;
			if (t_mesafe > 30) { 
				t_ucret = 120; 
			} else if (t_mesafe>=11) {
				t_ucret = 80;
			} else {
				t_ucret = 50;
			}
			int y_ucreti;
			if (teslimat < 3 ) {
				y_ucreti = 0; }
			else if (teslimat >= 3 && teslimat % 3 == 0) {
				y_ucreti = 20;
			}
			else {
				y_ucreti = 0;
			}
			double m_indirimi;
			if (t_mesafe >= 40) {
				m_indirimi = (t_ucret+y_ucreti)*0.1; }
				else {
				m_indirimi = 0; }
			double tes_ucreti = t_ucret + y_ucreti - m_indirimi;
			System.out.println(teslimat + ". Teslimat" + " - Mesafe: " + t_mesafe + " km - Ücret: " + tes_ucreti + " TL");
			toplam_gelir = toplam_gelir + tes_ucreti;
			}
			System.out.println();
			System.out.println("Toplam Gelir: " + toplam_gelir + " TL");
		}
	}


