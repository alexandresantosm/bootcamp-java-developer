package javaArray;

public class Exemplo001 {
    public static void main(String[] args) {
        
        int[] myArray = new int[7];
      
        int[] myArray2 = {12,32,54,6,8,89,64};
      
        System.out.println(myArray[0]);
        System.out.println(myArray2[2]);

        myArray2[2] = 10;

        System.out.println(myArray2[2]);

        System.out.println(myArray.length);
    }
    
}
