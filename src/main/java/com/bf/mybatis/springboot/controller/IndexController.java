package com.bf.mybatis.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bf.mybatis.springboot.model.Country;
import com.bf.mybatis.springboot.service.CountryService;
import com.bf.mybatis.springboot.service.UserService;

import tk.mybatis.simple.model.SysUser;

@RestController
public class IndexController {
	@Autowired
	private CountryService countryService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	String home() {
		System.out.println("----------------------------springboot");
		return "HelloWorld";
	}
	
	@RequestMapping("/selectAll")
	public String selectAll() {
		List<Country> countryList = countryService.selectAll();
		if(countryList.size() > 0) {
			System.err.println("------------------------------------>" + countryList.get(0).getCountryname());
		}
		return "查询所有数据，结果看控制台";
	}
	
	@RequestMapping("/findById")
	public String findById() {
		SysUser sysUser = userService.findById(1001L);
		System.err.println("---------------------------------------" + sysUser.getUserName());
		return "pom.xml中引入其它项目，查询其它项目中的数据";
	}
}
