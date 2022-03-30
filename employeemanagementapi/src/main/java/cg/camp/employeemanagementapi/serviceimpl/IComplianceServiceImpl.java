package cg.camp.employeemanagementapi.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cg.camp.employeemanagementapi.domain.Compliance;
import cg.camp.employeemanagementapi.domain.Status;
import cg.camp.employeemanagementapi.repository.ComplianceRepository;
import cg.camp.employeemanagementapi.repository.StatusRepository;
import cg.camp.employeemanagementapi.service.IComplianceService;

@Service
public class IComplianceServiceImpl implements IComplianceService {

	@Autowired
	private ComplianceRepository complianceRepository;
	
	@Autowired
	private StatusRepository statusRepository;
	
	@Override
	public List<Compliance> getAllRL() {
		List<Compliance> compliances = new ArrayList<>();
	    complianceRepository.findAll().forEach(compliances :: add);
	    return compliances;
	}

	@Override
	public Compliance addRL(Compliance co) {
		return complianceRepository.save(co);
		
	}

	@Override
	public 	Compliance findComplianceByComplianceId(Long complianceId) {
		return complianceRepository.findByComplianceId(complianceId);
	}

	@Override
	public Status createStatusReport(Status statusreport) {
		return statusRepository.save(statusreport);
		}

	@Override
	public Iterable<Status> getAllStatusReport() {
		return statusRepository.findAll();
	}
	
	


}
