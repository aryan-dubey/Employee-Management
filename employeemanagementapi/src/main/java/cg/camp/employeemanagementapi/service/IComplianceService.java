package cg.camp.employeemanagementapi.service;

import java.util.List;

import cg.camp.employeemanagementapi.domain.Compliance;
import cg.camp.employeemanagementapi.domain.Status;

public interface IComplianceService {
	public List<Compliance> getAllRL();
	  
	public Compliance addRL(Compliance co);

	Compliance findComplianceByComplianceId(Long complianceId);
	
	public Status createStatusReport(Status statusreport);
	
	public Iterable<Status> getAllStatusReport();
}
