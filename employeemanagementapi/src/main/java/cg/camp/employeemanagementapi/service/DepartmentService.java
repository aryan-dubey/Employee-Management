package cg.camp.employeemanagementapi.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import cg.camp.employeemanagementapi.domain.Department;

public interface DepartmentService {
	Department addDepartment(Department dept);
	Department findDepartmentByDeptId( Long deptId);
	Iterable<Department> listOfDepartments();
	void delete(Long deptId);
	Iterable<Department> findallDepartments();

}
