package com.endang.restfulldemo;

import com.endang.restfulldemo.controllers.ProductController;
import com.endang.restfulldemo.models.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestfulldemoApplicationTests {
	@Autowired
	ProductController productController;

	@Test
	public void insert() {
		Product product = new Product();
		product.setName("Bakwan");
		product.setPrice(new BigDecimal(1000));
		product.setStock(200);
		Map<String, Object> insert = productController.insert(product);
		assertEquals((String)insert.get("message"),"Data Berhasil");
	}

}
