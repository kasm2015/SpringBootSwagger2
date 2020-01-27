package com.arcagile.springbootswagger2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
//Below annotation is used for accessing this ENDPOINT with /employee url
@RequestMapping("/employee")
public class EmployeeController {

    // We are not using any database in this example,
    // so we will declare an concurrent hash map to store the values in-memory to add and retrieve the employee data
    ConcurrentMap<String,Employee> employees = new ConcurrentHashMap<>();

    //RETURNS A LIST OF EMPLOYEES
    @GetMapping("/")
    public List<Employee> getEmployees() {
        return new ArrayList<>(employees.values());
    }

    //ADD A NEW EMPLOYEE DETAILS
    @PostMapping("/")
    public Employee addEmployee(@RequestBody Employee employee) {
        employees.put(employee.getId(),employee);
        return employee;
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return employees.get(id);
    }
}
