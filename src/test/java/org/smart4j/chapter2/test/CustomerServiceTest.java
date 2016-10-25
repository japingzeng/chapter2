package org.smart4j.chapter2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.service.CustomService;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by japing on 16-10-22.
 */
public class CustomerServiceTest {
    private final CustomService customService;

    public CustomerServiceTest() {
        customService = new CustomService();
    }

    @Before
    public void init() throws Exception{
        DatabaseHelper.executeSqlFile("sql/init.sql");
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fileMap = new HashMap<String, Object>();
        fileMap.put("name", "customer100");
        fileMap.put("contact", "oh0o");
        fileMap.put("telephone", "213213");
        boolean result = customService.createCutomer(fileMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "Eric");
        boolean result = customService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 1;
        boolean result = customService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
