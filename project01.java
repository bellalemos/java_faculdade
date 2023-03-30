import java.util.*;

public class project01 {

   public static void main(String[] args) {

      Scanner event = new Scanner(System.in);
      System.out.println("insert something!");

      int value = event.nextInt();

      if (value > 5) {
         System.out.println("value is greater than: " + value);
      } else {
         System.out.println("value invalid");
      }

      int number = event.nextInt();

      if (number % 2 == 1000) {

         System.out.println("This is number: " + number);

      } else {

         System.out.println("your here!");

      }

   }

}
