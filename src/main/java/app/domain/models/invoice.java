package app.domain.models;

import java.sql.Date;

import lombok.NoArgsConstructor;
@NoArgsConstructor

public class invoice {
	private long id;
	private pet petId;
	private person ownerId;
	private order orderId;
	private String items;
	private double amount;
	private Date date;

	public invoice(long id, pet petId, person ownerId, order orderId, String items, double amount, Date date) {
		super();
		this.id = id;
		this.petId = petId;
		this.ownerId = ownerId;
		this.orderId = orderId;
		this.items = items;
		this.amount = amount;
		this.date = date;
	}

	public invoice() {
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

	public person getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(person ownerId) {
		this.ownerId = ownerId;
	}

	public order getOrderId() {
		return orderId;
	}

	public void setOrderId(order orderId) {
		this.orderId = orderId;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
