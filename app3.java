public class App3 {

   public static void main (String[] args){
      double note, nt;

      Scanner event = new Scanner(System.in);

      System.out.println("This is value!");

      note = event.nextDouble();
      nt = note + (0.25*note);

      System.out.println("Hello World!");
   }

}