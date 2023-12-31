package com.dyq.bookmgr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
@MapperScan("com.dyq.bookmgr.mapper")
public class WebServerApplication {

	public static void main(String[] args) {
		System.out.println(Arrays.asList("".split(",")));
		SpringApplication.run(WebServerApplication.class, args);
	}

}
