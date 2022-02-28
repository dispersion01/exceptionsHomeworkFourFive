package com.any.exceptionsHomeworkFourFive;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class EmployeeService {




    List<Employee> arrEmployee = new ArrayList<>();
    Set<Employee> employeeSet = new HashSet<>();

    public Employee findEmployee(String firstName, String lastName) { // поиск для использования в методах ниже
        Employee findElement = new Employee(firstName,  lastName);
        if (arrEmployee.contains(findElement)){
            return findElement;
        }
        return findElement;
    }

    public Employee addEmployee(String firstName, String lastName) {
        Employee newElement = new Employee(firstName,  lastName);
        newElement = findEmployee(firstName, lastName);
        return add(newElement);
    }

    public Employee removeEmployee(String firstName, String lastName) {
        Employee removeElement = new Employee(firstName,  lastName);
        removeElement = findEmployee(firstName, lastName);
        return remove(removeElement);
    }


}
