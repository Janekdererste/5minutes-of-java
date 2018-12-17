package jcommanderDemo;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class CreateUserWithJCommander {

    public static void main(String[] args) {

        var input = new InputArguments();
        JCommander.newBuilder().addObject(input).build().parse(args);

        var user = new User();
        user.setAdmin(input.isAdmin);
        user.setAge(input.age);
        user.seteMail(input.eMail);
        user.setFirstName(input.firstName);
        user.setLastName(input.lastName);
        user.setUsername(input.username);
        System.out.println(user);
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
