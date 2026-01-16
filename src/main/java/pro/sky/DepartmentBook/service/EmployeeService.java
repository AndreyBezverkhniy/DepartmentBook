package pro.sky.DepartmentBook.service;

import pro.sky.DepartmentBook.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(String fio, int department, int salary);

    Employee find(int id);

    Employee remove(int nextId);

    List<Employee> getAll();

    double getAvgSalary();
}
