package com.any.exceptionsHomeworkFourFive;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class EmployeeService {


    /*    List<Employee> arrEmployee = List.of({
                new Employee("Ivan", "Ivanov"),
                new Employee("Petr", "Petrov"),
                new Employee("Fedor", "Popov"),
                new Employee("Mary", "Petrova"),
                new Employee("July", "Sidorova")
        );*/

    List<Employee> arrEmployee = new ArrayList<>();
    Set<Employee> employeeSet = new HashSet<>();

    public Employee findEmployee(Employee firstName, Employee lastName) { // поиск для использования в методах ниже
        Employee findElement = new Employee("Ivan", "Ivanov");
        if (arrEmployee.contains(findElement)){
            return findElement;
        }
        return findElement;
    }

    public Employee addEmployee(Employee firstName, Employee lastName) {
        Employee newElement = new Employee("Ivan", "Ivanov");
        newElement = findEmployee(firstName, lastName);
        return add(newElement);
    }

    public Employee removeEmployee(Employee firstName, Employee lastName) {
        Employee removeElement = new Employee("Ivan", "Ivanov");
        removeElement = findEmployee(firstName, lastName);
        return remove(removeElement);
    }


}
