package com.santosh.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

public class EmployeeDAODBImpl implements EmployeeDAO {

	private DataSource dataSource;
		
	public EmployeeDAODBImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void setSal(int empno, double amt) {
		
		Connection con = null;
		
		try {
			
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("update emp set sal = ? where empno = ?");
			ps.setDouble(1, amt);
			ps.setInt(2, empno);
			
			int count = ps.executeUpdate();
			
			if(count == 1 || count == Statement.SUCCESS_NO_INFO) 
				return;
			
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			try {
				con.close();
			} catch(Exception e) {				
			}
		}
	}

	@Override
	public double getSal(int empno) {
		
		Connection con = null;
		
		try {
			
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("select sal from emp where empno=?");
			ps.setInt(1, empno);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return rs.getDouble(1);
			}
			
			throw new RuntimeException("Employee Not Found");
			
		} catch(RuntimeException e) {
			throw e;
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			try {
				con.close();
			} catch(Exception e) {				
			}
		}
	}

}
