package ex1_validating_parameters.Person;

import ex1_validating_parameters.Calculator.Calculator;

public class PersonMain {
    public static void main(String[] args) {

        // Part 1: Validating a person
        Person testNullName = new Person(null, 5);
        System.out.println();
        Person testValidPerson = new Person("Nick", 12);
        System.out.println();
        Person testNegAge = new Person("Nick", -50);

    }
}
