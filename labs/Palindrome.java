import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();

        int number=num;
        int rev_num=0;

        while(num!=0){
            int a = num%10;
            rev_num=rev_num*10+a;
            num=num/10;
        }

        if(number == rev_num){
            System.out.println(number + " is palindrome number");
        }
        else{
            System.out.println(number + " is not palindrome number");
        }

        sc.close();
    }
}
