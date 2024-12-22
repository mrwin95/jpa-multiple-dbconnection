package win.ddd.jpa.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import win.ddd.jpa.entity.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
