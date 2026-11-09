public class ProductManager 
{

	public void urunBilgileriniGoster(Product XYZ) 
	{
		System.out.println("Ürün: " + XYZ.getName());
		System.out.println("Fiyat: " + XYZ.getPrice() + " TL");
		System.out.println("Stok: " + XYZ.getStock());
	}

	public void satisYap(Product XYZ, int adet) 
	{
		if (adet >= 0 && XYZ.getStock() >= adet) 
		{
			System.out.println(adet + " adet " + XYZ.getName() + " satıldı.");
			XYZ.setStock(XYZ.getStock()-adet);
		} 
		else 
		{
			System.out.println("Yetersiz Stok");
		}	
	}
	
	public void stokEkle(Product XYZ, int adet) 
	{
		if (adet>=0) 
		{
			XYZ.setStock(XYZ.getStock()+adet); 
			System.out.println(adet + " adet " + XYZ.getName() + " stoğa eklendi." );
		}
	}
}
