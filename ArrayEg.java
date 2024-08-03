class ArrayEg{
    public static void main(String args[]){
        int[] mycount={1,5,8,3,7,6,9,5,44,63};

        String[] myarr= new String[5];
        myarr[0]="mango";
        myarr[1]="banana";
        myarr[2]="mango";
        myarr[3]="apple";
        myarr[4]="grapes";
        // myarr[5]="Watermelon"; //Index 5 out of bounds for length 5

        System.out.println(myarr[4]);
        System.out.println(mycount[6]);
        System.out.println(mycount.length);

        for(int i=0;i<myarr.length;i++){
            System.out.print(myarr[i]+" ");
        }

        System.out.print(" . . . . . . . . ");

        for(int i=myarr.length-1;i>=0;i--){
            System.out.print(myarr[i]+ " ");
        }

        System.out.print(" . . . . . . . . ");

        // foreach
        // datatype variablename : Arrayname
        for(int a:mycount){
            System.out.print(a + " ");
        }
    }
}