package es.uniovi.eii.ds.places.model;

public class Restaurant {
	
	private String name;
	private String address;
	private String phone;

	public Restaurant(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String name() {
		return name;
	}

	public String address() {
		return address;
	}

	public String phone() {
		return phone;
	}

	// Call the restaurant
	public void call() {
		System.out.printf("Calling %s...%n", phone);
	}
}
