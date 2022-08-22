package com.cg.association;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="address")
public class Address implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="ID")
	private int addressId;
	@Column(name="Street")
	private String street;
	@Column(name="City")
	private String city;
	@Column(name="State")
	private String state;
	@Column(name="Zipcode")
	private int zipcode;
	public Address() {
		super();
	}
	public Address(int addressId, String street, String city, String state, int zipcode) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + ", toString()=" + super.toString() + "]";
	}
	
	

}
