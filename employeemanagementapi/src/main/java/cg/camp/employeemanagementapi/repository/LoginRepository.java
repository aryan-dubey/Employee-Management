package cg.camp.employeemanagementapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cg.camp.employeemanagementapi.domain.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {

	Login findByUsernameAndPassword(String username, String password);

}
