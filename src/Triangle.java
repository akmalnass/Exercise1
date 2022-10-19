import java.util.Scanner;

public class Triangle {
    
    public static void main(String args[]) {

        Scanner myObjScanner = new Scanner(System.in);

        System.out.println("Enter the base of the Triangle:");
        double base = myObjScanner.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double height = myObjScanner.nextDouble();

        double area = (base*height) / 2;
        System.out.println("Area of Triangle is: " + area);

        int height2 = 5;
        int base2 = 7;

        double area2 = 0.5 * height2 * base2;

        System.out.println("area of triange is: " + area2);

        myObjScanner.close();

    }


}
