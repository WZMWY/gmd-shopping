package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS2���Ӧ��ʵ���࣬���ڱ������һ�ж��������Ϣ
 * 
 * @author ET55
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class2 {
	/**
	 * ���������
	 */
	private Integer class2Id;

	/**
	 * �����������
	 */
	private String class2Name;

	/**
	 * һ�������
	 */
	private Integer class1Id;

	private String remake;

}