package br.com.devxlabs.ravin.controllers.interfaces;

import br.com.devxlabs.ravin.entities.Order;

public interface OrderControllerInterface extends ControllerInterface<Order> {
	
	public void addProductQuantity(int quantity);
	public void checkOrderStatus(int orderId);

}
