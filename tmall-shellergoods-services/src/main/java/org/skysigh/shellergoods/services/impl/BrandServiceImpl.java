package org.skysigh.shellergoods.services.impl;

import org.apache.dubbo.config.annotation.Service;
import org.skysigh.tmall.mapper.TbBrandMapper;
import org.skysigh.tmall.pojo.TbBrand;
import org.skysigh.tmall.shellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper brandMapper;

    @Override
    public List<TbBrand> findAll() {
        List<TbBrand> tbBrands = brandMapper.queryAll();
        System.out.println(tbBrands.size());
        return tbBrands;
    }
}
