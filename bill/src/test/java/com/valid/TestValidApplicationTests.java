package com.valid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.valid.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql("/Data.sql")
@AutoConfigureTestDatabase
class TestValidApplicationTests {

	@Autowired
	ProductService productService;
	
	@Test
	void contextLoads() {
		assertEquals(8, productService.getProduct().size());		
	}

}
