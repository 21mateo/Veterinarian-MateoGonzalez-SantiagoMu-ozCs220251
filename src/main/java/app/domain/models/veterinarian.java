package app.domain.models;

import lombok.NoArgsConstructor;
@NoArgsConstructor

public class veterinarian {
	private long date;
	private pet petId;
	private user veterinarian;
	private String reason;
	private order orderId;
	private String diagnosis;
	private String medicine;
	private String dose;
	private String procedureName;
	private String procedureDetail;
	private String status;
	private String vaccunation;
	private String alergies;
	
	public veterinarian(long date, pet petId, user veterinarian, String reason, order orderId, String diagnosis,
			String medicine, String dose, String procedureName, String procedureDetail, String status,
			String vaccunation, String alergies) {
		super();
		this.date = date;
		this.petId = petId;
		this.veterinarian = veterinarian;
		this.reason = reason;
		this.orderId = orderId;
		this.diagnosis = diagnosis;
		this.medicine = medicine;
		this.dose = dose;
		this.procedureName = procedureName;
		this.procedureDetail = procedureDetail;
		this.status = status;
		this.vaccunation = vaccunation;
		this.alergies = alergies;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public order getOrderId() {
		return orderId;
	}

	public void setOrderId(order orderId) {
		this.orderId = orderId;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getProcedureDetail() {
		return procedureDetail;
	}

	public void setProcedureDetail(String procedureDetail) {
		this.procedureDetail = procedureDetail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVaccunation() {
		return vaccunation;
	}

	public void setVaccunation(String vaccunation) {
		this.vaccunation = vaccunation;
	}

	public String getAlergies() {
		return alergies;
	}

	public void setAlergies(String alergies) {
		this.alergies = alergies;
	}
	
	
}
