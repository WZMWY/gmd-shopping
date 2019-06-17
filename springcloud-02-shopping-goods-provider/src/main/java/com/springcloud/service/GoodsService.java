package com.springcloud.service;

import java.util.List;

import com.springcloud.entity.Goods;

/**
 * 商品模型层的接口：用于定义商品模块的方法
 * 
 * @author ET55
 *
 */
public interface GoodsService {

	/**
	 * 添加新的商品信息
	 * 
	 * @param goods 新商品信息
	 * @return 成功返回大于0的整数，否则返回0
	 */
	public abstract Integer insert(Goods goods);

	/**
	 * 查询销量前十的商品信息
	 * 
	 * @return 成功返回java.util.List类型的实例，否则返回null
	 */
	public abstract List<Goods> selectGroup();
}
