package br.com.devxlabs.ravin.controllers.interfaces;

import br.com.devxlabs.ravin.entities.Commanda;
import br.com.devxlabs.ravin.entities.Order;
import br.com.devxlabs.ravin.enums.CommandaStatus;

public interface CommandaControllerInterface extends ControllerInterface<Commanda> {
	
	public void addOrder(Order order) throws Exception;
	public void removeOrder(Order pedido) throws Exception;
	public void closeCommanda() throws Exception;
	public void listCommandasByStatus(CommandaStatus status);
	public double calculateTotalCommandaValue();

}
