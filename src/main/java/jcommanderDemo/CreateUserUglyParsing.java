package jcommanderDemo;

public class CreateUserUglyParsing {

    public static void main(String[] args) {

        var user = new User();
        try {
            user.setUsername(args[0]);
            user.seteMail(args[1]);
            if (args.length > 2)
                user.setFirstName(args[2]);
            if (args.length > 3)
                user.setLastName(args[3]);
            if (args.length > 4)
                user.setAge(Integer.parseInt(args[4]));
            if (args.length > 5)
                user.setAdmin(Boolean.parseBoolean(args[5]));
        } catch (Exception e) {
            throw new RuntimeException("Your command line args are incorrect!");
        }

        System.out.println(user);
    }
}
