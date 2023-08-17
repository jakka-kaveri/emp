package mvcSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import mvcSpring.DAO.EmployeeDAOImpl;
import mvcSpring.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDAOImpl employeeDAO;

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        // Create a new Employee object to bind to the form
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-form";
    }

    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        // Save the employee using the DAO
        employeeDAO.save(employee);
        return "redirect:/employee/showForm";
    }
}
