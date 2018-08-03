package com.bf.mybatis.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bf.mybatis.springboot.mapper.CountryMapper;
import com.bf.mybatis.springboot.model.Country;
import com.bf.mybatis.springboot.service.CountryService;

@Service("countryService")
public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryMapper countryMapper;
	
	@Override
	public List<Country> selectAll() {
		return countryMapper.selectAll();
	}

}
