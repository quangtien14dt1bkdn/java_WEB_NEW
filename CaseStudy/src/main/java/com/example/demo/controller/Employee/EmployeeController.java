package com.example.demo.controller.Employee;

import com.example.demo.model.Contract.Employee.Degree;
import com.example.demo.model.Contract.Employee.Employee;
import com.example.demo.model.Contract.Employee.Part;
import com.example.demo.model.Contract.Employee.Position;
import com.example.demo.service.DegreeService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PartService;
import com.example.demo.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DegreeService degreeService;
    @Autowired
    private PartService partService;
    @Autowired
    private PositionService positionService;

    @ModelAttribute("degrees")
    public Page<Degree> degrees() {
        return degreeService.findAll(Pageable.unpaged());
    }
    @ModelAttribute("parts")
    public Page<Part> parts() {
        return partService.findAll(Pageable.unpaged());
    }
    @ModelAttribute("positions")
    public Page<Position> positions() {
        return positionService.findAll(Pageable.unpaged());
    }

    @GetMapping("employees")
    public ModelAndView listEmployee(@RequestParam("s") Optional<String> s, @PageableDefault(value = 5) Pageable pageable) {
        Page<Employee> employees;
        if (s.isPresent()) {
            employees = employeeService.findByName(s.get(), pageable);
        } else {
            employees = employeeService.findAll(pageable);
        }
        return new ModelAndView("employee/listEmployee", "employees", employees);
    }

    @GetMapping("createEmployee")
    public ModelAndView showFormCreate() {
        return new ModelAndView("employee/createEmployee", "employee", new Employee());
    }

    @PostMapping("createEmployee")
    public ModelAndView saveEmployee(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult, Pageable pageable) {
        ModelAndView modelAndView;
        if (bindingResult.hasFieldErrors()) {
            modelAndView = new ModelAndView("/employee/createEmployee");
            modelAndView.addObject("message", "New Employee created not successfully");
        } else {
            employeeService.save(employee);
            Page<Employee> employees = employeeService.findAll(pageable);
            modelAndView = new ModelAndView("employee/listEmployee");
            modelAndView.addObject("message", "New Employee created successfully");
            modelAndView.addObject("employees", employees);
        }
        return modelAndView;
    }

    @GetMapping("editEmployee/{id}")
    public ModelAndView showFormEdit(@PathVariable("id") Long id) {
        Employee employee = employeeService.findById(id);
        if (employee != null) {
            return new ModelAndView("employee/editEmployee", "employee", employee);
        }
        return new ModelAndView("error.404");
    }

    @PostMapping("editEmployee")
    public ModelAndView updateCustomer(@Validated @ModelAttribute("employee") Employee employee,BindingResult bindingResult, Pageable pageable) {
        ModelAndView modelAndView;
        if (bindingResult.hasFieldErrors()) {
            modelAndView = new ModelAndView("/employee/editEmployee");
            modelAndView.addObject("message", "Employee updated not successfully");
        } else {
            employeeService.save(employee);
            Page<Employee> employees = employeeService.findAll(pageable);
            modelAndView = new ModelAndView("employee/listEmployee");
            modelAndView.addObject("message", "Employee updated successfully");
            modelAndView.addObject("employees", employees);
        }

        return modelAndView;
    }

    @GetMapping("deleteEmployee/{id}")
    public ModelAndView showFormDelete(@PathVariable("id") Long id) {
        Employee employee = employeeService.findById(id);
        if (employee != null) {
            return new ModelAndView("employee/deleteEmployee", "employee", employee);
        }
        return new ModelAndView("error.404");
    }

    @PostMapping("deleteEmployee")
    public String deleteEmployee(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
        employeeService.remove(employee.getId());
        redirectAttributes.addFlashAttribute("message"," Employee deleted successfully");
        return "redirect:employees";
    }
    @GetMapping("deleteAllEmployees")
    public String deleteAllEmployees(RedirectAttributes redirectAttributes,Pageable pageable) {
        for (Employee employee : employeeService.findAll(pageable)) {
            employeeService.remove(employee.getId());
        }
        redirectAttributes.addFlashAttribute("message", "All employees deleted successfully");
        return "redirect:employees";
    }

    @GetMapping("viewEmployee/{id}")
    public ModelAndView viewEmployee(@PathVariable("id")Long id) {
        Employee employee=employeeService.findById(id);
        if (employee != null) {
            return new ModelAndView("employee/viewEmployee", "employee", employee);
        }
        return new ModelAndView("error.404");
    }
}
