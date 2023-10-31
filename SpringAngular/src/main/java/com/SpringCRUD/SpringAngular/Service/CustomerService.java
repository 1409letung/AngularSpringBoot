package com.SpringCRUD.SpringAngular.Service;


import java.util.List;

import com.SpringCRUD.SpringAngular.DTO.CustomerDTO;
import com.SpringCRUD.SpringAngular.DTO.CustomerSaveDTO;
import com.SpringCRUD.SpringAngular.DTO.CustomerUpdateDTO;


public interface CustomerService {
	
	String addCustomer(CustomerSaveDTO customerSaveDTO);
	
	List<CustomerDTO> getAllCustomer();
	
	String updateCustomer(CustomerUpdateDTO customerUpdateDTO);
	
	String deleteCustomer(Integer id);
}
