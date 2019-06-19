package com.springcloud.service;

import org.springframework.data.domain.Page;

import com.springcloud.entity.Users;

/**
 * ģ�Ͳ�Ľӿڣ����ڶ����û�ģ��ķ���
 * 
 * @author ET55
 *
 */
public interface UsersService {

	/**
	 * ��֤�û��Ƿ��½�ɹ�
	 * 
	 * @param userId       �û����
	 * @param userPassword �û�����
	 * @param jdictionId   Ȩ�ޱ��
	 * @return �ɹ������û�������Ϣ��ʧ�ܷ���null
	 */
	public abstract Users login(Integer userId, String userPassword, Integer jdictionId);

	/**
	 * ����µ��û���Ϣ
	 * 
	 * @param users �µ��û���Ϣ
	 * @return ��ӳɹ�����com.springcloud.entity.Users���͵�ʵ�������򷵻�null
	 */
	public abstract Users insert(Users users);

	/**
	 * ��ѯ�����������û���Ϣ
	 * 
	 * @param user       ��ѯ����
	 * @param pageNumber ��ѯҳ��
	 * @return �ɹ�����org.springframework.data.domain.Page���͵�ʵ��
	 */
	public abstract Page<Users> select(Users user, Integer pageNumber);

	/**
	 * �޸�ָ������û���״̬
	 * 
	 * @param userId     �û����
	 * @param userStatus �û�״̬
	 * @return �޸ĳɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer updateStatus(Integer userId, Integer userStatus);

	/**
	 * ��ѯָ����ŵ��û���Ϣ
	 * 
	 * @param userId �û����
	 * @return �ɹ�����com.springcloud.entity.Users���͵�ʵ�������򷵻�null
	 */
	public abstract Users selectById(Integer userId);

	/**
	 * �޸�ָ������û�����Ϣ
	 * 
	 * @param users �޸ĵ��û���Ϣ
	 * @return �޸ĳɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer update(Users users);

	/**
	 * ���ݲ����޸�ָ������û���ͷ���������ǳ�
	 * 
	 * @param users �޸ĵ��û���Ϣ
	 * @return �޸ĳɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer updateMessage(Users users);

	/**
	 * �ж�ָ���û������ֵĴ���
	 * 
	 * @param userName ��Ҫ�жϳ��ִ������û���
	 * @return ����java.lang.Long���͵�ʵ��
	 */
	public abstract Long countByUserName(String userName);
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	public abstract Users userLogin(String userName, String userPassword, Integer userStatus, Integer jdictionId);
}
