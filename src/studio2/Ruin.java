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
		
		while (startAmount > 0 && startAmount < winLimit) {
			double probability = Math.random();
			if (winChance <= probability) {
				startAmount++;
			System.out.println ("Win");
			}else {
				startAmount--;
			System.out.println("Ruin");
			}
		}
	}

}
