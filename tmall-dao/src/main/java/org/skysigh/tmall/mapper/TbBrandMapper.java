package org.skysigh.tmall.mapper;

import org.apache.ibatis.annotations.Param;
import org.skysigh.tmall.pojo.TbBrand;
import org.skysigh.tmall.pojo.TbBrandExample;

import java.util.List;

public interface TbBrandMapper {
    long countByExample(TbBrandExample example);

    int deleteByExample(TbBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);

    List<TbBrand> selectByExample(TbBrandExample example);

    TbBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);

    List<TbBrand> queryAll();
}