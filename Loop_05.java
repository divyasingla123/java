import java.util.Scanner;
public class Loop_05 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();
//     // for (int i=1;i<=n;i++){
//     //     System.out.println("5"+" * "+ i +" = "+(5*i));
//     // }
    
//     int count=0;
// //     for(int i=1;i<=n;i++){
// //         if(n%i==0){
// //             count++;
// //         }
// //     }
// //     if(count==2){
// //         System.out.println("Prime");
// //     }
// //     else{
// //         System.out.println("Not prime");
// //     }

//     // for(int i=2;i<=n;i++){
//     //     count=0;
//     //     for(int j=1;j<=i;j++){
//     //         if(i%j==0){
//     //             count++;
//     //         }
//     //     }
//     //     if(count==2){
//     //         System.out.println(i);
//     //     }
//     // }


//     // for(int i=2;i<=n;i++){
//     //     count=0;
//     //    if (n%i==0){
//     //     for(int j=1;j<=i;j++){
//     //         if(i%j==0){
//     //             count++;
//     //         }
//     //     }
//     //     if(count==2){
//     //         System.out.println(i);
//     //     }
//     //    }

// int year=sc.nextInt();
// if(year%2000!=0&&year%400==0||year%100!=0 &&year%4==0){
// System.out.println("Leap Year");
// }
// else
// System.out.println("Not a Leap Year");


for (int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}
for (int i=1;i<=4;i++){
    for(int j=3;j>=i;j--){
        System.out.print("* ");
    }
    System.out.println();
}
    }

   }










