package com.takeout.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 店铺实体类
 */
@Data
@TableName("shop")
public class Shop implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 商家ID
     */
    private Long merchantId;

    /**
     * 店铺名称
     */
    private String name;

    /**
     * 店铺图片
     */
    private String image;

    /**
     * 公告
     */
    private String announcement;

    /**
     * 评分
     */
    private BigDecimal rating;

    /**
     * 月售数量
     */
    private Integer sales;

    /**
     * 起送价
     */
    private BigDecimal minPrice;

    /**
     * 配送费
     */
    private BigDecimal deliveryFee;

    /**
     * 营业状态：0-休息中，1-营业中
     */
    private Integer status;

    /**
     * 审核状态：0-待审核，1-已通过，2-已拒绝
     */
    private Integer auditStatus;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Integer deleted;
}
