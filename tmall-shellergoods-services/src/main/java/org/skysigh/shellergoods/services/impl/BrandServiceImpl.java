package org.skysigh.shellergoods.services.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.apache.dubbo.config.annotation.Service;
import org.skysigh.tmall.mapper.TbBrandMapper;
import org.skysigh.tmall.pojo.TbBrand;
import org.skysigh.tmall.shellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Override
    public PageResult<TbBrand> findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(null);
        return new PageResult<>(page.getTotal(), page.getResult());
    }

    @Override
    public void add(TbBrand tbBrand) {
        brandMapper.insert(tbBrand);
    }

    @Override
    public void delete(long id) {
        brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(TbBrand tbBrand) {
        brandMapper.updateByPrimaryKeySelective(tbBrand);
    }

    @Override
    public TbBrand getTbBrand(long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
