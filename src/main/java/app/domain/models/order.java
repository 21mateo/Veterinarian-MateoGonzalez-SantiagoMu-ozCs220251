package app.domain.models;

import java.sql.Date;

import lombok.NoArgsConstructor;
@NoArgsConstructor

public class order {
	private long id;
	private pet petId;
	private user veterinarian;
	private person ownerId;
	private String dose;
	private String medicine;
	private Date date;
	
	public order(long id, pet petId, user veterinarian, person ownerId, String dose, String medicine, Date date) {
		super();
		this.id = id;
		this.petId = petId;
		this.veterinarian = veterinarian;
		this.ownerId = ownerId;
		this.dose = dose;
		this.medicine = medicine;
		this.date = date;
	}
	
	public order() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public pet getPetId() {
		return petId;
	}

	public void setPetId(pet petId) {
		this.petId = petId;
	}

	public user getVeterinarian() {
		return veterinarian;
	}

	public void setVeterinarian(user veterinarian) {
		this.veterinarian = veterinarian;
	}

	public person getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(person ownerId) {
		this.ownerId = ownerId;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
