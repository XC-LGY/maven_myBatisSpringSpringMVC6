package com.bf.mybatis.springboot.service;

import tk.mybatis.simple.model.SysUser;

public interface UserService {
	/**
	 * 通过id 查询用户
	 */
	SysUser findById(Long id);
}
