package cn.yx.ssm.service;

import java.util.List;

import cn.yx.ssm.po.ActiveUser;
import cn.yx.ssm.po.SysPermission;
import cn.yx.ssm.po.SysUser;

/**
 * 
 * <p>Title: SysService</p>
 * <p>Description: 认证授权服务接口</p>
 * <p>yx</p> 
 * @author	yx
 * @date	2015-3-23上午11:29:48
 * @version 1.0
 */
public interface SysService {
	
	//根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
	public ActiveUser authenticat(String userCode,String password) throws Exception;
	
	//根据用户账号查询用户信息
	public SysUser findSysUserByUserCode(String userCode)throws Exception;
	
	//根据用户id查询权限范围的菜单
	public List<SysPermission> findMenuListByUserId(String userid) throws Exception;
	
	//根据用户id查询权限范围的url
	public List<SysPermission> findPermissionListByUserId(String userid) throws Exception;
}
