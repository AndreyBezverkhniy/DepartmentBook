package pro.sky.DepartmentBook.service;

import org.springframework.stereotype.Service;
import pro.sky.DepartmentBook.model.Employee;

import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Map<Integer, List<Employee>> getAll() {
        return null;
    }

    @Override
    public List<Employee> getByDepartment(int id) {
        return null;
    }

    @Override
    public int getSumSalaryByDepartment(int id) {
        return 0;
    }

    @Override
    public int getMaxSalaryByDepartment(int id) {
        return 0;
    }

    @Override
    public int getMinSalaryByDepartment(int id) {
        return 0;
    }
}
