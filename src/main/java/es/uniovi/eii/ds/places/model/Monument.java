package es.uniovi.eii.ds.places.model;

public class Monument {
	
	private String name;
	private String author;
	private String address;

	public Monument(String name, String author, String address) {
		this.name = name;
		this.author = author;
		this.address = address;
	}

	public String name() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String address() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String author() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}
