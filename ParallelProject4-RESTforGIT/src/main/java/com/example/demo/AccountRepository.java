package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public class AccountRepository {

	@Autowired
	JdbcTemplate jdbcTemp;

	public List<Account> getAll() {
		return jdbcTemp.query("select * from accs", new AccMap());

	}

	public void addAcc(Account acc) {
		jdbcTemp.update("insert into accs (name,pass,loc) value (?,?,?)",
				new Object[] { acc.getName(), acc.getPass(), acc.getLoc() });
	}
	
	public Object checkBal(int accno) {
		return jdbcTemp.queryForObject("select * from accs where AccNo = ?", new Object[] { accno}, new AccMap());
	}
	
	public void deposit(Account theAccount) {
		 jdbcTemp.update("update accs set bal = bal + ? where accno = ?", new Object[] {theAccount.getBal(), theAccount.getAccNo()});
	}

	public void withdraw(Account theAccount) {
		jdbcTemp.update("update accs set bal = bal - ? where accno = ?", new Object[] {theAccount.getBal(), theAccount.getAccNo()});
	}
	
	public void tranfor(int faccno, int taccno) {
		jdbcTemp.update("update accs set bal = bal - ? where accno = ?", new Object[] { faccno }, new AccMap());
		jdbcTemp.update("update accs set bal = bal + ? where accno = ?", new Object[] { taccno }, new AccMap());
	}

	class AccMap implements RowMapper<Account> {

		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account account = new Account();
			account.setAccNo(rs.getInt("AccNo"));
			account.setName(rs.getString("Name"));
			account.setPass(rs.getInt("pass"));
			account.setLoc(rs.getString("loc"));
			account.setBal(rs.getInt("bal"));
			return account;
		}

	}


	

	



	

}
