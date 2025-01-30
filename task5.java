package Task;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        double bill_amount = sc.nextDouble();
        double discount = 0;
        if (bill_amount <= 0) {
            discount = 0;
        } else if (bill_amount >= 500 && bill_amount <= 1000) {
            discount = 10;
        } else if (bill_amount > 1000) {
            discount = 20;
        }
        System.out.println("The bill amount after discount: " + (bill_amount - (bill_amount * discount) / 100));

    }
}

