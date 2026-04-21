package com.takeout.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.takeout.entity.Shop;
import com.takeout.mapper.ShopMapper;
import com.takeout.service.ShopService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 店铺服务实现类
 */
@Service
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements ShopService {

    @Override
    public List<Shop> getList() {
        LambdaQueryWrapper<Shop> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Shop::getAuditStatus, 1); // 只查询已审核通过的店铺
        wrapper.eq(Shop::getStatus, 1); // 营业中
        return list(wrapper);
    }

    @Override
    public Shop getDetail(Long id) {
        return getById(id);
    }
}
