package com.springcloud.service;

import java.util.List;

import com.springcloud.entity.Goods;

/**
 * ��Ʒģ�Ͳ�Ľӿڣ����ڶ�����Ʒģ��ķ���
 * 
 * @author ET55
 *
 */
public interface GoodsService {

	/**
	 * ����µ���Ʒ��Ϣ
	 * 
	 * @param goods ����Ʒ��Ϣ
	 * @return �ɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer insert(Goods goods);

	/**
	 * ��ѯ����ǰʮ����Ʒ��Ϣ
	 * 
	 * @return �ɹ�����java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<Goods> selectGroup();
}
