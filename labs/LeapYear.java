//Leap Year Check
//Write a program to check if a given year is a leap year.

class LeapYear{
    public static void main(String args[]){
        int year = 2024; // declared 2024 year

        // to check a year is divisible by 4 or not 
        if(year % 4==0){
            System.out.println(year+" is a Leap Year");
        }
        else{
            System.out.println(year+" is not a Leap Year");
        }
    }
}