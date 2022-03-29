package cg.camp.employeemanagementapi.service;

import cg.camp.employeemanagementapi.domain.Employee;

public interface IEmployeeService {
	
	public Employee addEmployee(Employee emp);
	public Iterable<Employee> getallEmployees();
	public Employee getEmployeeByuserId(long uid);
	public long employeeCount();
	public void deleteEmployeeById(long uid);
	public void deleteAllEmp();
	
}
