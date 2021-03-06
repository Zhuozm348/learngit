package com.zhuozm.bookshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zhuozm.bookshop.dao")
public class BookshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookshopApplication.class, args);
	}

}
