package Task;
import java.util.Scanner;
public class task2
{
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number: ");
    double num = sc.nextDouble();
    if (num > 0){
        System.out.println(num + " " + "is a positive number");
    }
    else if(num < 0){
        System.out.println(num + " "+ "is a negative number");
    }
    else{
        System.out.println("The number is zero");
    }
    }
}
