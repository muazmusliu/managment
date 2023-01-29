package system.warehouse.managment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.warehouse.managment.pojo.Customer;
import system.warehouse.managment.pojo.Employee;
import system.warehouse.managment.repository.EmployeeRepository;

import java.util.List;

@Service
public class DefaultEmployeeService implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findOneById(Integer id) {
        return employeeRepository.findEmployeeById(id);
    }

    @Override
    public Employee create(String name, String phone, String role) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setPhone(phone);
        employee.setRole(role);

        return employeeRepository.save(employee);
    }

    @Override
    public Employee edit(Integer id, String name, String phone, String role) {
        Employee employee = employeeRepository.findEmployeeById(id);
        if (employee != null) {
            employee.setName(name);
            employee.setPhone(phone);
            employee.setEmail(role);
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        employeeRepository.deleteById(id);
    }
}
