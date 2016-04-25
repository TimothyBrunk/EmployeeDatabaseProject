package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		mv.setViewName("resultEmpById2.jsp");
		mv.addObject("employee", emp); 
		return mv;
	}
	@RequestMapping("GetEmployeeByName.do")
	public ModelAndView getEmpByName(String firstname, String lastname){
		ModelAndView mv = new ModelAndView();
		Employee emp =employeeDao.getEmpByName(firstname, lastname); 
		mv.setViewName("resultEmpById2.jsp");
		mv.addObject("employee", emp); 
		return mv;
	}
	@RequestMapping("GetAllEmployees.do")
	public ModelAndView getAllEmployees(String query){
		String query1 = "select * from employees;";
		ArrayList<ArrayList> response = employeeDao.getAllEmployees(query1); 
		ModelMap mp = new ModelMap(); 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("resultAll2.jsp");
		mv.addObject("response", response);
		

		return mv;
	}
	@RequestMapping("AddEmployee.do")
	public ModelAndView addEmployee(String firstname, String lastname, String departmentId, String jobId, String address,
		String city, String state, String zipcode){
		Employee emp =null;
		ModelAndView mv = new ModelAndView();
		Employee e = new Employee(); 
		e.setFirstName(firstname);
		e.setLastName(lastname);
		e.setDepartmentId(departmentId);
		e.setJobId(jobId);
		e.setAddress(address);
		e.setCity(city);
		e.setState(state);
		e.setZipcode(zipcode);
		employeeDao.addEmployee(e); 
		mv.setViewName("addEmployee2.jsp");
		mv.addObject("employee", emp); 
		return mv;
	}
	@RequestMapping("DeleteEmployee.do")
	public ModelAndView deleteEmployee(String eid){
		Employee emp = null; 
		Employee e = new Employee(); 
		ModelAndView mv = new ModelAndView();
		e.setEid(eid);
		employeeDao.deleteEmployee(e); 
		mv.setViewName("index.jsp");
		mv.addObject("employee", emp); 
		return mv;
	}
	@RequestMapping("UpdateEmployee.do")
	public ModelAndView updateEmployee( String firstname, String lastname, String departmentId, String jobId, String address,
		String city, String state, String zipcode, String eid){
		Employee emp =null;
		ModelAndView mv = new ModelAndView();
		Employee e = new Employee(); 
		e.setFirstName(firstname);
		e.setLastName(lastname);
		e.setDepartmentId(departmentId);
		e.setJobId(jobId);
		e.setAddress(address);
		e.setCity(city);
		e.setState(state);
		e.setZipcode(zipcode);
		e.setEid(eid);
		employeeDao.updateEmployee(e); 
		mv.setViewName("index.jsp");
		mv.addObject("employee", emp); 
		return mv;
	}

}