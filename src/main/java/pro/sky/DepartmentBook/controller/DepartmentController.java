package pro.sky.DepartmentBook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.DepartmentBook.model.Employee;
import pro.sky.DepartmentBook.service.DepartmentService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/employees")
    public Map<Integer, List<Employee>> getAll() {
        return departmentService.getAll();
    }

    @GetMapping("/{id}/employees")
    public List<Employee> getByDepartment(@RequestParam("id") int id) {
        return departmentService.getByDepartment(id);
    }

    @GetMapping("/{id}/salary/sum")
    public int getSumSalaryByDepartment(@RequestParam("id") int id) {
        return departmentService.getSumSalaryByDepartment(id);
    }

    @GetMapping("/{id}/salary/max")
    public int getMaxSalaryByDepartment(@RequestParam("id") int id) {
        return departmentService.getMaxSalaryByDepartment(id);
    }

    @GetMapping("/{id}/salary/min")
    public int getMinSalaryByDepartment(@RequestParam("id") int id) {
        return departmentService.getMinSalaryByDepartment(id);
    }
}
