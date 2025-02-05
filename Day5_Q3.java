import java.util.*;

interface UserService {
    default String getWelcomeMessage() {                        // Default Method
        return "Welcome, Guest!";
    }

    Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService {
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }

    public String getPersonalizedWelcomeMessage(String name) {
        return getUser(name).map(n -> "Welcome, " + n + "!")                          //Lambda Expression.
                             .orElse(getWelcomeMessage());
    }
}

public class Day5_Q3 {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        
        System.out.println(userService.getPersonalizedWelcomeMessage("Jaitanya"));
        System.out.println(userService.getPersonalizedWelcomeMessage(null));  
    }
}
