package com.kodewala.main.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kodewala.main.entity.User;

@Repository
public class UserDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean insertUser(User _user)
	{
		boolean status = false;
		String QUERY = " INSERT INTO USERS(name, email, gender, city) VALUES(?,?,?,?)";

		int recordCount = jdbcTemplate.update(QUERY, _user.getName(), _user.getEmail(), _user.getGender(),
				_user.getCity());

		if (recordCount > 0)
		{
			status = true;
		}
		return status;
	}

	public User getUserByemail(String _email)
	{
		String query = "select * from users where email=?";
		return jdbcTemplate.queryForObject(query, new UserRowMapper(), _email);

	}

	public static final class UserRowMapper implements RowMapper<User>
	{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			User user = new User();
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setGender(rs.getString("gender"));
			user.setCity(rs.getString("city"));
			return user;
		}

	}
}
