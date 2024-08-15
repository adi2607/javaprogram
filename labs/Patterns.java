//Pattern Printing
//Write a program to print various patterns using loops, such as:
//Pyramid pattern
//Diamond pattern
//Number patterns

class Patterns {
    // Pyramid pattern
    static void Pyramid(){
        int num = 5; 
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Diamond Pattern
    static void Diamond(){
        int num = 5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=num-1;i>=1;i--){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Number Pattern
    static void Number(){
        int num = 5;
        for(int i=1;num>=i;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Pyramid();
        Diamond();
        Number();
    }
}
