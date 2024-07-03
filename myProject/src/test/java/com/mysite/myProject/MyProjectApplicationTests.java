package com.mysite.myProject;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.myProject.Pokemon.Pokemon;
import com.mysite.myProject.Pokemon.PokemonRepository;

@SpringBootTest
class MyProjectApplicationTests {

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Test
	void contextLoads() {
		Pokemon p1 = new Pokemon();
		p1.setName("이상해씨");
		p1.setType("풀, 독");
		p1.setHeight(0.7);
		p1.setClassification("씨앗포켓몬");
		p1.setHeight(6.9);
		p1.setCharacteristic("심록");
		p1.setCreateDate(LocalDateTime.now());
		this.pokemonRepository.save(p1);
	}

}
