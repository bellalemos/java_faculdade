import java.util.*;

public class exercise6 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("insert your number int");

      //[] Declarando as variáveis
      int number = input.nextInt();
      boolean isCousin = true;

      //[] Implementando a logica
      if (number <= 1) {
         System.out.println("Number is invalid! Insert your number valid!");
      } else {

         for (int index = 2; index <= number / 2; index++) {
            if (number % index == 0) {
               isCousin = false;
            }
         }

         if (isCousin) {
            System.out.println(number + " Number is cousin - your here!");
         } else {
            System.out.println(number + " Number is not cousin");
         }

      }

   }
}
