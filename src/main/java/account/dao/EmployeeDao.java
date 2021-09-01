package account.dao;

import java.util.List;

import account.dto.Employee;

public interface EmployeeDao {
	public Employee findEmloyeeById(int empId);
	public List <Employee>getEmployees();
	public List<Employee>findEmployeesByDept();
	public void deleteEmployee(Employee emp);
	
}