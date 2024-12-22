package win.ddd.jpa.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import win.ddd.jpa.entity.employee.Employee;
import win.ddd.jpa.response.ApiResponse;
import win.ddd.jpa.response.ResponseUtil;
import win.ddd.jpa.service.employee.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Employee>> updateEmployee(
            @PathVariable Integer id,
            @RequestBody Employee employee,
            HttpServletRequest request) {
        Employee updateEmployee = employeeService.updateEmployee(id, employee);

        return ResponseEntity.ok(ResponseUtil.success(updateEmployee, "Employee updated successfully", request.getRequestURI()));
    }
}
