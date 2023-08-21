package br.com.devxlabs.ravin.controllers.interfaces;

import java.util.List;

public interface ControllerInterface<T> {

	public void save(T entity) throws Exception;
	public void delete(int id);
	public T findById(int id);
	public List<T> listAll();
}
