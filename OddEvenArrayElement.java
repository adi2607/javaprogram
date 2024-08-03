class OddEvenArrayElement{
    
    static void OddArray(int[] mycount){
        for(int i=0;i<mycount.length;i++){
            if(mycount[i]%2!=0){
                System.out.print(mycount[i] + " ");
            }
        }
    }

    static void EvenArray(int[] mycount){
        for(int i=0;i<mycount.length;i++){
            if(mycount[i]%2==0){
                System.out.print(mycount[i] + " ");
            }
        }
    }
    public static void main(String args[]){
        int[] mycount={1,5,8,3,7,6,9,3,5,44,63,7,50};

        OddEvenArrayElement.OddArray(mycount);
        System.out.println();
        OddEvenArrayElement.EvenArray(mycount);

    }
}