import java.lang.Math;
import java.util.*;


public class app {
   public static void main(String[] args) {
      double data, result, PI;

      Scanner event = new Scanner(System.in);
      System.out.println("Insert this value");

      result = event.nextDouble();

      PI = Math.acos(-1.0);
      data = PI * Math.pow(result, 2);

      System.out.printf("PI = %f, area = %f", PI, data);
   }
}