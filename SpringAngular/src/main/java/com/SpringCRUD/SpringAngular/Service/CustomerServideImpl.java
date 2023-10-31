package com.SpringCRUD.SpringAngular.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringCRUD.SpringAngular.DTO.CustomerDTO;
import com.SpringCRUD.SpringAngular.DTO.CustomerSaveDTO;
import com.SpringCRUD.SpringAngular.DTO.CustomerUpdateDTO;
import com.SpringCRUD.SpringAngular.Repo.CustomerRepo;
import com.SpringCRUD.SpringAngular.entity.Customer;

@Service
public class CustomerServideImpl implements CustomerService{

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) {
		Customer customer = new Customer(
				customerSaveDTO.getName(),
				customerSaveDTO.getSex(),
				customerSaveDTO.getEmail(),
				customerSaveDTO.getPhone(),
				customerSaveDTO.getAddress()
				);
		customerRepo.save(customer);
		return customer.getName();
	}

	@Override
	public List<CustomerDTO> getAllCustomer() {
		List<Customer> allCustomer = customerRepo.findAll();
		List<CustomerDTO> customerDTOList = new ArrayList<>();
		for(Customer a:allCustomer) {
			CustomerDTO customerDTO = new CustomerDTO(
					a.getId(),
					a.getName(),
					a.getSex(),
					a.getEmail(),
					a.getPhone(),
					a.getAddress()
					);
			customerDTOList.add(customerDTO);
		}
		
		return customerDTOList;
	}

	@Override
	public String updateCustomer(CustomerUpdateDTO customerUpdateDTO) {
		if(customerRepo.existsById(customerUpdateDTO.getId())) {
			Customer customer = customerRepo.getOne(customerUpdateDTO.getId());
			
			customer.setName(customerUpdateDTO.getName());
			customer.setSex(customerUpdateDTO.getSex());
			customer.setEmail(customerUpdateDTO.getEmail());
			customer.setPhone(customerUpdateDTO.getPhone());
			customer.setAddress(customerUpdateDTO.getAddress());
			customerRepo.save(customer);
		}
		else {
			System.out.println("Customer'ID not exist!!");
		}
		
		return "Updated!";
	}

	@Override
	public String deleteCustomer(Integer id) {
		if(customerRepo.existsById(id)) {
			customerRepo.deleteById(id);
		}else {
			System.out.println("Customer not exist!");
		}
		return null;
	}

}
