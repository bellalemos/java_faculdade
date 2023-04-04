import java.util.*;
public class App7 {
    public static void main(String[] args) {
        Scanner event = new Scanner(System.in);

        int index, acc;
        int Arr[] = new int[9];
        
        System.out.println("Insert your number: ");
        
        acc = 9;
        for(index = 0; index < acc; index++){
            Arr[index] = event.nextInt();
        }
        
        for(index = 0; index < acc; index++){            
            if(acc % Arr[index] == 0){
                System.out.println("Position " + index + " value " + Arr[index]);                
            }
        }
    }
    
}
