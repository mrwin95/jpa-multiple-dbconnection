package win.ddd.jpa.service.employee;

import org.springframework.stereotype.Service;
import win.ddd.jpa.entity.employee.Employee;
import win.ddd.jpa.exception.ResourceNotFoundException;
import win.ddd.jpa.repository.employee.EmployeeRepository;

import java.util.Optional;

@Service
public class EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public  void create(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee updateEmployee(Integer id, Employee updatedEmployee) {
        Optional<Employee> existingEmployeeOptional = employeeRepository.findById(id);
        if(existingEmployeeOptional.isPresent()) {
            Employee existingEmployee = existingEmployeeOptional.get();
            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setDepartment(updatedEmployee.getDepartment());
            return employeeRepository.save(existingEmployee);
        }else {
            throw new ResourceNotFoundException("Employee not found" + id);
        }
    }
}
