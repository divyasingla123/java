package ACP;

 import java.util.*;
 import java.util.function.Predicate;

// public class lambda {
//     public static void main(String[] args) {
//         // List<Integer> numbers = Arrays.asList(5,10,25,30);
//         // Predicate<Integer> isEven = (Integer n) -> n % 2 == 0;
//         // numbers.stream()
//         //         .filter(isEven)
//         //         .forEach(System.out::println);
        
//         List<String> numbers = Arrays.asList("apple", "banana", "cherry", "date");
//         Predicate<String> check = n-> n.length()<=4;
//         numbers.stream()
//                 .filter(check)
//                 .forEach(System.out::println);
//     }
// }


public class lambda{
    public static void main(String[] args) {
        Predicate<String> isvalidemail=email->email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        String[] testemail={
            "mustakim.shaikh@gmail.com",
            "john.doe@",
            "abc123@domain.co.in",
            "invalid-email.com",
            "hello@123"
        };
        for(String email:testemail){
            if(isvalidemail.test(email)){
                System.out.println("valid");
            }else{
                System.out.println("not valid");
            }
        }
    }
}