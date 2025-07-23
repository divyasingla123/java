import java.util.*;
public class Vending_machine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=0;
        System.out.println("menu\n item 1:rs 20 \n item 2:rs 40");
        System.out.print("pick the item:");
        int item=sc.nextInt();
        sc.nextLine();
        do{
        switch(item){
            case 1:
            System.out.println("item 1 selected,rs 20");
            amount=sc.nextInt();
            sc.nextLine();
            if(amount==20){
                System.out.println("recieved item");
            }
            else{
                System.out.println("insufficient amount");
            }
            break;
            case 2:
            System.out.println("item 2 selected,rs 40");
            amount=sc.nextInt();
            sc.nextLine();
            if(amount==40){
                System.out.println("recieved item");
            }
            else{
                System.out.println("insufficient amount");
            }
            break;
            default:
            System.out.println("invalid item");
        }
    }
    while(true);
    }
}
