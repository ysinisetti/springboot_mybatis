package com.myBatis.springbootmyBatis;

import com.myBatis.springbootmyBatis.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Users.class)
@MapperScan("com.myBatis.springbootmyBatis.mapper")
@SpringBootApplication
public class SpringbootMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMyBatisApplication.class, args);
	}

}
