package app.ports;

import app.domain.models.order;

public interface orderPort {
	public void createOrder(order Order) throws Exception;

}
