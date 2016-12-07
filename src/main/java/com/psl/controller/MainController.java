package com.psl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.psl.bean.Customer;
import com.psl.service.DaoService;
@Controller
public class MainController {

	@Autowired
	DaoService  service;
	
	
	@RequestMapping(value = {"/", "/addCust" }, method = RequestMethod.GET)
	public String addCust(Model model){
		System.out.println("Inside form");
		model.addAttribute("customer", new Customer());
		return "form";
	}
	
	@RequestMapping(value = {"/", "/home" }, method = RequestMethod.GET)
	public String home(Model model){
		System.out.println("Inside home");
		model.addAttribute("customer", new Customer());
		return "index";
	}
	
	@RequestMapping(value = { "/","/home" }, method = RequestMethod.POST)
	public String registerCustomer(Model model,Customer customer){
		System.out.println(customer.toString());
		service.addCustomer(customer);	
		return "redirect:home";
	}
	
	@RequestMapping(value = { "/","/register/{username}/{password}" }, method = RequestMethod.GET)
	public String getOrder(@PathVariable String username,@PathVariable String password,Model model){
			System.out.println(username+"call");
			//model.addAttribute("orderId", username.toString());
			service.addUser(username, password);
		return "order";
	}
	

	
	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String getUserLogin(Model model){
			//System.out.println(username+"call");
			
			
		return "new";
	}

	

}
