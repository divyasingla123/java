
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=sc.nextInt();
        System.out.println("Enter value of b:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum of a and b is: "+c);
        System.out.println(a<<1); //left krne p value double hojati h
        System.out.println(a>>1); //right pr half
        System.out.println(b<<1);
        System.out.println(b>>1);
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
    }
} 
    
