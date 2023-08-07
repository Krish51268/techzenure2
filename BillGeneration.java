/** write a project for generate bill system 20

 * Author : VenkataKrishnaM
 * 
 */





package com.techzenure.DAY1;



import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		
		int pizzaPrize = 100; // cost of a pizza single unit
		int puffPrize = 20;  // cost of a puff single unit
		int coolDrinkPrize = 10; // cost of CoolDrink single unit
		
		
		 // to use scanner to read the data from the user
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter the no.of pizzas Bought:");
		int numOfPizzas = sc.nextInt();
		
		System.out.print("Enter the no.of puffs Bought:");
		int numOfPuffs = sc.nextInt();
		
		System.out.print("Enter the no.of CoolDrinks Bought:");
		int numOfCoolDrinks = sc.nextInt();
		
		//calculating the total cost of items
		int totalPizzaCost = numOfPizzas*pizzaPrize;             
		int totalPuffCost = numOfPuffs*puffPrize;
		int totalCoolDrinkCost = numOfCoolDrinks*coolDrinkPrize;
		int totalPrizeOfAllItems = totalPizzaCost+totalPuffCost+totalCoolDrinkCost;
		
		System.out.println("----------------------------");
		System.out.println("Bill Details");
		System.out.println("Num of Pizzas: "+ numOfPizzas+"  " + "cost:" +" "+ totalPizzaCost);
		System.out.println("Num of Puffs: "+ numOfPuffs +"  "+ "cost:" + " "+totalPuffCost);
		System.out.println("Num of Pizzas: "+ numOfCoolDrinks+"  " + "cost:" + " "+totalCoolDrinkCost);
		System.out.println("Total Prize:" +"  "+ totalPrizeOfAllItems);
		System.out.println("Enjoy the Show !");
		System.out.println("-----------------------------");
		
		sc.close();
	}


}
