package DSA;
import java.util.Scanner;
public class first {
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.print("enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        int sum=add(num,3);
        System.out.println("sum is "+sum);
    }

}

