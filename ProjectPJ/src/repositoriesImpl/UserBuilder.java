package repositoriesImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.User;



public class UserBuilder implements IEntityBuilder<User> {

	
	public User build(ResultSet rs) throws SQLException {

		User result = new User();
		result.setUserRank(rs.getString("rank"));
		result.setLogin(rs.getString("login"));
		result.setPassword(rs.getString("password"));
		result.setAddressEmail(rs.getString("email"));
		return result;
	}

}
