import java.util.Scanner;
public class Functions_07 {



    // public static void num(int n){
    //     System.out.println(n);
    //     if(n<10){
    //         num(n+1);
    //     }
    //     else {
    //         return ;
    //     }
    // } 
    // public static void main(String[] args) {
    //     int n=0;
    //     num(n);
    // }




//     public int result;
// public static int power(int x,int y){
//     if (y==0){
//         return 1 ;
//     }
//    return x * power(x, y - 1);
// }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();
//         int result=power(x,y);
//         System.out.println(result);
//     }




    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
}
