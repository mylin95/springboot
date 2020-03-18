package com.lmy.springboot.modules.java;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class App {
	public static void main(String[] args) {
		String pwd = new BCryptPasswordEncoder().encode("nacos.123");
		System.out.println(pwd);
	}
}


