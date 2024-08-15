//Sum of Digits
//Write a program to find the sum of the digits of a given number.

import java.util.Scanner;
class SumOfDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        int sum = 0;

        while (number!=0){
            int num = number % 10; // find the last digit
            sum = sum + num; // add last found number to sum
            number = number / 10; // for remove the last number
        }
        System.out.println("The Sum of digits are: "+sum);
    }
}
