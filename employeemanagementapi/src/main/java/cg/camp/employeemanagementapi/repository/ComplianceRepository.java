package cg.camp.employeemanagementapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cg.camp.employeemanagementapi.domain.Compliance;

@Repository
public interface ComplianceRepository extends CrudRepository<Compliance, Long> {
   
	
	 Compliance findByComplianceId(Long complianceId);
}
