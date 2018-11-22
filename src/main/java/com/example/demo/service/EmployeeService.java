package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();
    public void saveEmp(Employee employee);
    public boolean checkUser(String empName);
    public Employee getEmp(Integer id);
    public void updateEmp(Employee employee);
    public void deleteEmp(Integer id) ;
    public void deleteBatch(List<Integer> ids);
}
