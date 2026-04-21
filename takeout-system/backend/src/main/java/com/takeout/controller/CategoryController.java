package com.takeout.controller;

import com.takeout.common.Result;
import com.takeout.entity.Category;
import com.takeout.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 分类控制器
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 根据店铺ID获取分类列表
     */
    @GetMapping("/list")
    public Result<List<Category>> list(@RequestParam Long shopId) {
        List<Category> list = categoryService.getByShopId(shopId);
        return Result.success(list);
    }
}
