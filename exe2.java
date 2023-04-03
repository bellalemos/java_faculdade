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
        
        int count;
        count = 0;
        int rest;    
        
        while(count <= 10){
            rest = count % 2;
            
            if(rest == 0){
                System.out.println("is pair = " + count);
            } else {
                System.out.println("is odd = " + count);
            }
            
            count++;
        }
            
    }
    
}
