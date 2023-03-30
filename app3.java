import java.util.*;
public class app3 {

   public static void main(String[] args) {
      Scanner event = new Scanner(System.in);
      System.out.println("insert your value:");

      double note, note2, nt;

      note = event.nextDouble();
      note2 = event.nextDouble();
      nt = note + (0.25 * note2) / 5;

      System.out.println("result is: " + nt);

   }



}