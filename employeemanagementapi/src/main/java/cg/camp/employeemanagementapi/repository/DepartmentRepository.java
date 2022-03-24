package cg.camp.employeemanagementapi.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cg.camp.employeemanagementapi.domain.Department;
@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long>{
		

	Department findByDeptId(Long deptId);

}
