//Reverse a Number
//Write a program to reverse the digits of a given number.

import java.util.Scanner;
class ReverseNumber{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: "); // using Scanner for user input
        int number = sc.nextInt();
        int rnum=0;

        while(number!=0){
            int num = number%10; // find the last digit of the number 
            rnum = rnum*10+num; // to add last found digit to rnum
            number = number/10; // for remove the last digit
        }
        System.out.println("Reverse Number: " + rnum);
    }
}