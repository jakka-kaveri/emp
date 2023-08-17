package mvcSpring.DAO;

import java.util.List;

import mvcSpring.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmp();
	public Employee getById(int id);
	public void save(Employee emp);

}
