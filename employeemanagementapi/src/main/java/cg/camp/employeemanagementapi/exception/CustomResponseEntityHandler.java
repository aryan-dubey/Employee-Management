package cg.camp.employeemanagementapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestController
@ControllerAdvice
public class CustomResponseEntityHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler
	public final ResponseEntity<Object> handleEmployeeEmailException(EmployeeEmailException ex,WebRequest request)
	{
		EmployeeEmailExceptionResponse employeeEmailExceptionResponse=new EmployeeEmailExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(employeeEmailExceptionResponse,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler
	public final ResponseEntity<Object> handleEmployeeIdException(EmployeeIdException ex, WebRequest request)
	{
		EmployeeIdExceptionResponse employeeIdExceptionResponse= new EmployeeIdExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(employeeIdExceptionResponse,HttpStatus.BAD_REQUEST);
	}

}
