package com.cts.hrapp.services;

import java.util.List;

import com.cts.hrapp.exceptions.InvalidEmployeeDetailsException;
import com.cts.hrapp.exceptions.InvalidEmployeeIdException;
import com.cts.hrapp.exceptions.OperationFailedException;
import com.cts.hrapp.models.Employee;

public interface EmployeeService {
	Employee add(Employee emp) throws OperationFailedException,InvalidEmployeeDetailsException;
	void deleteById(int empId) throws OperationFailedException,InvalidEmployeeIdException;
	Employee getById(int empId) throws OperationFailedException;
	List<Employee> getAll() throws OperationFailedException;
}
