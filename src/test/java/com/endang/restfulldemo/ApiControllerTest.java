package com.endang.restfulldemo;

import com.endang.restfulldemo.controllers.ApiController;
import com.endang.restfulldemo.models.Komputasi;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiControllerTest {
    @Autowired
    ApiController apiController;

    @Test
    public void testTambah2(){
        List<Komputasi> list = new ArrayList<>();
        Komputasi komputasi = new Komputasi(6,8);
        Komputasi komputasi2 = new Komputasi(5,10);
        list.add(komputasi);
        list.add(komputasi2);

        List<Komputasi> hasil = apiController.jumlah(list);

        Assert.assertThat(hasil, Matchers.hasItems(
                new Komputasi(6,8,14),
                new Komputasi(5,10,15)
        ));

    }
}
