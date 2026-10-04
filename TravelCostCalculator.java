
public class TravelCostCalculator {

	public static void main(String[] args) {
		int distance = 450;
		double consumptionPer100Km = 7.5;
		int fuelPrice = 52;
		int highwayFee = 250;
		int numberOfPeople = 3;
		double Total_Fuel_Consumption = distance*consumptionPer100Km/100;
		double Fuel_Cost = Total_Fuel_Consumption*fuelPrice;
		double Total_Travel_Cost = Fuel_Cost + highwayFee;
		double Cost_Per_Person = Total_Travel_Cost/numberOfPeople;
		System.out.println("Total Fuel Consumption: " + Total_Fuel_Consumption + " lt.");
		System.out.println("Fuel Cost: " + Fuel_Cost + " TL");
		System.out.println("Total Travel Cost: " + Total_Travel_Cost + " TL");
		System.out.println("Cost Per Person: " + Cost_Per_Person + " TL");
	}

}
