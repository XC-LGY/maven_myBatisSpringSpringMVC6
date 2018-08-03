package com.bf.mybatis.springboot;

import java.util.List;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bf.mybatis.springboot.mapper.CountryMapper;
import com.bf.mybatis.springboot.model.Country;

/**
 * Spring Boot 启动类
 * @author Administrator
 */
@SpringBootApplication
@MapperScan(value = {"com.bf.mybatis.springboot.mapper", "tk.mybatis.simple.mapper"},nameGenerator = MapperNameGenerator.class)
public class Application implements CommandLineRunner{
	@Autowired
	private CountryMapper countryMapper;
	
	@Override
	public void run(String... arg0) throws Exception {
		List<Country> countryList = countryMapper.selectAll();
		if(countryList.size() > 0) {
			System.err.println("------------------------------------>" + countryList.get(0).getCountryname());
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
