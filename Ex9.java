import java.util.*;

public class Ex9 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double salarioMinimo = 0;
    double qtdeQuilowatts = 0;
    double valorCadaQuilowatt = 0;
    double valorPagar = 0;
    double valorComDesconto = 0;

    System.out.println("Informe o salario minimo");
    salarioMinimo = entrada.nextDouble();

    System.out.println("Informe a quantidade de quilowatts consumida");
    qtdeQuilowatts = entrada.nextDouble();

    valorCadaQuilowatt = salarioMinimo / 500;
    System.out.println("Valor em reais de cada quilowatts: " + valorCadaQuilowatt);

    valorPagar = valorCadaQuilowatt * qtdeQuilowatts;
    System.out.println("Valor em reais a ser pago: " + valorPagar);

    valorComDesconto = valorPagar * (1 - 0.15);
    System.out.println("Valor em reais com desconto: " + valorComDesconto);

    entrada.close();
  }

}
