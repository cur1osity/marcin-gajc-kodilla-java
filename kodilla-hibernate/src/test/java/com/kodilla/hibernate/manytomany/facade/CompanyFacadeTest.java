package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTest {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private CompanyDao companyDao;


    @Before
    public void databaseSetup() {

        Employee johnSmith = new Employee("John", "Smith");
        Employee johnDoe = new Employee("John", "Doe");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(johnDoe);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        johnDoe.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

    }

    @Test
    public void Should_retrieve3Company_When_searchCompanyAndFacadeIsUsed() {
        // Given
        // When
        List<Company> resultList = companyFacade.searchCompany("Ma");

        // Then
        assertEquals(3, resultList.size());
    }

    @Test
    public void Should_retrieve1Employee_When_searchEmployeeAndFacadeIsUsed() {
        //  Given
        //  When
        List<Employee> resultList = companyFacade.searchEmployee("sky");

        // Then
        assertEquals(1, resultList.size());

    }
}