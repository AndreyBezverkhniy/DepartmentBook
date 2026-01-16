package pro.sky.DepartmentBook.service;

import pro.sky.DepartmentBook.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Map<Integer, List<Employee>> getAll();

    List<Employee> getByDepartment(int id);

    int getSumSalaryByDepartment(int id);

    int getMaxSalaryByDepartment(int id);

    int getMinSalaryByDepartment(int id);
}
