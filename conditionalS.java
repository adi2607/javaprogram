import java.util.Scanner;

// class IfExample{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in); // scanner object for user input
//         System.out.println("Enter you know programming or not yes/no");
//         String check =scan.next(); // store input check variable
//         // condition
//         // equals will not check case
//         if (check.equals("yes")){
//             System.out.println("You know programming lang");
//         }
//         else{
//             System.out.println("You don't know programming lang");
//         }
//     }
// }


// class IfExample{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in); // scanner object for user input
//         System.out.println("Enter number1 ");
//         int num1 =scan.nextInt(); // store input check variable
//         System.out.println("Enter number2 ");
//         int num2 =scan.nextInt();

//         if (num1==num2){
//             System.out.println("Both numbers are equals ");
//         }
//         else{
//             System.out.println("Both numbers are not equals ");
//         }
//     }
// }

// nested if //

// class IfExample{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in); // scanner object for user input
//         System.out.println("Enter you know programming or not yes/no");
//         String check =scan.next(); // store input check variable
//         // condition
//         // equals will not check case
//         if (check.equalsIgnoreCase("yes")){
//             System.out.println("You know programming lang");
//             String lang = scan.next();
//             if (lang.equalsIgnoreCase("yes")){
//                 System.out.println("You knows programming lang");
//             }
//             else{
//                 System.out.println("You does not know programming lang");
//             }
//         }
//         else{
//             System.out.println("You don't know programming lang");
//         }
//     }
// }


// class IfExample{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in); // scanner object for user input
//         System.out.println("Enter you know programming or not yes/no");
//         String check =scan.next(); // store input check variable
//         // condition
//         // equals will not check case
//         if (check.equalsIgnoreCase("yes")){
//             System.out.println("What lang you know development/desinging/testing");
//             String lang = scan.next();
//             if (lang.equalsIgnoreCase("development")){
//                 System.out.println("You knows development lang");
//             }
//             else if(lang.equalsIgnoreCase("desinging")){
//                 System.out.println("You knows desinging lang");
//             }
//             else if(lang.equalsIgnoreCase("tesing")){
//                 System.out.println("You knows testing lang");
//             }
//             else{
//                 System.out.println("You does not know programming lang");
//             }
//         }
//         else{
//             System.out.println("You don't know programming lang");
//         }
//     }
// }

class IfExample{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Present/Absent ");
        String status = scan.next();
        if(status.equalsIgnoreCase("Present")){
            System.out.println("Enter Marks ");
            int marks= scan.nextInt();
            if(marks<99 && marks>=80){
                System.out.println("You Are in First Class");
            }
            else if(marks<79 && marks>=60){
                System.out.println("You Are in Second Class");
            }
            else if(marks<59 && marks>=35){
                System.out.println("You Are in Third Class");
            }
            else{
                System.out.println("Invaild No. ");
            }
        }
        else{
            System.out.println("Fail You are Absent Attempt KT exam ");
        }
    }
}