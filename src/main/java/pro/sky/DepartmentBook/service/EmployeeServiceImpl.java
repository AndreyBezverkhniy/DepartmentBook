package pro.sky.DepartmentBook.service;

import org.springframework.stereotype.Service;
import pro.sky.DepartmentBook.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private int nextId = 0;
    private Map<Integer, Employee> employees = new HashMap<>();

    @Override
    public Employee add(String fio, int department, int salary) {
        return null;
    }

    @Override
    public Employee find(int id) {
        return null;
    }

    @Override
    public Employee remove(int nextId) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public double getAvgSalary() {
        return 0.;
    }
}
