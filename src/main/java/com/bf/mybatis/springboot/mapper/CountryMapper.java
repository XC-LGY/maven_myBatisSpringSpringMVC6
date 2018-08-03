package com.bf.mybatis.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bf.mybatis.springboot.model.Country;

@Mapper
public interface CountryMapper {
	/**
	 * 查询全部数据
	 * 
	 * 这个接口和前几章中的接口最大的区别是，这里使用了＠Mapper 注解， 
	 * 增加这个注解之后，Spring启动时会自动扫描该接口，这样就可以在需要使用时直接注入Mapper 。
	 */
	List<Country> selectAll();
}
