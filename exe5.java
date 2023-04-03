/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app2;

/**
 *
 * @author profslvo
 */
import java.util.*;
public class App2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner event = new Scanner(System.in);
        
        int acc = 0;
        int count = 1;
        
        while(count < 100){
            acc = acc + count;
            System.out.println("This value is: " + acc);
            count++;
        }
        
        System.out.println("Sum between 1 an 100 = " + acc);
    }
    
}
