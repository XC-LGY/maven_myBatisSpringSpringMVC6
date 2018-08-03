package com.bf.mybatis.springboot.service;

import java.util.List;

import com.bf.mybatis.springboot.model.Country;

public interface CountryService {
	List<Country> selectAll();
}
