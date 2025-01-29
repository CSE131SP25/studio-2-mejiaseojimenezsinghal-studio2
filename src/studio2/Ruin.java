package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the starting amount?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is the win chance?");
		double winChance = in.nextDouble();
		
		System.out.println("What is the win limit");
		double winLimit = in.nextDouble();
		
		System.out.println("Number of Simulations:");
		int totalSimulations = in.nextInt();
		
		int counter = 0;
		
		for(int count = 1; count <= totalSimulations; count++) {
			double money = startAmount; 
		while (startAmount > 0 && startAmount < winLimit) {
			double probability = Math.random();
			if (probability <= winChance) {
				money++;
			//System.out.println ("Win");
			}
			else {
				money--;
			//System.out.println("Ruin");
			}
		}
		
		System.out.println("Simulation day: "+ count + ", Number of plays: " + counter );
	}
}	
	

}
