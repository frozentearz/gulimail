package com.atguigu.gulimall.product;


import com.atguigu.gulimall.product.entity.AttrEntity;
import com.atguigu.gulimall.product.service.AttrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTest {

    @Autowired
    AttrService attrService;

    @Test
    public void contextLoad() {
        AttrEntity e = new AttrEntity();
        e.setAttrName("test");
        e.setAttrType(1);
        e.setSearchType(1);
        attrService.save(e);
        System.out.println("save success");
    }
}