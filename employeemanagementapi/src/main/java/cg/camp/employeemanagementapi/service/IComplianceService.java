package cg.camp.employeemanagementapi.service;

import java.util.List;

import cg.camp.employeemanagementapi.domain.Compliance;

public interface IComplianceService {
	public List<Compliance> getAllRL();
	  
	public Compliance addRL(Compliance co);

	Compliance findComplianceByComplianceId(Long complianceId);
}
