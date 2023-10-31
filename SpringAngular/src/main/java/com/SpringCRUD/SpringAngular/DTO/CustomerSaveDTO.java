package com.SpringCRUD.SpringAngular.DTO;

public class CustomerSaveDTO {
	private String name;

	private String sex;

	private String email;

	private String phone;

	private String address;

	public CustomerSaveDTO() {

	}

	public CustomerSaveDTO(String name, String sex, String email, String phone, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
		this.address = address;
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
		return "CustomerSaveDTO [name=" + name + ", sex=" + sex + ", email=" + email + ", phone=" + phone + ", address="
				+ address + "]";
	}
	
	
}
