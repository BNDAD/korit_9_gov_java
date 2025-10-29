package com.korit.study.ch30;

import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTest {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        System.out.println(names.stream().map(String::toUpperCase).toList());

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().map(n -> n * n).toList());


        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
        System.out.println(words.stream().map(String::length).toList());

        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);
        System.out.println(prices.stream().map(n -> (n + (n * 0.1))).toList());


        class Person {
            private String name;
            private int age;
            // constructor, getters


            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        System.out.println(people.stream().map(Person::getName).toList());

        List<String> usernames = Arrays.asList("john", "mary", "steve");
        System.out.println(usernames.stream().map(n -> "User: " + n).toList());


        class Employee {
            String name;
            double salary;
            // constructor, getters


            public Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }

            public String getName() {
                return name;
            }

            public double getSalary() {
                return salary;
            }
        }

        class EmployeeDTO {
            String displayName;
            String salaryInfo;
            // constructor, getters

            public EmployeeDTO(String displayName, String salaryInfo) {
                this.displayName = displayName;
                this.salaryInfo = salaryInfo;
            }

            public String getDisplayName() {
                return displayName;
            }

            public String getSalaryInfo() {
                return salaryInfo;
            }
        }

        /*Employee를 EmployeeDTO로 변환하세요. displayName은 "Mr./Ms. {name}",
        salaryInfo는 "Salary: ${salary}" 예상 출력: [EmployeeDTO(Mr./Ms. Kim, Salary: $50000.0), ...]*/

        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );

        employees.stream().map(n -> new EmployeeDTO(n.getName(), String.valueOf(n.getSalary())));



    }
}
