package app.adapters.orders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.orders.repository.OrderRepository;
import app.domain.models.Order;
import app.ports.OrderPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Service
public class OrderAdapter implements OrderPort{
	@Autowired
	private OrderRepository orderRepository;
	private List<Order> orderList = new ArrayList<>();

	@Override
	public void saveOrder(Order order) throws Exception {
		orderList.add(order);
		
	}

	@Override
	public Order findById(long orderId)  {
		for (Order order : orderList) { 
	        if (order.getId() == orderId) {
	            return order;
	        }
	    }
	    return null;
	}

	@Override
	public void updateOrder(Order order) throws Exception {
		 boolean updated = false;
	        for (int i = 0; i < orderList.size(); i++) {
	            if (orderList.get(i).getId() == order.getId()) {
	                orderList.set(i, order); // Para actualizar
	                updated = true;
	                break;
	            }
	        }
	        if (!updated) {
	            throw new Exception("No existe una orden con ese ID para actualizar");
	        }
		
	}

	@Override
	public List<Order> getAllOrders() {
		return orderList;
	}

}
