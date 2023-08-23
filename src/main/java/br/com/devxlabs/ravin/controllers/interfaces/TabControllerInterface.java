package br.com.devxlabs.ravin.controllers.interfaces;

import br.com.devxlabs.ravin.entities.Tab;
import br.com.devxlabs.ravin.entities.OrderDetail;
import br.com.devxlabs.ravin.enums.TabStatus;

public interface TabControllerInterface extends ControllerInterface<Tab> {
	
	public void addOrder(OrderDetail order) throws Exception;
	public void removeOrder(OrderDetail pedido) throws Exception;
	public void closeTab() throws Exception;
	public void listTabsByStatus(TabStatus status);
	public double calculateTotalTabValue();

}
