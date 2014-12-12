package repositories;

import domain.*;

public interface IRepositoryCatalog {

	public IRepository<Person> getPersones();
	public IRepository<Role> getRoles();
	public IUserRepository getUsers();
}
