package com.cts.hrapp.daos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.cts.hrapp.exceptions.OperationFailedException;
import com.cts.hrapp.models.Employee;

public class EmployeeDaoIOStreamImpl implements EmployeeDao {
	
	final String fileName = "./emps.data";
	
	private List<Employee> emps;
	private int nextId;

	@SuppressWarnings("unchecked")
	public EmployeeDaoIOStreamImpl() throws OperationFailedException {
		super();
		
		if(Files.exists(Paths.get(fileName))) {
			try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream(fileName))){
				emps = (List<Employee>) oin.readObject();
				this.nextId = emps.stream().mapToInt(Employee::getEmpId).max().orElse(100) + 1;
			}catch(IOException | ClassNotFoundException exp) {
				//log the exp
				throw new OperationFailedException("Unablke to open the data file \n"+exp.getMessage());
			}
		}else {
			this.emps = new ArrayList<>();
			this.nextId=101;
		}
	}
	
	private void saveData() throws OperationFailedException {
		try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(fileName))){
			oout.writeObject(emps);
		}catch(IOException exp) {
			//log the exp
			throw new OperationFailedException("Unablke to write to the data file \n"+exp.getMessage());
		}
	}

	@Override
	public Employee add(Employee emp) throws OperationFailedException {
		emp.setEmpId(nextId);
		this.nextId++;
		this.emps.add(emp);
		saveData();
		return emp;
	}

	@Override
	public void deleteById(int empId) throws OperationFailedException {
		Employee emp = this.emps.stream().filter(e -> e.getEmpId()==empId).findFirst().orElse(null);
		if(emp!=null){
			this.emps.remove(emp);
			saveData();
		}
	}

	@Override
	public Employee getById(int empId) throws OperationFailedException {
		return this.emps.stream().filter(e -> e.getEmpId()==empId).findFirst().orElse(null);
	}

	@Override
	public List<Employee> getAll() throws OperationFailedException {
		return this.emps;
	}

}
