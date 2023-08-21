package br.com.devxlabs.ravin.view.interfaces;

import java.util.List;

public interface ViewInterface<T> {

	public void showEntityMainMenu();
	public T showEntityCreateMenu();
	public int showReadIdFromEntityMenu(List<T> entities);
	public T showEntityUpdateMenu(T entity);
	public void showEntityDeleteMenu();
	public void showEntityListAllMenu(List<T> entities);
	public T showEntityFindMenu();

}
