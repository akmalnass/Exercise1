import java.util.Scanner;

public class Algorithm {
  
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st Number: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd Number: ");
        int secondInt = in.nextInt();

        int Quotient = firstInt / secondInt;
        

        System.out.printf("Sum of two numbers: %d%n", firstInt + secondInt);
        System.out.printf("Difference of two numbers: %d%n", firstInt = secondInt);
        System.out.printf("Product of two numbers: %d%n", firstInt * secondInt );
        System.out.println("Quotient of two numbers: " + Quotient);

        in.close();

    }
}

