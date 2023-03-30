import java.util.Scanner;

public class ex4 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double nota1;
    double nota2;
    double nota3;

    System.out.println("Digite a nota 1");
    nota1 = entrada.nextDouble();

    System.out.println("Digite a nota 2");
    nota2 = entrada.nextDouble();

    System.out.println("Digite a nota 3");
    nota3 = entrada.nextDouble();

    double media;
    media = (nota1 + nota2 + nota3) / 3;

    System.out.println("A media das notas eh:");
    System.out.println(media);
    entrada.close();
  }
}
