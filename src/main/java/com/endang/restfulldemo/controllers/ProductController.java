package com.endang.restfulldemo.controllers;

import com.endang.restfulldemo.ProductRepository;
import com.endang.restfulldemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/product/")
public class ProductController {

    @Autowired
    ProductRepository repository;

    @PostMapping("/insert")
    public @ResponseBody
    Map<String,Object> insert(@Valid @RequestBody Product obj){
        repository.save(obj);
        Map<String,Object> result = new HashMap<>();
        result.put("message","Data Berhasil Disimpan");
        result.put("data",obj);
        return result;
    }

    @PutMapping("/update")
    public @ResponseBody
    Map<String,Object> update(@Valid @RequestBody Product obj){
        repository.save(obj);
        Map<String,Object> result = new HashMap<>();
        result.put("message","Data Berhasil Diupdate");
        result.put("data",obj);
        return result;
    }

    @GetMapping("/list")
    public @ResponseBody List<Product> getAll(){
        return (List<Product>) repository.findAll();
    }

    @GetMapping("/findid/{id}")
    public @ResponseBody  Product getByID(@PathVariable Integer id){
        return (Product) repository.findById(id).get();
    }
    @PostMapping("/find")
    public @ResponseBody  List<Product> getByName(@RequestBody Map<String,Object> req){
        String name = (String) req.get("name");
        return repository.findByName(name);
    }
    @DeleteMapping("/delete")
    public @ResponseBody  Map<String,Object> delete(@RequestBody Map<String,Object> req){
        Integer id = (Integer) req.get("id");
        repository.deleteById(id);
        return Collections.singletonMap("result","Data Berhasil Dihapus");
    }

}
