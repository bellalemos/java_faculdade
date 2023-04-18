/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner event = new Scanner(System.in);
        int numA, numB, sum;

        do {
            System.out.println("insert numbers!");
            numA = event.nextInt();
            numB = event.nextInt();
        } while (numA == numB);

        sum = calc(numA, numB);
        System.out.println("this value is " + sum);

    }

    public static int calc(int numA, int numB) {
        int result = 0, i;
        for (i = numA; i < numB; i++) {

            result = result + i;

        }

        return result;
    }

}
