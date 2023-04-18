package com.valueshipr.contactapp.app.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;  
    
    private String pic;   
	
	private String companyName;
  
    private String number;

    @ElementCollection
    private List<String> alternativeNumbers;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPic() {
		 return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<String> getAlternativeNumbers() {
		return alternativeNumbers;
	}

	public void setAlternativeNumbers(List<String> alternativeNumbers) {
		this.alternativeNumbers = alternativeNumbers;
	}
    


}

