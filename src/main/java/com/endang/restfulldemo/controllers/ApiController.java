package com.endang.restfulldemo.controllers;

import com.endang.restfulldemo.models.Komputasi;
import com.endang.restfulldemo.models.Numeric;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World1";
    }

    @PostMapping("/tambah")
    public @ResponseBody Komputasi tambah(@Valid @RequestBody Komputasi obj){
        obj.setHasil(obj.getBilanganA()+obj.getBilanganB());
        return obj;
    }

    @PostMapping("/kurang")
    public @ResponseBody Komputasi kurang(@Valid @RequestBody Komputasi obj){
        obj.setHasil(obj.getBilanganA()-obj.getBilanganB());
        return obj;
    }

    @PostMapping("/kali")
    public @ResponseBody Komputasi kali(@Valid @RequestBody Komputasi obj){
        obj.setHasil(obj.getBilanganA()*obj.getBilanganB());
        return obj;
    }

    @PostMapping("/jumlah")
    public @ResponseBody List<Komputasi> jumlah(@Valid @RequestBody List<Komputasi> list){
        for (Komputasi obj : list) {
            obj.setHasil(obj.getBilanganA()+obj.getBilanganB());
        }
        return list;
    }

    @PostMapping("/total")
    public @ResponseBody
    Numeric total(@Valid @RequestBody Numeric list){
        Integer total = 0;
        for (Komputasi obj : list.getData()) {
           total+=(obj.getBilanganA()+obj.getBilanganB());
        }
        list.setHasil(total);
        Numeric result = new Numeric();
        result.setHasil(total);
        return result;
    }
}
