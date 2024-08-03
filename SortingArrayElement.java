// class SortingArrayElement{
//     public static void main(String args[]){
//         int[] mycount={1,5,8,3,7,6,9,3,5,44,63};
//         int temp=0;

//         for(int i=0;i<mycount.length;i++){
//             for(int j=i+1;j<mycount.length;j++){
//                 if(mycount[i]>mycount[j]){
//                     temp=mycount[i];
//                     mycount[i]=mycount[j];
//                     mycount[j]=temp;
//                 }
//             }
//         }
//         System.out.println("Accending Sorted Array");
//         for(int i=0;i<mycount.length;i++){
//             System.out.println(mycount[i] + " ");
//         }
//     }
// }

// class SortingArrayElement{
//     public static void main(String args[]){
//         int[] mycount={1,5,8,3,7,6,9,3,5,44,63};
//         int temp=0;

//         for(int i=0;i<mycount.length;i++){
//             for(int j=i+1;j<mycount.length;j++){
//                 if(mycount[i]<mycount[j]){
//                     temp=mycount[i];
//                     mycount[i]=mycount[j];
//                     mycount[j]=temp;
//                 }
//             }
//         }
//         System.out.println("Decending Sorted Array");
//         for(int i=0;i<mycount.length;i++){
//             System.out.print(mycount[i] + " ");
//         }
//     }
// }


// Second highest and second lowest

class SortingArrayElement{
    public static void main(String args[]){
        int[] mycount={1,5,8,3,7,6,9,3,5,44,63};
        int temp=0;

        for(int i=0;i<mycount.length;i++){
            for(int j=i+1;j<mycount.length;j++){
                if(mycount[i]>mycount[j]){
                    temp=mycount[i];
                    mycount[i]=mycount[j];
                    mycount[j]=temp;
                }
            }
        }
        System.out.println("Decending Sorted Array");
        for(int i=0;i<mycount.length;i++){
            System.out.print(mycount[i] + " ");
        }

        System.out.println();
        System.out.println("Lowest & Highest element");
        System.out.println(mycount[0]);
        System.out.println(mycount[10]);
    }
}