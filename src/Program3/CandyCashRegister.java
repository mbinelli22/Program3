package Program3;
//Michael Binelli
import java.util.Scanner;
public class CandyCashRegister {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String candy1;
		String candy2;
		double numberOfUnitsCandy1;
		double numberOfUnitsCandy2;
		double pricePerCandy1;
		double pricePerCandy2;
		
		//Retailer Input
		System.out.print("Enter the name of the first candy: ");
		candy1 = stdIn.nextLine();
		System.out.print("Enter the price of the first candy: ");
		pricePerCandy1 = stdIn.nextDouble();
		System.out.print("Enter the name of the second candy: ");
		candy2 =stdIn.nextLine();		
		System.out.print("Enter the price of the second candy: ");
		pricePerCandy2 = stdIn.nextDouble();
		
		//Consumer Input
		System.out.print("Enter the number of units for the candy, " + candy1 + ":");
		numberOfUnitsCandy1 = stdIn.nextDouble();
		System.out.print("Enter the number of units for the candy " + candy2 + ":");
		numberOfUnitsCandy2 = stdIn.nextDouble();
		System.out.print("Your reciept:");
		System.out.println();
		System.out.println();
		
			double discount1 = (numberOfUnitsCandy1 - 12) * pricePerCandy1 * 0.05;
			double totalPriceCandy1 =(numberOfUnitsCandy1 * pricePerCandy1) - discount1;		
			
		if(numberOfUnitsCandy1 > 12 ) {
			System.out.print(candy1 + " x " + numberOfUnitsCandy1 + " -- $" + totalPriceCandy1);
		}
		else {
			System.out.print(candy1 + " x " + numberOfUnitsCandy1 + " -- $" + (numberOfUnitsCandy1 * pricePerCandy1));
		}
		
			double discount2 = (numberOfUnitsCandy2 - 12) * pricePerCandy2 * 0.05;
			double totalPriceCandy2 =(numberOfUnitsCandy2 * pricePerCandy2) - discount2;
			
		if(numberOfUnitsCandy2 > 12 ) {
			System.out.print(candy2 + " x " + numberOfUnitsCandy2 + " -- $" + totalPriceCandy2);
		}
		else {
			System.out.print(candy2 + " x " + numberOfUnitsCandy2 + " -- $" + (numberOfUnitsCandy2 * pricePerCandy2));
		}
		
		double totalOrderCost = totalPriceCandy1 * totalPriceCandy2;
		System.out.println();
		System.out.println();
		System.out.print("Total Order Cost: " + totalOrderCost);
		double salesTax = totalOrderCost* 0.0625;
		System.out.println();
		System.out.print("Sales Tax: " + salesTax);
		System.out.println();
		System.out.println();
		double grandTotal = salesTax + totalOrderCost;
		System.out.print("Grand Total: " + grandTotal);
		
		stdIn.close();
	}

}
