package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class UserData {


	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String password;
	private String emailId;
	private String billingAddress;
	private String shippingAddress;
	private boolean loginStatus;
	
	public UserData(String userName, String emailId, String billingAddress, String shippingAddress,
			boolean loginStatus) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
		this.loginStatus = loginStatus;
	}
	
}
