class DuplicateArrayElement{
    public static void main(String args[]){
        int[] mycount={1,5,8,3,7,6,9,3,5,44,63};
        for(int i=0;i<mycount.length;i++){
            for(int j=i+1;j<mycount.length;j++){
                if(mycount[i]==mycount[j]){   // condition to check i & j value are same 
                    System.out.println(mycount[j]);
                }
            }
        }
    }
}