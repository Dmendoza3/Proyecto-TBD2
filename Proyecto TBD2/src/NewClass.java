
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dario
 */
public class NewClass {
    
    public static void main(String args[]) throws InterruptedException{
        String[][] matrix = new String[10][10];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = " ";
            }
        }
        
        
        int x = 4, y = 6;
        int dirX = 1, dirY = 1;
        
        
        while(true){
            matrix[x][y] = " ";
            
            x += dirX;
            y += dirY;
            
            if(x < 1){
                x = 0;
                dirX = 1;
            }
            
            if(x > matrix.length - 2){
                dirX = -1;
            }
            
            if(y < 1){
                dirY = 1;
            }
            
            if(y > matrix[0].length - 2){
                dirY = -1;
            }
            
            matrix[x][y] = "*";
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
            System.out.println("\n\n");
            Thread.sleep(235);
        }
    }
    
}
