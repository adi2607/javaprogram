//Sum of Even and Odd Numbers
//Write a program to find the sum of all even and odd numbers in a given range.

class SumOfEvenAndOdd {
    public static void main(String args[]){
        
        int even=0;
        int odd=0;

        //to find Even and Odd number
        for(int i=1;i<=10;i++){
            if(i%2==0){ // to find even number 
                //to add even numbers
                even=even+i;
            }
            else{
                //to add odd numbers
                odd=odd+i;
            }
        }
        System.out.println("Sum of Even Number between 1 to 10: "+even);
        System.out.println("Sum of Odd Number between 1 to 10: "+odd);
    }
}
