package com.SpringCRUD.SpringAngular.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCRUD.SpringAngular.DTO.CustomerDTO;
import com.SpringCRUD.SpringAngular.DTO.CustomerSaveDTO;
import com.SpringCRUD.SpringAngular.DTO.CustomerUpdateDTO;
import com.SpringCRUD.SpringAngular.Service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService ;
	
	@GetMapping("/all")
	public List<CustomerDTO> getAllCustomer(){
		List<CustomerDTO> allCustomer = customerService.getAllCustomer();
		return allCustomer;
	}
	
	@PostMapping("/save")
	public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO) {
		String customerName = customerService.addCustomer(customerSaveDTO);
		return customerName;
	}
	
	@PutMapping("/update")
	public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO) {
		String result = customerService.updateCustomer(customerUpdateDTO);
		return result;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable Integer id) {
		customerService.deleteCustomer(id);
		return "Deleted!";
	}
}
