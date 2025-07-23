package ACP;
// class parent{
//     public void greet(){    
//      System.out.println("Hello from parent class");
//     }
// }
// class child extends parent{
//     //@override
//     public void greets(){
//         System.out.println("Hello from child class");
//     }
// }
// public class annotations {
//    public static void main(String[] args) {
//     parent p = new child();
//     p.greet();
//    }
// }


// import java.lang.annotation.*;
// @Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.TYPE)
// @interface Developer{
//     String name();
//     String date();
//     String version();
// }
// @Developer(name="mustakim",
//     date="2025-05-07",
//     version="1.0")
// class project{
//     void info(){
//         System.out.println("details");
//     }
// }
// public class annotations{
//       public static void main(String[] args) {
//         Class<?> clazz=project.class;
//         if(clazz.isAnnotationPresent(Developer.class)){
//             Developer dev=clazz.getAnnotation(Developer.class);
//             System.out.println("Name: " + dev.name());
//             System.out.println("Date: " + dev.date());
//             System.out.println("Version: " + dev.version());
//         } else {
//             System.out.println("No Developer annotation present.");
//         }
//       }
// }

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.TYPE) 
@interface BookInfo { 
    String title(); 
    String author(); 
} 
 
@BookInfo(title = "Learn Java", author = "Mustakim Shaikh") 
class Book { } 
public class annotations{
    public static void main(String[] args) {
        Class<?> bookClass = Book.class;
        if (bookClass.isAnnotationPresent(BookInfo.class)) {
            BookInfo bookInfo = bookClass.getAnnotation(BookInfo.class);
            System.out.println("Title: " + bookInfo.title());
            System.out.println("Author: " + bookInfo.author());
        } else {
            System.out.println("No BookInfo annotation present.");
        }
    }
}