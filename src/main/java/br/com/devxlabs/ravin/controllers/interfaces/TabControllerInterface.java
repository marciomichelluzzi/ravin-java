package br.com.devxlabs.ravin.controllers.interfaces;

import br.com.devxlabs.ravin.enums.TabStatus;
import br.com.devxlabs.ravin.models.entities.OrderDetail;
import br.com.devxlabs.ravin.models.entities.Tab;

public interface TabControllerInterface extends ControllerInterface<Tab> {
	
	public void addOrder(OrderDetail order) throws Exception;
	public void removeOrder(OrderDetail pedido) throws Exception;
	public void closeTab() throws Exception;
	public void listTabsByStatus(TabStatus status);
	public double calculateTotalTabValue();

}
