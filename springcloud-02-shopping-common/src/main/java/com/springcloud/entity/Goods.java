package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS���Ӧ��ʵ����
 * 
 * @author ET55
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

	/**
	 * ��Ʒ���
	 */
	private Integer goodId;

	/**
	 * ��Ʒ����
	 */
	private String goodName;

	/**
	 * ��Ʒ�۸�
	 */
	private Double goodPrice;

	/**
	 * ��Ʒ�ۿۼ�
	 */
	private Double goodDiscount;

	/**
	 * ��Ʒ״̬
	 */
	private Integer goodStatus;

	/**
	 * ��Ʒ����
	 */
	private Integer goodCount;

	/**
	 * �Ƿ���Ʒ��0Ϊ��Ʒ��1Ϊ����Ʒ��
	 */
	private Integer goodIsNew;

	/**
	 * �Ƿ�������0Ϊ������1Ϊ��������
	 */
	private Integer goodIsHot;

	/**
	 * ��Ʒ����0Ϊ�1Ϊһ�㣬2Ϊ������
	 */
	private Integer goodLevel;

	/**
	 * ��Ʒ���
	 */
	private String goodBrief;

	/**
	 * ��Ʒ����
	 */
	private String goodDetail;

	/**
	 * ��ƷͼƬ
	 */
	private String goodPhoto;

	/**
	 * ���2���
	 */
	private Integer class2Id;

	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPriceMin;

	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPriceMax;

	/**
	 * ��ѯ������һ�������
	 */
	private Integer class1Id;

	/**
	 * ��Ʒ���������ڱ���ͳ�Ʒ���Ľ��
	 */
	private Integer goodsSum;

}