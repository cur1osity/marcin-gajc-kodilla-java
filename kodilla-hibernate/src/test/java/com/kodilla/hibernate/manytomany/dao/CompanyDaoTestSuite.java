package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private Company softwareMachine;
    private Company dataMaesters;
    private Company greyMatter;

    @Before
    public void databaseSetup() {

        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        softwareMachine = new Company("Software Machine");
        dataMaesters = new Company("Data Maesters");
        greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

    }

    @Test
    public void testSaveManyToMany() {
        //Given
        //@Before

        //When
        int softwareMachineId = softwareMachine.getId();
        int dataMaestersId = dataMaesters.getId();
        int greyMatterId = greyMatter.getId();


        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);
    }

    @Test
    public void Should_retrieveOnePerson_When_retrieveEmployeeWithSpecificLastNameIsUsed() {

        //given
        //@Before

        //when
        List<Employee> employeesWithSpecificLastNames = employeeDao.retrieveEmployeeWithSpecificLastName("Smith");

        //then
        Assert.assertEquals(1, employeesWithSpecificLastNames.size());
    }

    @Test
    public void Should_retrieveOneCompany_When_retrieveCompaniesWithSpecificNamesIsUsed() {

        //given
        //@Before

        //when
        List<Company> companiesWithSpecificNames = companyDao.retrieveCompaniesWithSpecificNames("Sof%");

        //then
        Assert.assertEquals(1, companiesWithSpecificNames.size());
    }
}