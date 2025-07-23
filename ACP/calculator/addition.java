package calculator;
import java.util.Scanner;
import java.util.function.Predicate;
public class addition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Predicate<Integer> p1=n->n==0;
        System.out.println("press 1 to 5 for selecting the operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println("Enter two numbers a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
            switch(choice){
            case 1:
            System.out.println("sum is: "+(a+b));
            break;
            case 2:
            System.out.println("difference is"+(a-b));
            break;
            case 3:
            System.out.println("product is: "+(a*b));
            break;
            case 4:
            if(p1.test(b)) {
            System.out.println("quotient is: "+(a/b));
            break;
            }
            else {
            System.out.println("Division by zero is not allowed.");
            break;
            }
            case 5:
            System.out.println("Exiting...");
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}