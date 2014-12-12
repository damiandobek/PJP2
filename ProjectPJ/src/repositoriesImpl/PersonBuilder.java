package repositoriesImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Person;

public class PersonBuilder implements IEntityBuilder<Person> {

	@Override
	public Person build(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setFirstName(rs.getString("name"));
		person.setSurName(rs.getString("surname"));
		person.setEmail(rs.getString("email"));
		person.setId(rs.getInt("id"));
		return person;
	}

}
