package com.product.api;

import com.product.api.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ProductServiceApplication {



	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
