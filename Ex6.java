import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double base;
    double altura;
    double area;

    System.out.println("Digite a base do triangulo");
    base = entrada.nextDouble();

    System.out.println("Digite a altura do triangulo");
    altura = entrada.nextDouble();

    System.out.println("Calculando a area do triangulo");
    area = (base * altura) / 2;

    System.out.println(area);

    entrada.close();
  }

}
