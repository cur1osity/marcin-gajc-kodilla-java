package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private String newName;

    public List<Company> searchCompany(String name) {
        newName = newName(name);
        return companyDao.retrieveCompaniesWithSpecificNames(newName);
    }

    public List<Employee> searchEmployee(String name) {
        newName = newName(name);
        return employeeDao.retrieveEmployeeWithSpecificLastName(newName);
    }

    private String newName(String name) {

        StringBuilder sb = new StringBuilder();
        sb.append("%");
        sb.append(name);
        sb.append("%");

        return sb.toString();
    }
}