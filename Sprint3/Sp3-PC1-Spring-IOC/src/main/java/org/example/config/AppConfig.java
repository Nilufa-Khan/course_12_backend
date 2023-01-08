package org.example.config;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("emp")
    public Employee getEmployee(){
        Employee emp = new Employee();
        emp.setEmpId(100);
        emp.setEmployeeName("Arijit");
        return  emp;
    }
    @Bean
    public Department getDepartment(){
        return new Department(12,"Sales");
    }
    @Bean("dept")
    public Department getDepartment1(){
        return new Department(15,"HR");
    }

}
