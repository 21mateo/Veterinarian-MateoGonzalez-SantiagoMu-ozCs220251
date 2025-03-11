package app.domain.models;

import lombok.NoArgsConstructor;
@NoArgsConstructor

public class pet {
	private long petId;
	private String name;
	private person ownerIdentification;
	private int age;
	private String species;
	private String race;
	private String features;
	private double weight;
	
	public pet(long petId, String name, person ownerIdentification, int age, String species, String race,
			String features, double weight) {
		super();
		this.petId = petId;
		this.name = name;
		this.ownerIdentification = ownerIdentification;
		this.age = age;
		this.species = species;
		this.race = race;
		this.features = features;
		this.weight = weight;
	}

	public long getPetId() {
		return petId;
	}

	public void setPetId(long petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public person getOwnerIdentification() {
		return ownerIdentification;
	}

	public void setOwnerIdentification(person ownerIdentification) {
		this.ownerIdentification = ownerIdentification;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
