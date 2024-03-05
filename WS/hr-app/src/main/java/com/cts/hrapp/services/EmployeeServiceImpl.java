package com.cts.hrapp.services;

import java.util.ArrayList;
import java.util.List;

import com.cts.hrapp.daos.EmployeeDAOJdbcImpl;
import com.cts.hrapp.daos.EmployeeDao;
import com.cts.hrapp.exceptions.InvalidEmployeeDetailsException;
import com.cts.hrapp.exceptions.InvalidEmployeeIdException;
import com.cts.hrapp.exceptions.OperationFailedException;
import com.cts.hrapp.models.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao empDao;
	
	public EmployeeServiceImpl() throws OperationFailedException {
		this.empDao = new EmployeeDAOJdbcImpl(); //EmployeeDaoIOStreamImpl();
	}

	private boolean isValidEmpId(int empId) {
		return empId>0;
	}
	
	private boolean isValidName(String name) {
		return name!=null && !name.isBlank() && !name.isEmpty() && name.length()>=5 && name.length()<=25;
	}
	
	private boolean isValidMobile(String mobile) {
		return mobile.matches("[1-9][0-9]{9}");
	}
	
	private boolean isValidBasic(double basic) {
		return basic>=15000;
	}
	
	private List<String> validateEmp(Employee emp) {
		
		List<String> errors = new ArrayList<>();
		
		if(emp!=null) {
			
			/*
			 * if(!isValidEmpId(emp.getEmpId())) {
			 * errors.add("Employee Id is not expected to be negative or zero"); }
			 */
			
			if(!isValidName(emp.getName())) {
				errors.add("Employee Name can not be blank and must be 5 to 25 letters in length");
			}
			
			if(!isValidMobile(emp.getMobile())){
				errors.add("Mobile Number must be a ten digit number");
			}
			
			if(!isValidBasic(emp.getBasic())) {
				errors.add("Basic must be a minimum of 150000");
			}
			
		}else {
			errors.add("No data received");
		}
		
		return errors.isEmpty() ? null : errors;
	}
	
	@Override
	public Employee add(Employee emp) throws OperationFailedException, InvalidEmployeeDetailsException {
		List<String> errors = validateEmp(emp);
		
		if(errors!=null) {
			throw new InvalidEmployeeDetailsException(errors.stream().reduce("", (s1,s2) -> s1+"; "+s2));
		}
		
		return empDao.add(emp);
	}

	@Override
	public void deleteById(int empId) throws OperationFailedException, InvalidEmployeeIdException {
		if(!isValidEmpId(empId)) {
			throw new InvalidEmployeeIdException("Employee is is a non zero positive number");
		}
		this.empDao.deleteById(empId);
	}

	@Override
	public Employee getById(int empId) throws OperationFailedException {
		return empDao.getById(empId);
	}

	@Override
	public List<Employee> getAll() throws OperationFailedException {
		return this.empDao.getAll();
	}

}
