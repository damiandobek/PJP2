package repositoriesImpl;

import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.IUserRepository;

import domain.Person;
import domain.Role;

public class DummyRepositoryCatalog implements IRepositoryCatalog {

	private DummyDb db = new DummyDb();
	
	public IRepository<Role> getRoles() {
		// TODO Auto-generated method stub
		return new DummyRoleRepository(db);
	}

	
	public IUserRepository getUsers() {
		return new DummyUserRepository(db);
	}


	public IRepository<Person> getPersones() {
		// TODO Auto-generated method stub
		return new DummyPersonRepository(db);
	}



}
