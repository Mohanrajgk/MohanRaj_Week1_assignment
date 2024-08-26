package xenosisInternTasks;
//write a program to perform basic operations like addition,multiplication,subtraction,division.
import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		double num1= sc.nextDouble();
		
		System.out.println("enter the second number ");
		double num2 = sc.nextDouble();
		
		//for addition operation 
		double sum=num1+num2;
		System.out.println("sum "+ sum);
		
		//for multiplication operation
		double product= num1*num2;
		System.out.println("product " + product);
		
		//for subtraction operation
		double sub =num1-num2;
		System.out.println("sub "+ sub);
		
		//for division operation
		if(num2!=0) {
		double quotient = num1/num2;
		System.out.println("quotient "+ quotient);
       	}
		else {
			System.out.println("division by zero is invalid ");
		}
		sc.close();
		
	}

}
