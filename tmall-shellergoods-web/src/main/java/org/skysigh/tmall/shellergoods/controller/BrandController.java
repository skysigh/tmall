package org.skysigh.tmall.shellergoods.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.skysigh.tmall.pojo.TbBrand;
import org.skysigh.tmall.shellergoods.service.BrandService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
//@Component("brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("/queryAll")
    public List<TbBrand> queryAll() {
        System.out.println(brandService);
        return brandService.findAll();

    }
}
