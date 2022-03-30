package cg.camp.employeemanagementapi.repository;

import org.springframework.data.repository.CrudRepository;

import cg.camp.employeemanagementapi.domain.Status;

public interface StatusRepository extends CrudRepository<Status, Long> {
	

}
