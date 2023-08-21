package br.com.devxlabs.ravin.repositories.interfaces;

import java.util.List;

public interface RepositoryInterface<T> {
	
	public void save(T entidade);
	public  List<T> listAll();
	public void removeById (int id);
	public T findById(int id);
	public int count();
	public int insert(T entity);
	public void update(T entity);

}
