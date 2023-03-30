import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int anoNascimento;
    int anoAtual;
    int idadeAtual;
    int idade2030;

    System.out.println("Digite o seu ano de nascimento");
    anoNascimento = entrada.nextInt();

    System.out.println("Digite o ano atual");
    anoAtual = entrada.nextInt();

    idadeAtual = anoAtual - anoNascimento;

    System.out.println("Idade atual:");
    System.out.println(idadeAtual);

    System.out.println("idade 2030");
    idade2030 = idadeAtual + (2030 - anoAtual);

    System.out.println(idade2030);

    entrada.close();
  }

}
