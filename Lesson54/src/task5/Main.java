package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aleks", "Developer", 1500));
        employees.add(new Employee("Ken", "Developer", 900));
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

        System.out.println("Задача 1: ");

        List<Employee> result1 = employees.stream()
                .filter(x -> !x.getPosititon().equals("CEO"))
                .toList();
        result1.forEach(System.out::println);
        System.out.println("-".repeat(60));

        System.out.println("Задача 2: ");

        Map<String, List<Employee>> result2 = employees.stream()
                .collect(Collectors.groupingBy(x -> x.getPosititon()));
        result2.forEach((x, y) -> {
            System.out.println(x);
            y.forEach(System.out::println);
        });
        System.out.println("-".repeat(60));

        System.out.println("Задача 3.1: ");

        Double result3_1 = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average().orElse(0.0);
        System.out.println("Средняя зарплата всех сотрудников: " + result3_1);
        System.out.println("-".repeat(60));

        System.out.println("Задача 3.2: ");

        Double result3_2 = employees.stream()
                .collect(Collectors.averagingDouble(x -> x.getSalary()));
        // .collect(Collectors.averagingDouble(value -> value.getSalary()));
        //                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(result3_2);
        System.out.println("-".repeat(60));

        System.out.println("Задача 4: ");

        List<String> result4 = employees.stream()
                .filter(x -> x.getSalary() > 1000)
                .map(x -> x.getName())
                .collect(Collectors.toList());
        System.out.println(result4);
        System.out.println("-".repeat(60));

        System.out.println("Задача 5: ");

        List<String> result5 = employees.stream()
                .filter(x -> x.getPosititon().equals("Manager"))
                .peek(x -> x.setSalary(x.getSalary() * 1.15))
                .map(x -> x.getName() + " " + x.getSalary())
                .collect(Collectors.toList());
        System.out.println(result5);
        System.out.println("-".repeat(60));


        System.out.println("Задача 6: ");

        Employee result6 = employees.stream()
                .min((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).get();
        System.out.println(result6);
        System.out.println("-".repeat(60));

        //Employee result6 = employees.stream()
        //                .min((x, y) -> Double.compare(x.getSalary(), y.getSalary()))
        //                .orElse(null);

        System.out.println("Задача 7: ");
        Map<String, List<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(x -> x.getPosititon()));

        result.forEach((position, employeeList) -> {
            System.out.println(position);
            Employee result7 = employeeList.stream().max((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).get();
            System.out.println(result7);
        });
        System.out.println("-".repeat(60));

        // employees.stream()
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
                .collect(Collectors.groupingBy(x -> x.getPosititon()));
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
