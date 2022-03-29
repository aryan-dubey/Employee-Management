package cg.camp.employeemanagementapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cg.camp.employeemanagementapi.domain.Employee;
import cg.camp.employeemanagementapi.exception.EmployeeEmailException;
import cg.camp.employeemanagementapi.exception.EmployeeIdException;
import cg.camp.employeemanagementapi.repository.IEmployeeRepository;
import cg.camp.employeemanagementapi.service.IEmployeeService;

@Service
public class IEmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeRepository iemployeeRepository;
	
	public Employee addEmployee(Employee emp) {
		try {
				return iemployeeRepository.save(emp);
			}
		catch(Exception ex)	{
			throw new EmployeeEmailException("Employee Email id : "+emp.getEmail()+" already exists");
		}
	}


	@Override
	public Iterable<Employee> getallEmployees() 
	{
		
		return iemployeeRepository.findAll();
	}

	public Employee getEmployeeByuserId(long uid) 
	{
		Employee employee=iemployeeRepository.findById(uid);
		if(employee==null) 
		{
			throw new EmployeeIdException("Employee id :"+uid+ " does not exists");
		}
		return employee;
	}

	@Override
	public long employeeCount() 
	{
		long count=iemployeeRepository.count();
		return count;
	}

	@Override
	public void deleteEmployeeById(long uid) 
	{
		Employee employee=iemployeeRepository.findById(uid);
		if(employee==null) 
		{
			throw new EmployeeIdException("Employee id :"+uid+ " does not exists");
		}
		iemployeeRepository.deleteById(uid);
		
	}

	@Override
	public void deleteAllEmp() 
	{
		if(iemployeeRepository.count()==0)
		{
			throw new EmployeeIdException("No employees are present");
		}
		iemployeeRepository.deleteAll();
		
	}
	

}
