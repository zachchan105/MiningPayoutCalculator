
//Author: Zachary Price
//Program: Mining payout calculator
//Github: zachchan105

import java.util.*;
public class MiningPayoutCalculator {

	public static void main(String args[]) {

		//Define and initizalize specific variables
		int totalShares = 0;
		int numDevices;
		int shareCount;
		double currencyMine = 0;
		double tmpPayout;
		double tmpDouble;
		double tmpDouble2;
		String tmp;
		String currency;

		//Scanner for user input
		Scanner scan = new Scanner(System.in);

		System.out.println("<|*|> Welcome to the mining calculator! <|*|>");
		System.out.println("");
		System.out.println("Please enter the cryptocurrency you are mining:");
		currency = scan.next();//Store the cryptocurrency mined into a string
		System.out.println("Crypto -- " + currency);
		System.out.println("");
		System.out.println("Please enter how many devices are mining on your pool:");
		numDevices = scan.nextInt();//Store the amount of devices mining on a certain pool into an int
		System.out.println("You have "+numDevices+" devices mining on your pool");
		System.out.println("");
		System.out.println("Please enter the amount of "+currency+ " mined:");
		currencyMine = scan.nextDouble();//Store the amount of crypto mined into a double variable

		int shares[] = new int[numDevices];
		//Create an array the size of the number of devices on the pool

		System.out.println("");

		
		//This for loop runs as many times as there is devices mining on the pool.
		for(int i = 0; i < numDevices; i++) {
			//Fills out the integer array with the number of shares for each device
			System.out.println("Please enter the number of shares for device "+(i+1));
			shareCount = scan.nextInt();
			shares[i] = shareCount;
			shareCount = 0;
		}

		System.out.println("");

		if(numDevices == 1) {  //This option should almost never be used because of the purpose of this calculator.
			System.out.println("Device share count saved!");
		}

		if(numDevices > 1) {
			System.out.println("Device share counts saved!");
		}


		System.out.println("Calculating total shares...");
		System.out.println("Done.");
		System.out.println("");

		//For loops naviagates through the array and adds the values in each position together
		for(int i = 0; i <numDevices; i++) {
			totalShares = totalShares + shares[i];
		}

		System.out.print("******************************");
		System.out.println("");
		System.out.println("Total shares = "+ totalShares);


		System.out.println("");
		System.out.println("");
		//Simple way to allow the user to view an amount of information for a desired time
		System.out.println("Enter any letter or number to continue...");

		tmp = scan.next();

		System.out.println("Calculating individual payouts...");
		System.out.println("");

		System.out.println("------------------------------------------------");
		
		//This for loop runs as many times as there is devices mining on the pool.
		for(int i = 0; i < numDevices; i++) {  //Using temporary doubles to prevent casting issues
			tmpDouble = shares[i];
			tmpDouble2 = totalShares;
			//Equation for calculating the amount of crypto each device produced.
			tmpPayout = currencyMine * (tmpDouble/tmpDouble2);
			System.out.println("");
			System.out.println("Payout for device " + i + ": " + tmpPayout);


		}
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("Thanks for supporting the mining payout calculator by Zachary Price");

	}
}

