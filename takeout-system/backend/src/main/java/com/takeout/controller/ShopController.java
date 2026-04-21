package com.takeout.controller;

import com.takeout.common.Result;
import com.takeout.entity.Shop;
import com.takeout.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 店铺控制器
 */
@RestController
@RequestMapping("/api/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    /**
     * 获取店铺列表
     */
    @GetMapping("/list")
    public Result<List<Shop>> list() {
        List<Shop> list = shopService.getList();
        return Result.success(list);
    }

    /**
     * 获取店铺详情
     */
    @GetMapping("/detail/{id}")
    public Result<Shop> detail(@PathVariable Long id) {
        Shop shop = shopService.getDetail(id);
        return Result.success(shop);
    }
}
