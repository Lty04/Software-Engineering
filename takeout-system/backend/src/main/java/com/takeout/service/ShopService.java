package com.takeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.takeout.entity.Shop;

import java.util.List;

/**
 * 店铺服务接口
 */
public interface ShopService extends IService<Shop> {

    /**
     * 获取店铺列表（已审核通过的）
     */
    List<Shop> getList();

    /**
     * 获取店铺详情
     */
    Shop getDetail(Long id);
}
