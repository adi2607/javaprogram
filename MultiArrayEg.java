class MultiArrayEg {
    public static void main(String args[]){
        int myarr[] [] = {{1,2,3,4},{5,6,7,8},{8,6,3,5}};
        int myarr1[] [] = {{12,21,8,4},{55,68,70,8},{58,6,63,35}};

        for(int i=0;i<myarr.length;i++){
            for(int j=0;j<myarr[i].length;j++){
                System.out.print(myarr[i][j] + " ");
            }
            System.out.println();
        }
        
        int c[][]= new int [3][4];
        System.out.println(". . . . . . . .  ");
    
        for(int i=0;i<myarr.length;i++){
            for(int j=0;j<myarr[i].length;j++){
                c [i][j]=myarr[i][j] + myarr1[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }   
}