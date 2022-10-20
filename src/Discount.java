import java.util.Scanner;

public class Discount {
    
    static void print(String line) {
        System.out.println(line);

}

public static void main(String[] args) {
    int price;
    int discount;

    Scanner myObjScanner = new Scanner(System.in);

    print("Enter price of the product :");
    price = myObjScanner.nextInt();

    print("Enter Discount of the product :");
    discount = myObjScanner.nextInt();

    int Discountedprice = (price*discount) / 100;

    int Finalprice  = price - Discountedprice;

    print("Price after Discount is " + Finalprice);

    myObjScanner.close();

    }

}