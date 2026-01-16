package pro.sky.DepartmentBook.service;

import org.junit.jupiter.api.Test;
import pro.sky.DepartmentBook.model.Employee;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    private EmployeeService employeeService;

    @Test
    public void givenNoEmployeesWhenAddOneThenGetAllReturnsOne() {
        employeeService = new EmployeeServiceImpl();
        assertDoesNotThrow(() -> {
            employeeService.add("123", 1, 100);
        });
        List<Employee> expected=List.of(new Employee(1,"123",1,100));
        List<Employee> actual=employeeService.getAll();
        assertIterableEquals(expected,actual);
    }
}