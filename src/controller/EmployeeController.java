package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping("GetAllEmployees.do")
	public ModelAndView getAllEmployees(@RequestParam("taname") String query){
		ArrayList<ArrayList> response = employeeDao.getAllEmployees(query); 
		ModelMap mp = new ModelMap(); 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("resultAll.jsp");
		mv.addObject("response", response);
		System.out.println("In Controller");

		return mv;
	}
	@RequestMapping("AddEmployee.do")
	public ModelAndView addEmployee(String firstname, String lastname, String departmentId, String jobId, String address,
		String city, String state, String zipcode){
		Employee emp =null;
		int uc=employeeDao.addEmployee(firstname, lastname, departmentId, jobId, address,city, state, zipcode); 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("resultEmpById.jsp");
		mv.addObject("employee", emp); 
		return mv;
	}

}