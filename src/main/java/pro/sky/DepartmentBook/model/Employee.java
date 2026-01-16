package pro.sky.DepartmentBook.model;

import java.util.Objects;

public class Employee {
    private int id;
    private String fio;
    private int department;
    private int salary;

    public Employee() {
        this(-1,"",-1,0);
    }

    public Employee(int id, String fio, int department, int salary) {
        this.id = id;
        this.fio = fio;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id=").append(id);
        sb.append(", fio='").append(fio).append('\'');
        sb.append(", department=").append(department);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return department == employee.department && salary == employee.salary && Objects.equals(fio, employee.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, department, salary);
    }
}
