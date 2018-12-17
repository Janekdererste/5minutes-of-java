package jcommanderDemo;

public class User {

    private String username;
    private String eMail;
    private String firstName;
    private String lastName;
    private int age;
    private boolean isAdmin;

    public String getUsername() {
        return username;
    }

    void setUsername(String username) {
        this.username = username;
    }

    String geteMail() {
        return eMail;
    }

    void seteMail(String eMail) {
        this.eMail = eMail;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    boolean isAdmin() {
        return isAdmin;
    }

    void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User: \n\tusername: " + username + " " + getIsAdminMessage() +
                "\n\tfirst name: " + getFirstNameMesssage() +
                "\n\tlast name: " + getLastNameMessage() +
                "\n\tage: " + getAge() +
                "\n\te-mail: " + geteMail();
    }

    private String getIsAdminMessage() {
        return isAdmin ? "is admin" : "is no admin";
    }

    private String getFirstNameMesssage() {
        return firstName == null ? "no first name set" : firstName;
    }

    private String getLastNameMessage() {
        return lastName == null ? "no last name set" : lastName;
    }
}
