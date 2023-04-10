package appcalcnote;

import java.util.*;

public class AppCalcNote {

    public static void main(String[] args) {
        Scanner event = new Scanner(System.in);

        // Inserir notas1
        double notas1[] = new double[5];
        System.out.println("As notas : ");
        for (int notes = 0; notes < notas1.length; notes++) {
            notas1[notes] = event.nextDouble();
        }

        // Inserir notas2
        double notas2[] = new double[5];
        System.out.println("As notas : ");
        for (int notes = 0; notes < notas2.length; notes++) {
            notas2[notes] = event.nextDouble();
        }

        double media_total[] = new double[5];
        for (int i = 0; i < media_total.length; i++) {
            media_total[i] = 0.4 * notas1[i] + 0.6 * notas2[i];
        }

        // Total Alunos
        double alunos[] = new double[5];
        System.out.println("Total de alunos: ");
        for (int indice = 0; indice < alunos.length; indice++) {
            alunos[indice] = media_total[indice];

            if (media_total[indice] <= 5) {
                System.out.println("Sua nota é: " + media_total[indice]);
            }
        }

        event.close();
    }
}
