package cg.camp.employeemanagementapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cg.camp.employeemanagementapi.domain.Employee;
import cg.camp.employeemanagementapi.exception.EmployeeEmailException;
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

	/*@Override
	public void deleteEmployee(long id) {
		iemployeeRepository.deleteById(id);
		
	}*/
	

}
