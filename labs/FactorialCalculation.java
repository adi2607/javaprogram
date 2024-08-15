// Factorial Calculation
// Write a program to calculate the factorial of a given number.

import java.util.Scanner;
class FactorialCalculation{


    public static void main(String args[]){
        // Add Scanner 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: "); // using Scanner for user input
        int num = sc.nextInt();

        int fact = 1;

        //using for loop to find factorial
        for(int i=1; i<=num; i++){
            // itrate the value until given condition satisfie and multiply the value every time
            fact = fact*i;
        }
        //print the factorial
        System.out.println("The Factorial of "+num+" is "+fact);
    }
}