package javaArray;

public class Exemplo003 {
    public static void main(String[] args) {
        
        int[][] myArrayMult = {{1,2,3,4}, {5,6,7}};
      
        for (int i=0; i<myArrayMult.length; i++) {
            for (int j=0; j<myArrayMult[i].length; j++) {
                System.out.println(myArrayMult[i][j]);
            }
        }
    }
    
}
