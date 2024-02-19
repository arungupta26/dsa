package com.arun.test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    private double salary;

    // Constructor, getters, setters
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class ComparingExample {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alice", 25, 50000),
                new Person("Alice", 25, 60000),
                new Person("Charlie", 25, 45000)
        );

        persons =new ArrayList<>(persons);

        // Sort by name, then by age, then by salary
        List<Person> sortedPersons = persons.stream()
                .sorted(Comparator.comparing(Person::getName).reversed()
                        .thenComparing(Person::getAge)
                        .thenComparing(Person::getSalary).reversed())
                .toList();

        // Print sorted list
        sortedPersons.forEach(System.out::println);

        MyPersonComparator c = new MyPersonComparator();
        persons.sort(c);

        System.out.println("--------------------------------------------------------------");
        persons.forEach(System.out::println);




    }


}

class MyPersonComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {

        int nameComparison = p1.getName().compareTo(p2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }

        return Double.compare(p1.getSalary(), p2.getSalary());

    }
}