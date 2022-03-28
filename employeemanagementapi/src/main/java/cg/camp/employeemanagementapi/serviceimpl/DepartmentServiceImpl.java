package cg.camp.employeemanagementapi.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cg.camp.employeemanagementapi.domain.Department;
import cg.camp.employeemanagementapi.exception.DepartmentIdException;
import cg.camp.employeemanagementapi.exception.DepartmentNameException;
import cg.camp.employeemanagementapi.repository.DepartmentRepository;
import cg.camp.employeemanagementapi.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository deptRepo;

	@Override
	public Department addDepartment(Department dept) {
		try {
			return deptRepo.save(dept);
		}catch(Exception ex)
		{
			throw new DepartmentNameException("Department Name "+ dept.getDeptName()+" Already Exists");
		}
		
	}

	@Override
	public Iterable<Department> listOfDepartments() {
		deptRepo.findAll();
		// TODO Auto-generated method stub
		return deptRepo.findAll();
	}



	@Override
	public void delete(Long deptId) {
		try {
		deptRepo.deleteById(deptId);
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new DepartmentIdException("Depaartment Id "+deptId+" Doesnt Exist");
		}
	}

	@Override
	public Department findDepartmentByDeptId(Long deptId) {
		return deptRepo.findByDeptId(deptId);
	}

	@Override
	public Iterable<Department> findallDepartments() {
		return deptRepo.findAll();
	}

}
