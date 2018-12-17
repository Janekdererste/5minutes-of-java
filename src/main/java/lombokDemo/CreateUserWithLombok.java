package lombokDemo;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.util.HashSet;

public class CreateUserWithLombok {

    public static void main(String[] args) {

        var input = new InputArguments();
        JCommander.newBuilder().addObject(input).build().parse(args);

        // demonstrate @Builder feature
        var user = new User.UserBuilder()
                .age(input.age)
                .username(input.username)
                .eMail(input.eMail)
                .firstName(input.firstName)
                .lastName(input.lastName)
                .isAdmin(input.isAdmin)
                .build();

        // demonstrate @Getter feature
        System.out.println();
        System.out.println("Created user with username: " + user.getUsername());

        System.out.println();
        System.out.println(user);

        // demonstrate @AllArgsContructor
        var otherUser = new User(input.username, input.eMail, input.firstName, input.lastName, input.age, input.isAdmin);

        // demonstrate @EqualsAndHashCode
        var userSet = new HashSet<>();
        userSet.add(user);
        userSet.add(otherUser); // this should should replace user with otherUser because equality is tested for parameters instead of reference equality

        System.out.println();
        System.out.println("user set has " + userSet.size() + " entries"); //this should print 'user set has 1 entries'
    }

    private static class InputArguments {

        @Parameter(required = true, names = {"-u", "-username"}, description = "This must be a unique username")
        private String username;

        @Parameter(required = true, names = "-mail")
        private String eMail;

        @Parameter(names = "-firstName")
        private String firstName;

        @Parameter(names = "lastName")
        private String lastName;

        @Parameter(names = "-age")
        private int age = 0;

        @Parameter(names = "-isAdmin")
        private boolean isAdmin = false;

        private InputArguments() {
        }
    }
}
