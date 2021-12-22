package task4;

public class Author {
    String name;
    String email;
    char gender;
    boolean male;

    public Author(String _name, String _email, char _gender) {
        name = _name;
        email = _email;
        gender = _gender;
    }
    public void setEmail(String _email) {
        email = _email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", at email='" + email + '\'' +
                '}';
    }
}
