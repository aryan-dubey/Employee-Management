package cg.camp.employeemanagementapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cg.camp.employeemanagementapi.domain.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status, Long> {
	
	

}
