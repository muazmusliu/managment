package system.warehouse.managment.repository;

import org.springframework.data.repository.CrudRepository;
import system.warehouse.managment.pojo.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Optional<Employee> findById(Integer id);
    Employee findByName(String name);
    List<Employee> findAll();
    List<Employee> findByRole(String role);
    List<Employee> findByEmail(String email);
    List<Employee> findTop10BySalary(Integer salary);
}
