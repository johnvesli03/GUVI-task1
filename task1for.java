package Task;
import java.util.Scanner;
public class task1for
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the First Number: ");
            int first_num = sc.nextInt();
            System.out.print("Enter the Second number: ");
            int second_num = sc.nextInt();
            for (int i=first_num ;i<=second_num ;i++) {
                System.out.print(first_num + " ");
                first_num++;
            }
        }
    }
