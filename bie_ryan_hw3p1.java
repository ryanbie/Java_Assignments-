package bie_ryan_hw3.java;

import java.util.Scanner;

public class bie_ryan_hw3p1 
{
	public static void main(String[] args)
	
	{
	Scanner input = new Scanner(System.in);
	
	int number1;
		System.out.print("Enter one positive integer " );
		number1 = input.nextInt();
		while (number1 < 0) {
		System.out.print("Enter one positive integer ");
		number1 = input.nextInt();
		}
		
	int number2;
		System.out.print("Enter one negative integer " );
		number2 = input.nextInt();
		while (number2 >= 0) {
			System.out.print("Enter one negative integer ");
			number2 = input.nextInt();
		}
	
	System.out.print("Difference is: ");
	int difference;
	System.out.print(difference = number1 - number2);
	
	System.out.print("\nInteger 1 is ");
	if (number1 % 2 == 0)
		{
		System.out.print("even");
		}
	else 
		System.out.print("odd");
	
	System.out.print("\nInteger 2 is ");
	if (number2 % 2 == 0)
		{
		System.out.print("even");
		}
	else 
		System.out.print("odd");
	
	System.out.print("\nDifference between integers is ");
	if (difference % 2 == 0)
		{
		System.out.print("even");
		}
	else 
		System.out.print("odd");
	
	}
}