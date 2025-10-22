package es.uniovi.eii.ds.places.model;

import es.uniovi.eii.ds.google.maps.Coordinates;

public class Photo {
	
	private String description;
	
	// Information about the user who took the photo
	private String user;
	
	// Coordinates where the photo was taken
	private Coordinates coordinates;

	public Photo(String description, String user, Coordinates coordinates) {
		this.description = description;
		this.user = user;
		this.coordinates = coordinates;
	}

	public String description() {
		return description;
	}

	public String user() {
		return user;
	}

	public Coordinates coordinates() {
		return coordinates;
	}

	public void show() {
		System.out.printf("Opening photo %s...%n", description);
	}
}
