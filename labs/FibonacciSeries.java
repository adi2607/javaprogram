//Fibonacci Series
//Write a program to generate the Fibonacci series up to a given number.

import java.util.Scanner;
class FibonacciSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: "); // using Scanner for user input
        int num = sc.nextInt();
        int f1 = 0, f2 = 1; 
        
        for(int i=1;i<=num;i++){
            System.out.print(f1 + " ");
            int sum = f1+f2; // for adding f1 and f2
            f1=f2; // updating value of f1 to f2
            f2=sum; // updating value of f2 to sum
        }
    }
}