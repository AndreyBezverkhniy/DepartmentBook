package pro.sky.DepartmentBook.service;

import org.junit.jupiter.api.Test;
import pro.sky.DepartmentBook.exception.EmployeePresenceException;
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
        List<Employee> expected = List.of(new Employee(1, "123", 1, 100));
        List<Employee> actual = employeeService.getAll();
        assertIterableEquals(expected, actual);
    }

    @Test
    public void givenOneEmployeeWhenAddUnaddedEmployeeThenGetAllReturnsBoth() {
        employeeService = new EmployeeServiceImpl();
        assertDoesNotThrow(() -> {
            employeeService.add("123", 1, 100);
        });
        assertDoesNotThrow(() -> {
            employeeService.add("456", 2, 200);
        });
        List<Employee> expected = List.of(new Employee(1, "123", 1, 100), new Employee(1, "456", 2, 200));
        List<Employee> actual = employeeService.getAll();
        assertIterableEquals(expected, actual);
    }

    @Test
    public void givenOneEmployeeWhenAddWithSameFioThenGetAllReturnsOldOne() {
        employeeService = new EmployeeServiceImpl();
        assertDoesNotThrow(()->{
            employeeService.add("123",1,100);
        });
        try{
            employeeService.add("123",2,200);
        } catch(RuntimeException e){}
        List<Employee> expected=List.of(new Employee(1,"123",1,100));
        List<Employee> actual=employeeService.getAll();
        assertIterableEquals(expected,actual);
    }

    @Test
    public void givenOneEmployeeWhenAddWithSameFioThenThrows(){
        employeeService=new EmployeeServiceImpl();
        assertDoesNotThrow(()->{
            employeeService.add("123",1,100);
        });
        assertThrows(EmployeePresenceException.class,()->{
            employeeService.add("123",2,200);
        });
    }

    @Test
    public void givenRemoveAddedOneEmployeeWhenAddWithSameFioThenGetAllReturnsOne(){
        employeeService=new EmployeeServiceImpl();
        assertDoesNotThrow(()->{
            Employee employee=employeeService.add("123",1,100);
        });
        assertDoesNotThrow(()->{
            int id=employeeService.getAll().get(0).getId();
            employeeService.remove(id);
        });
        assertDoesNotThrow(()->{
            employeeService.add("123",2,200);
        });
        List<Employee> expected=List.of(new Employee(1,"123",2,200));
        List<Employee> actual=employeeService.getAll();
        assertIterableEquals(expected,actual);
    }
}