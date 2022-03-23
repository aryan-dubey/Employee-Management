package cg.camp.employeemanagementapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestController
@ControllerAdvice
public class CustomResponseEntityHandler extends ResponseEntityExceptionHandler {
	
	public final ResponseEntity<Object> handleEmployeeEmailException(EmployeeEmailException ex,WebRequest request)
	{
		EmployeeEmailExceptionResponse employeeEmailExceptionResponse=new EmployeeEmailExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(employeeEmailExceptionResponse,HttpStatus.BAD_REQUEST);
	}

}
