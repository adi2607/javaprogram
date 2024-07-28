// class PatternEg{

//     static void printNumber(int n){
//         int i, j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int n=5;
//         PatternEg.printNumber(n);
//     }
// }

class PatternEg{

    static void printNumber(int n){
        int i, j;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        PatternEg.printNumber(n);
    }
}