package bie_ryan_hw1p1.java;
import java.util.Scanner;

class bie_ryan_hw1p1{
	public static void main(String args[]){
		
		Scanner input = new Scanner (System.in); 
		double appetizer, course, dessert, caviar, subtotal, tax, grand;
		
		System.out.println("What was the cost of the appetizer? Enter it now");
		appetizer = input.nextDouble();
		
		System.out.println("What was the cost of the main course? Enter it now");
		course = input.nextDouble();
		
		System.out.println("What was the cost of the dessert? Enter it now");
		dessert = input.nextDouble();
		
		System.out.println("What was the cost of the caviar? Enter it now?");
		caviar = input.nextDouble();
		
		System.out.print("Total: ");
		subtotal = appetizer + course + dessert + caviar; 
		System.out.println(subtotal);
		
		System.out.print("Tax: ");
		tax = 0.10*subtotal; 
		tax = Math.round(tax * 100.0)/100.0;
		
		System.out.println(tax);
		
		System.out.print("Grand Total: ");
		grand = tax+subtotal;
		grand = Math.round(grand * 100.0)/100.0;
		
		System.out.println(grand);
		
		System.out.println("Come again! Don't worry about the budget");
	}
}