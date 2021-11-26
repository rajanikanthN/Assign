package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class PersonRepository {
	
	@Autowired
	JdbcTemplate jdbcTemp;
	
	int getCountOfUsers() {
		return jdbcTemp.queryForObject("select count(*) from persons", Integer.class);
	}
	
	public Object getById(int id) {
		return jdbcTemp.queryForObject("select * from persons where id = ?", new Object[] {id}, new PersonMap());
	}
	
	Person getName(String name) {
		return jdbcTemp.queryForObject("select * from persons where name = ?", new Object[] { name }, new PersonMap());
	}
	
	void addPer(Person per) {
		jdbcTemp.update("insert into persons (id,name,loc,mobile) value (?,?,?,?)",
				new Object[] { per.getId(),per.getName(),per.getLoc(),per.getMobile()});
	}

	public void updatePerson(Person per) {
		jdbcTemp.update("update persons set name = ? , loc = ? , mobile = ? where id = ?", 
				new Object[] {per.getName(),per.getLoc(),per.getMobile(),per.getId()});
		
	}

	public void deletePerson(int id) {
		jdbcTemp.update("delete from persons where id = ?", new Object[] {id});
		
	}

	public List<Person> getAll() {
		return jdbcTemp.query("select * from persons", new PersonMap());
	}
	
}

@Component
class PersonMap implements RowMapper<Person>{

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setId(rs.getInt("id"));
		person.setName(rs.getString("name"));
		person.setLoc(rs.getString("loc"));
		person.setMobile(rs.getInt("mobile"));
		return person;
	}
	
}

	
