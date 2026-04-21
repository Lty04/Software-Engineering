package com.takeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.takeout.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

/**
 * 店铺 Mapper 接口
 */
@Mapper
public interface ShopMapper extends BaseMapper<Shop> {
}
