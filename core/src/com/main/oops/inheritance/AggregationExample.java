package com.main.oops.inheritance;

class Address {
	String city, state, country;

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

}

class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

}

public class AggregationExample {

	public static void main(String[] args) {
		Address address1 = new Address("gzb", "UP", "india");
		Address address2 = new Address("gno", "UP", "india");

		Emp e = new Emp(111, "varun", address1);
		Emp e2 = new Emp(112, "arun", address2);

		e.display();
		e2.display();

	}

}
