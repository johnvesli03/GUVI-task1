package Task;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number_1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number_2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number_3 = sc.nextInt();
        int small_number = 0;
        if (number_1 <= number_2 && number_1 <= number_3) {
            small_number = number_1;
        } else if (number_2 <= number_1 && number_2 <= number_3) {
            small_number = number_2;
        } else
            {
                small_number = number_3;
            }
            System.out.println("The small number is: " + small_number);
        }
    }

