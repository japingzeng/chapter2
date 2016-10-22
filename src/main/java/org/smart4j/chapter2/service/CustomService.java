package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by japing on 16-10-22.
 */
public class CustomService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomService.class);
    public List<Customer> getCustomerList(String keyword) {
        return null;
    }

    public Customer getCustomer(long id) {
        return null;
    }

    public boolean createCutomer(Map<String, Object> filedMap) {
        return DatabaseHelper.insertEntity(Customer.class, filedMap);
    }

    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public boolean updateCustomer(long id, Map<String, Object> filedMap) {

        return DatabaseHelper.updateEntity(Customer.class, id, filedMap);
    }

    public boolean deleteCustomer(long id) {

        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
