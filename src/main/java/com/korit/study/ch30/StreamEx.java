package com.korit.study.ch30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private double salary;
    // constructor, getters

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public EmployeeDTO toDto() {
        return new EmployeeDTO(String.format("Mr./Ms. %s", name), String.format("$%f", salary));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeDTO {
    private String displayName;
    private String salaryInfo;

    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "displayName='" + displayName + '\'' +
                ", salaryInfo='" + salaryInfo + '\'' +
                '}';
    }

    // constructor, getters
}

public class StreamEx {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );

        List<String> domains = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1))
                .toList();

        System.out.println(domains);

        Set<String> domains2 = emails.stream()
                .map(email -> email.substring(email.indexOf(".") + 1))
                .collect(Collectors.toSet());

        System.out.println(domains2);

        List<String> domains3 = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1, email.indexOf(".")))
                .toList();

        System.out.println(domains3);

        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );

        List<EmployeeDTO> employeeDTOs = employees.stream()
                .map(Employee::toDto)
                .toList();

        System.out.println(employees);
        System.out.println(employeeDTOs);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers.stream().filter(number -> number % 2 == 0).toList());


        List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly", "ant", "tiger");
        System.out.println(words.stream().filter(word -> word.length() >= 5).toList());

        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew", "David");
        System.out.println(names.stream().filter(name -> name.startsWith("A")).toList());

        List<Integer> mixedNumbers = Arrays.asList(-5, 3, -2, 8, -1, 0, 7, -9, 4);
        System.out.println(mixedNumbers.stream().filter(mixedNumber -> mixedNumber >= 0).toList());

        class Product {
            String name;
            int price;
            // constructor, getters

            public Product(String name, int price) {
                this.name = name;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public int getPrice() {
                return price;
            }
        }

        List<Product> products = Arrays.asList(
                new Product("노트북", 1500000),
                new Product("마우스", 30000),
                new Product("키보드", 80000),
                new Product("모니터", 300000),
                new Product("USB", 15000)
        );


        System.out.println(products.stream().filter(p -> p.getPrice() >= 50000 && p.getPrice() <= 500000).map(Product::getName).toList());




        class Item {
            String name;
            int stock;
            boolean onSale;
            int price;
            // constructor, getters

            public Item(String name, int stock, boolean onSale, int price) {
                this.name = name;
                this.stock = stock;
                this.onSale = onSale;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public int getStock() {
                return stock;
            }

            public boolean isOnSale() {
                return onSale;
            }

            public int getPrice() {
                return price;
            }
        }

        List<Item> items = Arrays.asList(
                new Item("노트북", 5, true, 1000000),
                new Item("마우스", 0, true, 30000),
                new Item("키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("웹캠", 0, false, 60000)
        );

//        재고가 1개 이상 있고(stock > 0), 할인 중인(onSale = true) 상품만 필터링하세요. 예상 출력:[노트북, 헤드셋]

        System.out.println(items.stream().filter(n -> n.getStock() > 0).filter(Item::isOnSale).map(Item::getName).toList());



        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);

        List<Integer> filteringNumbers = numbers4.stream().filter(n -> numbers4.stream().filter(n2 -> n2 == n).count() == 1).toList();
        System.out.println(filteringNumbers);
    }
}