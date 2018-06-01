package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping( value="/employee", method= RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Employee employee() {
		
		Employee emp = new Employee();
		  emp.setName("emp1");
		  emp.setDesignation("manager");
		  emp.setEmpId("2");
		  emp.setSalary(3000);

		  return emp;
	}
	
	@RequestMapping("/")
	public String ntg() {
		return "HELLOW";

	}

}
