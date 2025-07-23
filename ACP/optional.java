package ACP;

import java.util.Optional;

public class optional{
    public static Optional<String> findUserById(int id) {
    if (id == 1) return Optional.of("divya");  //if string is empty it would not lead to error
    else return Optional.empty();
}
public static void main(String[] args) {
    Optional<String> result = findUserById(1);
    result.ifPresentOrElse(
        name -> System.out.println("User found: " + name),
        () -> System.out.println("User not found")
    );
}
}
