package com.product.api;

import com.product.api.entity.Usuario;
import com.product.api.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class ProductServiceApplicationTests {

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@Autowired
	private UsuarioRepository repository;

	@Test
	void contextLoads() {

		Usuario usuario = new Usuario();
		usuario.setUsername("user");
		usuario.setPassword(bcrypt.encode("123"));

		System.out.println(usuario.getPassword());
//		$2a$10$7JkbHDP3K0k1SkLiYt.Pq.MENlQFurkAEFwStoZ3nYPre3wxgIio2
	}

}
