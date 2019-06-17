package com.springcloud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * USERS表对应的实体类：用于封装USERS表中的一行用户信息
 * 
 * @author ET55
 *
 */
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5834649765531637824L;
	/**
	 * 
	 */

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	/*
	 * 用户编号
	 */
	@Column(name = "user_name")
	private String userName;
	/*
	 * 用户姓名
	 */
	@Column(name = "user_number")
	private String userNumber;

	@Column(name = "user_password")
	private String userPassword;

	@Column(name = "user_sex")
	private Integer userSex;

	@Column(name = "user_phone")
	private String userPhone;

	@Column(name = "user_site")
	private String userSite;

	@Column(name = "user_birthday")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userBirthday;

	@Column(name = "user_email")
	private String userEmail;

	@Column(name = "user_photo")
	private String userPhoto;

	@Column(name = "jdiction_id")
	private Integer jdictionId;

	@Column(name = "user_status")
	private Integer userStatus;

	/**
	 * user_id user_name user_number user_password user_sex user_phone user_site
	 * user_birthday user_email user_photo jdiction_id user_status
	 * 
	 */

}
