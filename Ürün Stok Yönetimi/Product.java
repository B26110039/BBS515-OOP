
public class Product
{
	 
	// Instance variables
	
private String name;     
private double price;     
private int stock;      
	
	// Constructor     
	public Product(String c_name, double c_price, int c_stock) 
	{
		this.name = c_name;
		this.price = c_price;
		this.stock = c_stock;
	}      
	
	// Getter methods
	
	public String getName() {return name;}  
	
	public double getPrice() {return price;}
	
	public int getStock() {return stock;}      
	
	// Setter methods 
	
	public void setPrice(double s_price) 
	{         
		if (s_price > 0) {this.price = s_price;} 
		else {System.out.println("Hata: Fiyat 0'dan büyük olmalıdır! ");}
	}
	
	public void setStock(int stock) {this.stock = stock ;}
}


