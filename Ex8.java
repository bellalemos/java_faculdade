import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int numero;

    System.out.println("Digite um numero");
    numero = entrada.nextInt();

    System.out.println("Numero elevado ao quadrado");
    System.out.println(Math.pow(numero, 2));

    System.out.println("Numero elevado ao cubo");
    System.out.println(Math.pow(numero, 3));

    System.out.println("raiz quadrada");
    System.out.println(Math.sqrt(numero));

    System.out.println("elevado a 10");
    System.out.println(Math.pow(numero, 10));
    entrada.close();
  }

}
