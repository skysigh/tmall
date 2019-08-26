package org.skysigh.tmall.shellergoods.service;

import entity.PageResult;
import org.skysigh.tmall.pojo.TbBrand;

import java.util.List;

public interface BrandService {

    List<TbBrand> findAll();

    /**
     * 品牌分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageResult<TbBrand> findPage(int pageNum, int pageSize);
    void add(TbBrand tbBrand);
    void delete(long id);
    void update(TbBrand tbBrand);
    TbBrand getTbBrand(long id);
}
