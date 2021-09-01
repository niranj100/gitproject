package account.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import account.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> empList=new ArrayList<Employee>();
	public List<Employee> getEmployees()
	{
		System.out.println("Dao - in getEmployees");
		Employee employee=new Employee();
		employee.setEmpno(1);
		employee.setEmpName("harry");
		employee.setHireDate(LocalDate.of(2017, 07, 12));
		employee.setSalary(25000);
		employee.setJob("Developer");
		empList.add(employee);
		employee=new Employee();
		employee.setEmpno(2);
		employee.setEmpName("ginny");
		employee.setHireDate(LocalDate.of(2017, 07, 16));
		employee.setSalary(27000);
		employee.setJob("Developer");
		empList.add(employee);
		return empList;
		
		
	}
	@Override
	public Employee findEmloyeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> findEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}