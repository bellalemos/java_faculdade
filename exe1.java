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
        
        int count = event.nextInt();
//        count = 1;

        int result = event.nextInt();
       
        result = (count * 2);
        
        while(result < 20){
            System.out.println("you here = " + count);
            count++;
        }
            
    }
    
}
