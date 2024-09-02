package com.e_Shopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
@Entity
public class CustomerDetails 
{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String first_name,last_name,email,password,address,gender;
		private long mobile;
		
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		public CustomerDetails( String first_name, String last_name, String email, String password,
				String address, String gender, long mobile) {
			this.first_name = first_name;
			this.last_name = last_name;
			this.email = email;
			this.password = password;
			this.address = address;
			this.gender = gender;
			this.mobile = mobile;
		}
		public CustomerDetails() {}
		
		

}
