import java.awt.*;

public class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Name: " + name + " Last Name: " + lastName;
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println(person);
    }

}
