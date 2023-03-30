import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nome;
    int idade;
    char status;
    // System.out.println("Digite o seu nome");
    nome = entrada.next();
    // System.out.println("Digite a sua idade");
    idade = entrada.nextInt();
    // System.out.println("Digite o seu status");
    status = entrada.next().charAt(0);

    System.out.println("Imprimindo informacoes");
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(status);
    entrada.close();
  }
}
