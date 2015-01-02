package repositoriesImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Person;

public class PersonBuilder implements IEntityBuilder<Person> {

	@Override
	public Person build(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setUser(rs.getString("user"));
		person.setFirstName(rs.getString("name"));
		person.setSurName(rs.getString("surname"));
		person.setSex(rs.getString("sex"));
		person.setEmail(rs.getString("email"));
		person.setId(rs.getInt("id"));
		return person;
	}

}
