package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="T_proposition")
public class Proposition implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="prop_Id")
	private long id;
	
	@Column(name="prop_prop")
	private String prop;
	
	@ManyToOne()
	private Test test;

	public Proposition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proposition(long id, String prop, Test test) {
		super();
		this.id = id;
		this.prop = prop;
		this.test = test;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProp() {
		return prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
	
	
}
