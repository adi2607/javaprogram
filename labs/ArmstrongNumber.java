//Armstrong Number Check
//Write a program to check whether a given number is an Armstrong number.

import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: "); // using Scanner for user input
        int num = sc.nextInt();
        int number = num;
        int result = 0;

        while (number != 0){
            int digit = number % 10; // find the last digit of the number
            result = digit * digit * digit + result; // for the cube of each number
            number = number/10; // for Removing last digit of the number
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}