package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NamedNativeQuery;

@NamedNativeQuery(
        name = "Company.retrieveCompaniesWithSpecificNames",
        query = "SELECT * FROM companies WHERE company_name LIKE :NAME",
        resultClass = Company.class
)
@Setter
@NoArgsConstructor
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Employee> getEmployees() {
        return employees;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

}