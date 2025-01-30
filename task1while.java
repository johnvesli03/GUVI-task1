package Task;
import java.util.Scanner;
public class task1while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int first_num = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int second_num = sc.nextInt();
        while (first_num <= second_num) {
            System.out.println(first_num + " ");
            first_num++;
        }
    }
}

