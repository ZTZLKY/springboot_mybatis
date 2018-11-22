package com.example.demo.serviceImpl;

import java.util.List;

import com.example.demo.dao.DepartmentMapper;
import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl  implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getDepts() {
        // TODO Auto-generated method stub
        List<Department> list = departmentMapper.selectByExample(null);
        return list;
    }

}
