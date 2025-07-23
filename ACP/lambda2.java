package ACP;
import java.util.function.Predicate;
public class lambda2 {
    public static void main(String[] args) {
        int[] arr={-10,-20,0,5,10,15};
        Predicate<Integer> ispositive=n->(n>0);
        Predicate<Integer> iseven=n->(n%2==0);
        for(int n:arr){
           if(ispositive.test(n)){
            System.out.println("true");
           } 
           else{
            System.out.println("false");
           }
        }
    }
}
