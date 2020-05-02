package com.example.demo.controller.Service;




import com.example.demo.model.Contract.Service.ServiceType;
import com.example.demo.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;




@Controller
public class ServiceTypeController {
    @Autowired
    private ServiceTypeService serviceTypeService;

    @GetMapping("serviceTypes")
    public ModelAndView listServiceType() {
        Page<ServiceType> serviceTypes = serviceTypeService.findAll();
        return new ModelAndView("serviceType/listServiceType", "serviceTypes",serviceTypes);
    }

    @GetMapping("createServiceType")
    public ModelAndView showFormCreate() {
        return new ModelAndView("serviceType/createServiceType", "serviceType", new ServiceType());
    }

    @PostMapping("createServiceType")
    public ModelAndView saveServiceType(@ModelAttribute("serviceType") ServiceType serviceType) {
        serviceTypeService.save(serviceType);
        Page<ServiceType> serviceTypes = serviceTypeService.findAll();
        ModelAndView modelAndView = new ModelAndView("serviceType/listServiceType");
        modelAndView.addObject("message", "New ServiceType created successfully");
        modelAndView.addObject("serviceTypes", serviceTypes);
        return modelAndView;
    }

    @GetMapping("editServiceType/{id}")
    public ModelAndView showFormEdit(@PathVariable("id") Long id) {
        ServiceType serviceType = serviceTypeService.findById(id);
        if (serviceType != null) {
            return new ModelAndView("serviceType/editServiceType", "serviceType", serviceType);
        }
        return new ModelAndView("error.404");
    }

    @PostMapping("editServiceType")
    public ModelAndView updateServiceType(@ModelAttribute("serviceType") ServiceType serviceType) {
        serviceTypeService.save(serviceType);
        Page<ServiceType> serviceTypes = serviceTypeService.findAll();
        ModelAndView modelAndView = new ModelAndView("serviceType/listServiceType");
        modelAndView.addObject("message", "ServiceType updated successfully");
        modelAndView.addObject("serviceTypes", serviceTypes);
        return modelAndView;
    }

    @GetMapping("deleteServiceType/{id}")
    public ModelAndView showFormDelete(@PathVariable("id") Long id) {
        ServiceType serviceType = serviceTypeService.findById(id);
        if (serviceType != null) {
            return new ModelAndView("serviceType/deleteServiceType", "serviceType", serviceType);
        }
        return new ModelAndView("error.404");
    }
    @PostMapping("deleteServiceType")
    public String deleteServiceType(@ModelAttribute("serviceType")ServiceType serviceType, RedirectAttributes redirectAttributes) {
        serviceTypeService.remove(serviceType.getId());
        redirectAttributes.addFlashAttribute("message","ServiceType deleted successfully");
        return "redirect:serviceTypes";
    }
    @GetMapping("deleteAllServiceTypes")
    public String deleteAllServiceTypes(RedirectAttributes redirectAttributes) {
        for (ServiceType serviceType : serviceTypeService.findAll()) {
            serviceTypeService.remove(serviceType.getId());
        }
        redirectAttributes.addFlashAttribute("message", "All serviceTypes deleted successfully");
        return "redirect:serviceTypes";
    }
}
