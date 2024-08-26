package xenosisInternTasks;
//create a program that takes user input and checks if the number is even or odd.

import java.util.Scanner;

public class NumberOfOddOrEvenNums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int num= sc.nextInt();		
		
		while(num>0) {
			int rem = num%10;
			if (rem%2==0) {
				System.out.println(num + " is a even number");
			}
			else {
				System.out.println(num + " is a odd number");
			}
			num = num/10;
		}
		sc.close();

	}

}
