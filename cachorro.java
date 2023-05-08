 package javaapplication14;
import java.util.Scanner;
public class JavaApplication14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double[]notasN1 = new double[15];
        double[]notasN2 = new double[15];
        double[]mediaTotal = new double[15];
        
        for(int i = 0; i < 15; i++){
            System.out.printf("digite a N1 do aluno %d: ", i+1);
            notasN1[i] = sc.nextDouble();
            System.out.printf("digite a N2 do aluno %d: ", i+1);
            notasN2[i] = sc.nextDouble();
            
            mediaTotal[i] = (0.4 * notasN1[i] + 0.6 * notasN2[i]);
            System.out.println("Media total: " +mediaTotal[i]);
        }
        
        System.out.println("media menpres dp que 5");
        for(int i = 0; i < 15; i++){
            if(mediaTotal[i] <= 5){
                System.out.println("Aluno: " + i + "Media: " + mediaTotal[i]);
            }
        }
        sc.close();
