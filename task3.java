package Task;
import java.util.Scanner;
public class task3{
   public static void main (String[]args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num = sc.nextInt();
       int reversed_num = 0;
       while (num != 0) {
           int last = num % 10;
           reversed_num = reversed_num * 10 + last;
           num /= 10;
       }
       System.out.println("The reversed number: " + reversed_num);

   }
}
