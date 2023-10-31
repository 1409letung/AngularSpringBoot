package com.SpringCRUD.SpringAngular.DTO;

public class CustomerUpdateDTO {
	private int id;

	private String name;

	private String sex;

	private String email;

	private String phone;

	private String address;

	public CustomerUpdateDTO() {
		
	}

	public CustomerUpdateDTO(int id, String name, String sex, String email, String phone, String address) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerUpdateDTO [id=" + id + ", name=" + name + ", sex=" + sex + ", email=" + email + ", phone="
				+ phone + ", address=" + address + "]";
	}
	
	
}
