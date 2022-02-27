package com.any.exceptionsHomeworkFourFive;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    Employee[] arrEmployee = {
            new Employee("Ivan", "Ivanov"),
            new Employee("Petr", "Petrov"),
            new Employee("Fedor", "Popov"),
            new Employee("Mary", "Petrova"),
            new Employee("July", "Sidorova")
    };

    public Employee findEmployee(Employee firstName, Employee lastName) { // поиск для использования в методах ниже
        Employee findElement = new Employee("Ivan", "Ivanov");
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getFirstName().equals(findElement) &&
                    arrEmployee[i].getLastName().equals(findElement)) {
                return findElement;
            } else {
                throw new ExceptionsEmployee();
            }
        }
        return findElement;
    }

    public Employee addEmployee(Employee firstName, Employee lastName) {
        Employee newElement = new Employee("Ivan", "Ivanov");
        newElement = findEmployee(firstName, lastName);
        for (int i = 0; i < arrEmployee.length; i++) {
            if (((findEmployee(firstName, lastName).getFirstName() == arrEmployee[i].getFirstName()) &&
                    (findEmployee(firstName, lastName).getLastName() == arrEmployee[i].getLastName()))) {
                arrEmployee[i] = newElement;
            } else {
                throw new ExceptionsEmployee();
            }
        }
        return newElement;
    }

    public Employee removeEmployee(Employee firstName, Employee lastName) {
        Employee removeElement = new Employee("Ivan", "Ivanov");
        removeElement = findEmployee(firstName, lastName);
        for (int i = 0; i < arrEmployee.length; i++) {
            if ((findEmployee(firstName, lastName).getFirstName() == arrEmployee[i].getFirstName()) &&
                    (findEmployee(firstName, lastName).getLastName() == arrEmployee[i].getLastName())
            ) {
                arrEmployee[i] = null;
                for (int j = 0; j < arrEmployee.length; j--) {
                    arrEmployee[j] = arrEmployee[j - 1];
                }
            } else {
                throw new ExceptionsEmployee();
            }


        }
        return removeElement;
    }

/*    public Employee findEmployee(Employee firstName, Employee lastName) {
        return null;
    }*/

}
