package ex1_validating_parameters.Person;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        try {
            name.length();
            if (name.length() > 40) {
                throw new IllegalArgumentException("Name must contain no more than 40 characters");
            } else if (name.isBlank()) {
                throw new IllegalArgumentException("Name must contain actual characters");
            } else if (name.isEmpty()) {
                throw new IllegalArgumentException("Name must be provided");
            }
            System.out.println("Name is valid");
        } catch (Exception e) {
            System.out.println("Error: name is invalid");
        }

        this.name = name;

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        } else {
            System.out.println("Age is valid");
        }

        this.age = age;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
