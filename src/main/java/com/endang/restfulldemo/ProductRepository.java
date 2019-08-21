package com.endang.restfulldemo;

import com.endang.restfulldemo.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {

    @Query("select c from Product c where c.name like concat(:name,'%')")
    List<Product> findByName(@Param("name") String name);
}
