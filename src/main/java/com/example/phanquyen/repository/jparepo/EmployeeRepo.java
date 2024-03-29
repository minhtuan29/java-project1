package com.example.phanquyen.repository.jparepo;

import com.example.phanquyen.model.EmployeeSearchInputModel;
import com.example.phanquyen.repository.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
