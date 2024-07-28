import java.util.Scanner;

// class SwitchExample{
//     public static void main(String args[]){
//         char operator;
//         double num1, num2, res;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number 1: ");
//         num1 = sc.nextDouble();
//         System.out.println("Enter the number 2: ");
//         num2 = sc.nextDouble();
//         System.out.println("Enter the Operator +,-,*,/: ");
//         operator = sc.next().charAt(0);

//         switch(operator){
//             case '+':
//                 res = num1+num2;
//                 System.out.println("The Answer is: " + res);
//             break;
//             case '-':
//                 res = num1-num2;
//                 System.out.println("The Answer is: " + res);
//             break;
//             case '*':
//                 res = num1*num2;
//                 System.out.println("The Answer is: " + res);
//             break;
//             case '/':
//                 res = num1/num2;
//                 System.out.println("The Answer is: " + res);
//             break;
//             default:
//                 System.out.println("Inavlid operator Entered! ");
                        
//         }
//     }
// }

class Menu{
    static void display(){
        System.out.println("1. Tea(Rs. 20) ");
        System.out.println("2. Black Tea(Rs. 15) ");
        System.out.println("3. Coffee(Rs. 30) ");
        System.out.println("4. Cookie(Rs. 25) ");
        System.out.println("5. Sandwich(Rs. 50) ");
        System.out.println("6. Samosa(Rs. 20) ");
        System.out.println("7. Make bill and Exit: ");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Cafe.");

        int sum=0;
        while(true){
            Menu.display();
            System.out.println("Enter Your Choice: ");
            int n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter Quantity: ");
                    int a = sc.nextInt();
                    sum = sum + 20 * a;
                break;
                case 2:
                    System.out.println("Enter Quantity: ");
                    int b = sc.nextInt();
                    sum = sum + 15 * b;
                break;
                case 3:
                    System.out.println("Enter Quantity: ");
                    int c = sc.nextInt();
                    sum = sum + 30 * c;
                break;
                case 4:
                    System.out.println("Enter Quantity: ");
                    int d = sc.nextInt();
                    sum = sum + 25 * d;
                break;
                case 5:
                    System.out.println("Enter Quantity: ");
                    int e = sc.nextInt();
                    sum = sum + 50 * e;
                break;
                case 6:
                    System.out.println("Enter Quantity: ");
                    int f = sc.nextInt();
                    sum = sum + 20 * f;
                break;
                default:
                    System.out.println("Total Bill: "+ sum);
                    System.out.println("Thank you for visiting our Cafe.");
                break;

            }
        }
    }
}