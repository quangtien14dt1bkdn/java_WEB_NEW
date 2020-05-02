package com.example.demo.controller.Service;



import com.example.demo.model.Contract.Employee.Degree;
import com.example.demo.model.Contract.Employee.Part;
import com.example.demo.model.Contract.Service.RentType;
import com.example.demo.model.Contract.Service.ServiceType;
import com.example.demo.service.RentTypeService;
import com.example.demo.service.ServiceService;
import com.example.demo.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.Optional;

@Controller
public class ServiceController {
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private ServiceTypeService serviceTypeService;
    @Autowired
    private RentTypeService rentTypeService;

    @ModelAttribute("degrees")
    public Page<Degree> degrees() {
        return degreeService.findAll(Pageable.unpaged());
    }
    @ModelAttribute("parts")
    public Page<Part> parts() {
        return partService.findAll(Pageable.unpaged());
    }



}
