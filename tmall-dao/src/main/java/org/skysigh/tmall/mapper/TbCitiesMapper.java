package org.skysigh.tmall.mapper;

import org.apache.ibatis.annotations.Param;
import org.skysigh.tmall.pojo.TbCities;
import org.skysigh.tmall.pojo.TbCitiesExample;

import java.util.List;

public interface TbCitiesMapper {
    long countByExample(TbCitiesExample example);

    int deleteByExample(TbCitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCities record);

    int insertSelective(TbCities record);

    List<TbCities> selectByExample(TbCitiesExample example);

    TbCities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCities record, @Param("example") TbCitiesExample example);

    int updateByExample(@Param("record") TbCities record, @Param("example") TbCitiesExample example);

    int updateByPrimaryKeySelective(TbCities record);

    int updateByPrimaryKey(TbCities record);
}