//Prime Number Check
//Write a program to check whether a given number is a prime number.

import java.util.Scanner;
class PrimeNumbers{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();
        
        boolean primeNumber= true;

        if(num<=1){
            primeNumber = false;
        }
        else{
            for(int i =2;i*i<=num;i++){
                if(num%i==0){ 
                    primeNumber=false;
                    break;
                }
            }
        }
        if (primeNumber) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}