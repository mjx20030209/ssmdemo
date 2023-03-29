package cn.js.ccit.controller;

import cn.js.ccit.dao.UserDao;
import cn.js.ccit.pojo.User;
import cn.js.ccit.service.Userservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserController implements Userservice {
    @Resource
    private UserDao userDao;
    @Override
    public User getById(Integer id){
        return userDao.getById(id);
    }
}
