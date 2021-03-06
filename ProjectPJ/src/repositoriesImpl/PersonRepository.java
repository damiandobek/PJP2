package repositoriesImpl;

import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;




import unitofwork.IUnitOfWork;
import domain.Person;
//import repositories.IRepository;

public class PersonRepository extends Repository<Person>{
	
	protected PersonRepository(Connection connection,
			IEntityBuilder<Person> builder, IUnitOfWork uow) {
		super(connection, builder);
	}

	protected void setUpUpdateQuery(Person entity) throws SQLException {
		update.setString(1, entity.getFirstName());
		update.setString(2, entity.getSurName());
		update.setString(3, entity.getEmail());
		update.setInt(4, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Person entity) throws SQLException {
		insert.setString(1, entity.getFirstName());
		insert.setString(2, entity.getSurName());
		insert.setString(3, entity.getEmail());
	}

	@Override
	protected String getTableName() {
		return "person";
	}

	@Override
	protected String getUpdateQuery() {
		return "update person set (name,surname,pesel)=(?,?,?)"
				+ "where id=?";
	}
	
	@Override	
	protected String getInsertQuery() {
		return "insert into person(name,surname,pesel) values(?,?,?)";
	}

}

