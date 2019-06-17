package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS表对应的实体类
 * 
 * @author ET55
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

	/**
	 * 商品编号
	 */
	private Integer goodId;

	/**
	 * 商品名称
	 */
	private String goodName;

	/**
	 * 商品价格
	 */
	private Double goodPrice;

	/**
	 * 商品折扣价
	 */
	private Double goodDiscount;

	/**
	 * 商品状态
	 */
	private Integer goodStatus;

	/**
	 * 商品数量
	 */
	private Integer goodCount;

	/**
	 * 是否新品（0为新品，1为非新品）
	 */
	private Integer goodIsNew;

	/**
	 * 是否热卖（0为热卖，1为非热卖）
	 */
	private Integer goodIsHot;

	/**
	 * 商品级别（0为差，1为一般，2为优良）
	 */
	private Integer goodLevel;

	/**
	 * 商品简介
	 */
	private String goodBrief;

	/**
	 * 商品详情
	 */
	private String goodDetail;

	/**
	 * 商品图片
	 */
	private String goodPhoto;

	/**
	 * 类别2编号
	 */
	private Integer class2Id;

	/**
	 * 查询条件：商品价格下限
	 */
	private Double goodsPriceMin;

	/**
	 * 查询条件：商品价格上限
	 */
	private Double goodsPriceMax;

	/**
	 * 查询条件：一级类别编号
	 */
	private Integer class1Id;

	/**
	 * 商品销量：用于保存统计分组的结果
	 */
	private Integer goodsSum;

}