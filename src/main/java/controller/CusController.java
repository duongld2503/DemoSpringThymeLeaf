package controller;


import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CusService;

import java.util.List;

@Controller
public class CusController {

    @Autowired
    CusService cusService;

    @RequestMapping("/list")
    public ModelAndView lisCustomer(){

        ModelAndView modelAndView = new ModelAndView("/listCustomer");
        List<Customer> customerList = cusService.listCustomer();

        modelAndView.addObject("listCustomer", customerList);
        return modelAndView;
    }
}
