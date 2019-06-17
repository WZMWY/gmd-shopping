package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDER_DETAIL表对应的实体类
 * 
 * @author ET55
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail implements java.io.Serializable {

	private static final long serialVersionUID = -5653921127663115225L;

	private Integer orderDetailId;

	private Integer orderId;

	private Integer goodId;

	private String goodName;

	private Double transactionPrice;

	private Integer transactionCount;

}