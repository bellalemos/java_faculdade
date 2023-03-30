import java.util.Scanner;

public class app8 {
   public static void main(String[] args) {
      Scanner e = new Scanner(System.in);

      double idade, peso, altura, q18, mid, malt, p80;
      q18 = 0;
      mid = 0;
      malt = 0;
      p80 = 0;
      peso = 0;


      // !PRIMEIRO FOR
      for (int i = 0; i <= 5; i++) {

         for (int j = 1; j <= 11; j++) {
            System.out.println("digite a idade, peso e altura");
            idade = e.nextDouble();
            peso = e.nextDouble();
            altura = e.nextDouble();

            if (idade < 18) {
               q18 = q18 + 1;
            }
            if (p80 > 80) {
               p80 = p80 + 1;
            }
            mid = mid + idade;
            malt = malt + altura;
         }

         mid = mid / 11.0;
         System.out.println("media da idade do time" + mid);
         System.out.println("jogadores menores de 18" + q18);
         malt = malt / 55.0;
         System.out.println("media das alturas" + malt);
         p80 = p80 / 55.0 * 100;
         System.out.println("percentual jogadores acima de 80kg" + p80);
      }
      // !PRIMEIRO FOR
   }
}