package task_5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aleks", "Developer", 1500));
        employees.add(new Employee("Ken", "Developer", 900));
        employees.add(new Employee("Ben", "Developer", 1200));
        employees.add(new Employee("Jack", "Developer", 1500));
        employees.add(new Employee("John", "Developer", 1500));
        employees.add(new Employee("Thomas", "Manager", 680.50));
        employees.add(new Employee("Thea", "CEO", 2000));
        employees.add(new Employee("Mary", "Manager", 800));
        employees.add(new Employee("Katy", "Manager", 700));

        //        0. Создать класс Employee
//        1. Вывести всех сотрудников без высшего руководителя
//        2. Сгруппировать сотрудников по должности
//        3. Вычислить среднюю зарплату всех сотрудников (двумя способами)
//        4. Получить список сотрудников с зп > 1000
//        5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
//        6. Получить сотрудника с самой низкой зп
//        7. Получите сотрудников из всех отделов с максимальной зп

//        List<Employee> result1 = employees.stream()
//                .filter(x -> !x.getPosition().equals("CEO"))
//                .collect(Collectors.toList());
//
//        System.out.println("Задача 1:");
//        result1.forEach(System.out::println);
//
//        Map<String, List<Employee>> result2 = employees.stream()
//                .collect(Collectors.groupingBy(x -> x.getPosition()));
//
//        System.out.println("Задача 2:");
//        result2.forEach((position, employeeList) -> {
//            System.out.println(position);
//            employeeList.forEach(System.out::println);
//        });
//
//        System.out.println("Задача 3:");
//        double avgSalary = employees.stream()
//                .collect(Collectors.averagingDouble(x -> x.getSalary()));
//        System.out.println("Средняя зарплата - " + avgSalary);
//
//        avgSalary = employees.stream() // стрим сотрудников
//                .mapToDouble(Employee::getSalary) // стрим сотрудников -> стрим чисел (зарплат)
//                .average() // стрим чисел -> вычисляется среднее значение
//                .orElse(0); // возвращается результат по умолчанию, если результата нет
//        System.out.println("Средняя зарплата - " + avgSalary);
//
//        System.out.println("Задача 4:");
//        List<Employee> result4 = employees.stream()
//                .filter(x -> x.getSalary() > 1000)
//                .collect(Collectors.toList());
//        result4.forEach(System.out::println);
//
//        System.out.println("Задача 5:");
//        employees.stream()
//                .filter(x -> x.getPosition().equals("Manager"))
//                .forEach(x -> x.setSalary(x.getSalary() * 1.15));
////        employees.forEach(System.out::println);
////        System.out.println(employees);
//
////        for (Employee employee : employees) {
////            System.out.println(employee);
////        }
//
////        employees.forEach(x -> System.out.println(x));
//        employees.forEach(System.out::println);
//
//        System.out.println("Задача 6:");
//        Employee result6 = employees.stream()
//                .min((x, y) -> Double.compare(x.getSalary(), y.getSalary()))
//                .orElse(null);
//        System.out.println("Все сотрудники:");
//        employees.forEach(System.out::println);
//        System.out.println("Сотрудник с минимальной заработной платой:");
//        System.out.println(result6);
//
//        System.out.println("Задача 7:");
//
//        employees.stream()
//                .collect(Collectors.groupingBy(x -> x.getPosition()))
//                .forEach((x, y) -> y.stream()
//                        .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
//                        .limit(1)
//                        .forEach(System.out::println));

        System.out.println("Задача 8:");

        System.out.println("Исходный список:");
        employees.forEach(System.out::println);

        System.out.println();

        Map<String, List<Employee>> employeesByPosition = employees.stream()
                .collect(Collectors.groupingBy(x -> x.getPosition()));
        employeesByPosition.put("Worker", null);
        employeesByPosition.put("Secretary", new ArrayList<>());

        for (List<Employee> list : employeesByPosition.values()) {
            if (list != null && !list.isEmpty()) {
                list.sort((x, y) -> Double.compare(y.getSalary(), x.getSalary()));
                double max = list.get(0).getSalary();
//                list.forEach(x -> {
//                    if (x.getSalary() == max) {
//                        System.out.println(x);
//                    }
//                });
                list.stream()
                        .filter(x -> x.getSalary() == max)
                        .forEach(System.out::println);
            }
        }
    }
}