package com.bf.mybatis.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bf.mybatis.springboot.service.UserService;

import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysUser;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public SysUser findById(Long id) {
		return userMapper.selectById(id);
	}

}
