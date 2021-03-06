package com.atguigu.atcrowdfunding.service;

import com.atguigu.atcrowdfunding.bean.Permission;
import com.atguigu.atcrowdfunding.bean.User;

import java.util.List;

public interface PermissionService {

	// 获取用户权限信息
	List<Permission> queryPermissionsByUser(User dbUser);

	// 获取当前角色已经分配的许可信息
	List<Integer> queryPermissionidsByRoleid(Integer roleid);

	//删除功能
	void deletePermission(Permission permission);

	//修改功能
	void updatePermission(Permission permission);

	//根据id查询节点
	Permission queryById(Integer id);

	//新增功能
	void insertPermission(Permission permission);

	// 查询所有的许可数据
	List<Permission> queryAll();

	//获取子节点
	List<Permission> queryChildPermissions(Integer pid);

//	//获取顶级节点
//	Permission queryRootPermission();
}
