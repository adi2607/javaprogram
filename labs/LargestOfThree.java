// Find the Largest Number
// Write a program to find the largest of three numbers.

class LargestOfThree{

    public static void main(String args[]){
        int[] num = {6,7,50}; // declared the numbers
    
        int largest = num[0]; 

        for (int i = 1; i < num.length ; i++) {
            if (num[i] > largest) { // checking the largest value 
                largest = num[i]; 
            }
        }
    
        System.out.println("The largest number is: " + largest);
    }

}