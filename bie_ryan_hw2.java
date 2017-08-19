package bie_ryan_hw2.java;

import java.util.Scanner; 

public class bie_ryan_hw2 
{
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("How much can you afford for meals per day? Enter it now ");
		double mealAmount = input.nextDouble();  
		
		
			if (mealAmount <0)
			{
				System.exit(0);
			}

			
			System.out.print("How much can you afford for transportation per day? Enter it now ");
			double transportationAmount = input.nextDouble();
			
			
			System.out.println();
			
			
			if (transportationAmount <0)
			{
				System.exit(0);	
			}			
		
			
		System.out.print("How much can you afford for activities per day? Enter it now ");
		double activitiesAmount = input.nextDouble();

		
			if (activitiesAmount <0)
			{
				System.exit(0);
			}

		
			if (mealAmount < 15.00 && mealAmount >= 0) 
				{
				System.out.println("No meal for you. Tough luck."); 
				}
			else if (mealAmount >= 15.00 && mealAmount < 30.00) 
				{
				System.out.println("You can afford bronze meals.");
				}
			else if (mealAmount >= 30.00 && mealAmount < 60.00) 
				{
				System.out.println("You can afford silver meals."); 
				}
			else if (mealAmount >= 60.00) 
				{
				System.out.println("You can afford gold meals."); 
				}
			
			if(transportationAmount < 50.00 && transportationAmount >= 0)
				{
				System.out.println("No vacation ride for you. Tough luck");
				}
			else if (transportationAmount >= 50.00 && transportationAmount < 60.00)
				{
				System.out.println("You can afford bronze vacation rides.");
				}
			else if (transportationAmount >= 60.00 && transportationAmount < 80.00)
				{
				System.out.println("You can afford silver vacation rides.");
				}
			else if (transportationAmount >= 80.00)
				{
				System.out.println("You can afford gold vacation rides.");
				}
			
			if (activitiesAmount < 40.00 && activitiesAmount >= 0)
				{
				System.out.println("No activities for you. Tough luck.");
				}
			else if (activitiesAmount >= 40.00 && activitiesAmount < 80.00)
				{
				System.out.println("You can afford bronze activities. A new theme park everyday!");
				}
			else if (activitiesAmount >= 80.00 && activitiesAmount < 200.000)
				{
				System.out.println("You can afford silver activities. A new theme park everyday!");
				}
			else if (activitiesAmount >= 200.00)
				{
				System.out.println("You can afford gold activities. A new theme park everyday!" );
				}
		
			
			System.out.print("Total you can spend per day: ");
			double TotalAmount;
			System.out.printf("%.2f",TotalAmount=(mealAmount + transportationAmount + activitiesAmount)); 
		
	}
}		