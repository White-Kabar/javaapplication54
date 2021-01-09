/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;
import java.util.Scanner;
/**
 *
 * @author WHITEKABAR
 */
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	
        int i;
        final int F = 130;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter i");
        i = input.nextInt();
        
        do{
            System.out.println("Iteration "+i);
            i++;
        }while(i<=F);
        System.out.println("Out of while loop when i="+i);
        
        
    }
    
}
