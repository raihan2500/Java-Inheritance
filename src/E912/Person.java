package E912;

public class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Year of birth: " + yearOfBirth + "\n";
    }
}
