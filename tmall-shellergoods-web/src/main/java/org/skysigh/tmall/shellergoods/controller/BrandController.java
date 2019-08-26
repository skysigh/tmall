package org.skysigh.tmall.shellergoods.controller;

import entity.HttpResult;
import entity.PageResult;
import org.apache.dubbo.config.annotation.Reference;
import org.skysigh.tmall.pojo.TbBrand;
import org.skysigh.tmall.shellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference
    private BrandService brandService;

    @RequestMapping("/queryAll")
    public List<TbBrand> queryAll() {
        System.out.println(brandService);
        return brandService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult<TbBrand> findPage(int pageNum, int pageSize) {
        return brandService.findPage(pageNum, pageSize);
    }

    @RequestMapping("/add")
    public HttpResult add(@RequestBody TbBrand tbBrand) {
        System.out.println(tbBrand.getName());
        try {
            brandService.add(tbBrand);
            return new HttpResult(true, "添加成功");
        } catch (Exception e) {
            return new HttpResult(false, "添加失败");
        }
    }

    @RequestMapping("/delete")
    public HttpResult delete(long id) {
        try {
            brandService.delete(id);
            return new HttpResult(true, "删除成功");
        } catch (Exception e) {
            return new HttpResult(false, "删除失败");
        }

    }

    @RequestMapping("/update")
    public HttpResult update(@RequestBody TbBrand tbBrand) {
        try {
            brandService.update(tbBrand);
            return new HttpResult(true, "更新成功");
        } catch (Exception e) {
            return new HttpResult(false, "更新失败");
        }
    }

    @RequestMapping("/get")
    public TbBrand get(long id) {
        return brandService.getTbBrand(id);
    }
}
