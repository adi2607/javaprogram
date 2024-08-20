import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: "); // using scanner for user input
        int num=sc.nextInt();

        int number=num;
        int rev_num=0;

        while(num!=0){
            int a = num%10; // to extract the last digit of number
            rev_num=rev_num*10+a; // to add last find number in rev_num
            num=num/10; // to remove last checked number
        }

        if(number == rev_num){ // to check if first number and last number are same or not
            System.out.println(number + " is palindrome number");
        }
        else{
            System.out.println(number + " is not palindrome number");
        }

        sc.close();
    }
}
