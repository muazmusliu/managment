package system.warehouse.managment.service;

import system.warehouse.managment.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findOneById(Integer id);
    Employee create(String name, String phone,String role);
    Employee edit(Integer id, String name, String phone,String role);
    void delete(Integer id);
}
