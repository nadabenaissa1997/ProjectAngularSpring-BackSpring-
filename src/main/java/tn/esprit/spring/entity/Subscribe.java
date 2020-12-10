package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="T_subscribe")
public class Subscribe implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="sub_Id")
	private long id;
	
	@Column(name="sub_firstName")
	private String firstName;	
	
	@Column(name="sub_lastName")
	private String lastName;
	
	@Column(name="sub_email")
	private String email;
	
	@Column(name="sub_phone")
	private String phone;
	
	@JsonIgnore
	@ManyToOne()
	private Domain domainSubscribe;

	public Subscribe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Subscribe(long id, String firstName, String lastName, String email, String phone, Domain domainSubscribe) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.domainSubscribe = domainSubscribe;
	}



	public Domain getDomainSubscribe() {
		return domainSubscribe;
	}



	public void setDomainSubscribe(Domain domainSubscribe) {
		this.domainSubscribe = domainSubscribe;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
}
