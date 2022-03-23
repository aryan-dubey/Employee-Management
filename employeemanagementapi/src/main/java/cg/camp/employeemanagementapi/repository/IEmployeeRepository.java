package cg.camp.employeemanagementapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cg.camp.employeemanagementapi.domain.Employee;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee,Long>{
	

}
