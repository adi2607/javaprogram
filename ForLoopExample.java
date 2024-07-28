import java.util.Scanner;

class ForLoopExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number for table: ");
        // int num = sc.nextInt();

        // for(int i=1;i<=10;i++){
        //     System.out.println("value is "+ (num*i) );
        // }

        // System.out.println("Enter number for table: ");
        // int num1 = sc.nextInt();
        // int i=1;
        // while(i<=11){
        //     System.out.println("value is: "+ (num1*i));
        //     i=i+2;
        // }

        System.out.println("Enter the numer: ");
        int num2= sc.nextInt();
        int i=1;
        do{
            System.out.println("value is: "+ num2*i);
            i++;
        }while(i<11);
    }
}