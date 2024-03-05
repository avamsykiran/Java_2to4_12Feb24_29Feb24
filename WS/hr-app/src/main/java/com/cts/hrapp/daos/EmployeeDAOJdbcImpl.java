package com.cts.hrapp.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.hrapp.exceptions.OperationFailedException;
import com.cts.hrapp.models.Employee;

/**
  create database hrdb;
  
  use hrdb;
  
  create table emps(
   id int primary key auto_increment,
   nm varchar(30) not null,
   mb char(10) not null,
   sal double not null
 );
 */

public class EmployeeDAOJdbcImpl implements EmployeeDao  {
	
	public static final String CON_STR = "jdbc:mysql://localhost:3306/hrdb";
	public static final String USER_ID = "root";
	public static final String PWD = "root";
	
	public static final String GET_ALL_QRY = "SELECT id,nm,mb,sal FROM emps";
	public static final String GET_BY_ID_QRY = "SELECT id,nm,mb,sal FROM emps WHERE id=?";
	public static final String DEL_BY_ID_QRY = "DELETE FROM emps WHERE id=?";
	public static final String INS_QRY = "INSERT INTO emps(nm,mb,sal) VALUES(?,?,?)";

	private Connection getCon() throws SQLException {
		return DriverManager.getConnection(CON_STR, USER_ID, PWD);
	}
	
	@Override
	public Employee add(Employee emp) throws OperationFailedException {
		if(emp!=null) {
			try(PreparedStatement ps = getCon().prepareStatement(INS_QRY)){
				
				ps.setString(1, emp.getName());
				ps.setString(2, emp.getMobile());
				ps.setDouble(3, emp.getBasic());
				ps.executeUpdate();
				
			}catch(SQLException exp) {
				//log the exp 
				throw new OperationFailedException("Unable to add the record! \n " + exp.getMessage());
			}
		}
		return emp;
	}

	@Override
	public void deleteById(int empId) throws OperationFailedException {
		try(PreparedStatement ps = getCon().prepareStatement(DEL_BY_ID_QRY)){
			
			ps.setInt(1, empId);
			ps.executeUpdate();
			
		}catch(SQLException exp) {
			//log the exp 
			throw new OperationFailedException("Unable to delete the record! \n " + exp.getMessage());
		}
	}

	@Override
	public Employee getById(int empId) throws OperationFailedException {
		Employee emp = null;
		
		try(PreparedStatement ps = getCon().prepareStatement(GET_BY_ID_QRY)){
			
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setMobile(rs.getString(3));
				emp.setBasic(rs.getDouble(4));
			}
			
		}catch(SQLException exp) {
			//log the exp 
			throw new OperationFailedException("Unable to fetech the record! \n " + exp.getMessage());
		}
		
		return emp;
	}

	@Override
	public List<Employee> getAll() throws OperationFailedException {
		List<Employee> emps = new ArrayList<>();
		
		try(PreparedStatement ps = getCon().prepareStatement(GET_ALL_QRY)){
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setMobile(rs.getString(3));
				emp.setBasic(rs.getDouble(4));
				emps.add(emp);
			}
			
		}catch(SQLException exp) {
			//log the exp 
			throw new OperationFailedException("Unable to fetech records! \n " + exp.getMessage());
		}
		
		return emps;
	}

}
