package com.myApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myApp.DAO.CustomerDao;
import com.myApp.entity.Customer;
import com.myApp.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form"; 
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		System.out.println(theCustomer);
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,Model theModel) {
		Customer customer = customerService.getCustomer(theId);
		theModel.addAttribute("customer",customer);
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId,Model theModel) {
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/seaech")
	public String search(@RequestParam("theSearch") String search,Model theModel) {
		List<Customer> searchCustomer = customerService.searchCustomer(search);
		theModel.addAttribute("customers", searchCustomer);
		return "list-customers";
	}
}
