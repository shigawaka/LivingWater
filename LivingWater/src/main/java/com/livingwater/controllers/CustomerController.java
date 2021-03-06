package com.livingwater.controllers;

import com.livingwater.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;

/**
 * Created by CourtneyLove on 4/14/2017.
 */

@Controller
public class CustomerController {

    //----------------------Add
    @Autowired
    private CustomerService customerService;


    @RequestMapping(value="/addCustomer", method = RequestMethod.POST)
    public ModelAndView addCustomer(HttpServletRequest request, HttpServletResponse response, ModelMap map){
        return customerService.addCustomer(request,response);
    }
}
