package com.imooc.sell.dataobject.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryMapperTest {
    @Autowired
    private ProductCategoryMapper mapper;
    @Test
    public void insertByMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("categoryName", "william最不爱");
        map.put("category_type", 101);
        int result = mapper.insertByMap(map);
        Assert.assertEquals(1, result);
    }
}