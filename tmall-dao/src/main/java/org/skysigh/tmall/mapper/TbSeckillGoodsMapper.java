package org.skysigh.tmall.mapper;

import org.apache.ibatis.annotations.Param;
import org.skysigh.tmall.pojo.TbSeckillGoods;
import org.skysigh.tmall.pojo.TbSeckillGoodsExample;

import java.util.List;

public interface TbSeckillGoodsMapper {
    long countByExample(TbSeckillGoodsExample example);

    int deleteByExample(TbSeckillGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillGoods record);

    int insertSelective(TbSeckillGoods record);

    List<TbSeckillGoods> selectByExample(TbSeckillGoodsExample example);

    TbSeckillGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSeckillGoods record, @Param("example") TbSeckillGoodsExample example);

    int updateByExample(@Param("record") TbSeckillGoods record, @Param("example") TbSeckillGoodsExample example);

    int updateByPrimaryKeySelective(TbSeckillGoods record);

    int updateByPrimaryKey(TbSeckillGoods record);
}