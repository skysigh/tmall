package org.skysigh.tmall.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skysigh.tmall.pojo.TbBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring.xml")
public class TbBrandMapperTest {

    @Autowired
    private TbBrandMapper brandMapper;

    @Test
    public void testFindAll() {
        List<TbBrand> tbBrand = brandMapper.queryAll();
        System.out.println(tbBrand);
    }

}