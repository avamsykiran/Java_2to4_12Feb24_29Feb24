package com.cts.hrapp.daos;

import java.util.List;

import com.cts.hrapp.exceptions.OperationFailedException;
import com.cts.hrapp.models.Employee;

public interface EmployeeDao {
	Employee add(Employee emp) throws OperationFailedException;
	void deleteById(int empId) throws OperationFailedException;
	Employee getById(int empId) throws OperationFailedException;
	List<Employee> getAll() throws OperationFailedException;
}
