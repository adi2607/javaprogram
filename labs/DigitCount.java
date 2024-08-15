//Counting Digits
//Write a program to count the number of digits in a given number.

import java.util.Scanner;
class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: "); // using Scanner for user input
        int num = sc.nextInt();
        int count = 0; 

        while (num != 0) {
            num = num/10; // removing last digit of number
            count++; // to count removed number
        }

        System.out.println("Number of digits: " + count);
    }
}