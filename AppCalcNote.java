package appcalcnote;

import java.util.*;

public class AppCalcNote {

    public static void main(String[] args) {
        Scanner event = new Scanner(System.in);
        // Inserir Gabarito
        char gabarito[] = new char[5];
        for (int indice = 0; indice < gabarito.length; indice++) {
            gabarito[indice] = event.nextLine().charAt(0);
            System.out.println("Inserir o gabarito: " + gabarito[indice]);
        }

        // Inserir notas
        char notas[] = new char[5];
        for (int notes = 0; notes < notas.length; notes++) {
            notas[notes] = event.nextLine().charAt(0);
            System.out.println("As notas são: " + notas[notes]);
        }

        double notas_provas = 0;
        for (int i = 0; i < 5; i++) {
            if (notas[i] == gabarito[i]) {
                notas_provas = notas_provas + 2;
            }

        }

        System.out.println("Sua nota é: " + notas_provas);
        event.close();
    }

}
