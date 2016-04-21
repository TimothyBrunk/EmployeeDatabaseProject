package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import data.Employee;
import data.EmployeeDAO;

@Controller
public class EmployeeController {
    @Autowired    // Un-comment this section if using Autowiring.
    private EmployeeDAO employeeDao ;
    
	@RequestMapping("GetEmployeeById.do")
	public ModelAndView getEmpByID(int id){
		Employee emp =employeeDao.getEmpByID(id); 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("resultEmpById.jsp");
		mv.addObject("employee", emp); 
	
		return mv;
		
	}

}