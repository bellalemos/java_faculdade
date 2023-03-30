import java.util.Scanner;

public class Ex5 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double salario;
    System.out.println("Digite o seu salario");
    salario = entrada.nextDouble();

    System.out.println("salario atual:");
    System.out.println(salario);

    System.out.println("calculando o aumento");
    double aumentoSalario;
    aumentoSalario = salario * (1 + 0.25);

    System.out.println(aumentoSalario);

    entrada.close();
  }

}
