package com.company;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[10];

        Employee person1 = new Employee("Дмитрий", "Сергеевич", "Иванов", 1, 45_000);
        Employee person2 = new Employee("Сергей", "Васильевич", "Жуков", 1, 50_000);
        Employee person3 = new Employee("Анастасия", "Александровна", "Шушкова", 1, 43_000);
        Employee person4 = new Employee("Светлана", "Владимировна", "Чухнова", 2, 65_000);
        Employee person5 = new Employee("Валерий", "Константинович", "Рыков", 2, 53_000);
        Employee person6 = new Employee("Ирина", "Сергеевна", "Сметанкина", 2, 71_000);
        Employee person7 = new Employee("Святослав", "Николаевич", "Комаров", 2, 37_000);
        printEmployees(employeeArray);
        System.out.println();
        System.out.println("Суммарная трата на зарплату сотрудникам: " + calculateTotalSalary(employeeArray));
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary(employeeArray));
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary(employeeArray));
        System.out.println();
        System.out.println("Средняя зарплата " + calculateAverageSalary(employeeArray));
        System.out.println();
        printFullNames(employeeArray);
    }

    public static void printFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }


    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }


    public static float calculateTotalSalary(Employee[] employees) {
        float sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee result = employees[0];
        float minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee result = employees[0];
        float minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary(Employee[] employees) {
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeCount++;
            }
        }

        return calculateTotalSalary(employees) / employeeCount;
    }
}





