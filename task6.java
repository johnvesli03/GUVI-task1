package Task;
import java.util.Scanner;
public class task6{
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter the value: ");
    int a= scanner.nextInt();

    for (int i = a; i >= 1; i--) {
        for (int j = a; j >= 1; j--) {
            if (i >= j) {
                System.out.print(i);
            } else {
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
}
