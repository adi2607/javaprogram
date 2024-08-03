class SecondHLArrayElement{
    
    static int PrintSecondLargest(int[] mycount, int len){
        int temp;

        for(int i=0;i<mycount.length;i++){
            for(int j=i+1;j<mycount.length;j++){
                if(mycount[i]<mycount[j]){
                    temp=mycount[i];
                    mycount[i]=mycount[j];
                    mycount[j]=temp;
                }
            }
        }
        return mycount[len-2];
    }

    public static void main(String args[]){
        int[] mycount={1,5,8,3,7,6,9,3,5,44,63,7,50};
        int len = mycount.length;
        System.out.println("Second Lowest" + SecondHLArrayElement.PrintSecondLargest(mycount,len));
        // System.out.println("Second Largest" + SecondHLArrayElement.PrintSecondLargest(mycount,len));
    }
}