package com.kodilla.hibernate3.invoice;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
@Data
@NoArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;
    @Column(name="INVOICE_NUMBER")
    private String number;

    @OneToMany (
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY

    )
    private List<Item> items = new ArrayList<>();

    public Invoice(String number) {
        this.number = number;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
