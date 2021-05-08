package lesson4;

public class person {

    private final String firstName;
    private final String lastName;
    private final int age;

    public person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName=" + firstName + '\'' +
                ", lastName= " + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}