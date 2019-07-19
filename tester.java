
//Author: Zachary Price
//Program: Mining payout calculator

import java.util.*;
public class tester {

	public static void main(String args[]) {


		int totalShares = 0;
		int numDevices;
		int shareCount;
		double currencyMine = 0;
		double tmpPayout;
		double tmpDouble;
		double tmpDouble2;

		String tmp;
		String currency;

		Scanner scan = new Scanner(System.in);

		System.out.println("<|*|> Welcome to the mining calculator! <|*|>");
		System.out.println("");
		System.out.println("Please enter the cryptocurrency you are mining:");
		currency = scan.next();
		System.out.println("Crypto -- " + currency);
		System.out.println("");
		System.out.println("Please enter how many devices are mining on your pool:");
		numDevices = scan.nextInt();
		System.out.println("You have "+numDevices+" devices mining on your pool");
		System.out.println("");
		System.out.println("Please enter the amount of "+currency+ " mined:");
		currencyMine = scan.nextDouble();

		int shares[] = new int[numDevices];

		System.out.println("");

		for(int i = 0; i < numDevices; i++) {

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

		for(int i = 0; i <numDevices; i++) {
			totalShares = totalShares + shares[i];
		}

		System.out.print("******************************");
		System.out.println("");
		System.out.println("Total shares = "+ totalShares);


		System.out.println("");
		System.out.println("");
		System.out.println("Enter any letter or number to continue...");

		tmp = scan.next();

		System.out.println("Calculating individual payouts...");
		System.out.println("");

		System.out.println("------------------------------------------------");
		for(int i = 0; i < numDevices; i++) {  //Using temporary doubles to prevent casting issues
			tmpDouble = shares[i];
			tmpDouble2 = totalShares;
			tmpPayout = currencyMine * (tmpDouble/tmpDouble2);
			System.out.println("");
			System.out.println("Payout for device " + i + ": " + tmpPayout);


		}
		System.out.println("");
		System.out.println("------------------------------------------------");
		System.out.println("Thanks for supporting the mining payout calculator by Zachary Price");

	}
}

