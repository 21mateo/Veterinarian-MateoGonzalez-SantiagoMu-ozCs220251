package app.ports;

import app.domain.models.Order;

public interface OrderPort {
	public void createOrder(Order order) throws Exception;

}
