//WAP to print name ,age,roll no, martial status in boolean
import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,gender,country;
        int age;
        double roll_no;
        boolean ms;
        name = sc.nextLine();
        age = sc.nextInt();
        gender = sc.nextLine();
        sc.nextLine();
        roll_no = sc.nextDouble();
        country = sc.nextLine();
        sc.nextLine();
        ms = sc.nextBoolean();
        sc.nextLine();
        System.out.print(name +" "+ age +" "+gender+" "+country+" "+ roll_no+" "+ ms); 
    }
}