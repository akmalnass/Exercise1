import java.util.Scanner;


public class minutesToSeconds {
    
    public static void main(String[] args) {

        int minutes,seconds;

        Scanner myObjectiveScanner = new Scanner(System.in);

        System.out.println("Enter Minutes");

        minutes = myObjectiveScanner.nextInt();

        seconds = minutes * 60;

        System.out.println("The Minutes in Seconds is " + seconds);
        
        myObjectiveScanner.close(); 

        }

}
