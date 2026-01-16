package pro.sky.DepartmentBook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.DepartmentBook.model.Employee;
import pro.sky.DepartmentBook.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/add")
    public Employee add(@RequestParam("fio") String fio,
                        @RequestParam("department") int department,
                        @RequestParam("salary") int salary) {
        return employeeService.add(fio, department, salary);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam("id") int id) {
        return employeeService.find(id);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam("id") int id) {
        return employeeService.remove(id);
    }

    @GetMapping("/averageSalary")
    public double getAvgSalary() {
        return employeeService.getAvgSalary();
    }
}
