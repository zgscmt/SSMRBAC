package com.atguigu.atcrowdfunding.service.impl;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.dao.UserDao;
import com.atguigu.atcrowdfunding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    //查询用户信息
    @Override
    public User query4Login(User user) {
        return userDao.query4Login(user);
    }

    //分页查询
    @Override
    public List<User> pageQueryData(Map<String, Object> map) {
        return userDao.pageQueryData(map);
    }

    //总的数据条数
    @Override
    public int pageQueryCount(Map<String, Object> map) {
        return userDao.pageQueryCount(map);
    }

    //添加用户
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    //回显修改页面
    public User queryById(Integer id) {
        return userDao.queryById(id);
    }

    //修改用户
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    //删除单个用户
    public void deleteUserById(Integer id) {
        userDao.deleteUserById(id);
    }

    //删除多个用户
    public void deleteUsers(Map<String, Object> map) {
        userDao.deleteUsers(map);
    }

    //查询用户相关联的角色
    public List<Integer> queryRoleidsByUserid(Integer id) {
        return userDao.queryRoleidsByUserid(id);
    }

    //分配角色
    public void insertUserRoles(Map<String, Object> map) {
        userDao.insertUserRoles(map);
    }

    //取消分配角色
    public void deleteUserRoles(Map<String, Object> map) {
        userDao.deleteUserRoles(map);
    }

}
