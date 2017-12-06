package com.kodilla.hibernate3.dao;

import com.kodilla.hibernate3.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
//@Transactional
public interface ItemDao extends CrudRepository <Item, Integer> {
}
