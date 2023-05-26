import java.util.Scanner;



public class Games {
    public static void main(String[] args) {
       

        int[][] startArray = {{9,0,0,6,4,0,0,0,3},
                              {2,7,0,0,9,0,5,8,0},
                              {0,1,0,5,8,0,0,0,0},
                              {0,9,0,0,0,0,7,0,0},
                              {0,0,7,9,6,5,8,0,0},
                              {0,0,2,0,0,0,0,4,0},
                              {0,0,0,0,5,3,0,6,0},
                              {0,5,1,0,7,0,0,2,8},
                              {4,0,0,0,1,6,0,0,5}};
                              
print2DArray(startArray);
}              
    public static void print2DArray(int[][] startArray){
        
        for (int i = 0; i < startArray.length; i++) {
            for (int j = 0; j < startArray[i].length; j++) {
                
                if(startArray[i][j]==0){
                    System.out.print(" ");
                }
                else{
               System.out.print(startArray[i][j] +"  ");
                }
        
        
         }
         System.out.println();
        }

        }
         

        
    
}