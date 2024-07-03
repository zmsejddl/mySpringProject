package com.mysite.myProject.Pokemon;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PokemonController {

	private final PokemonRepository pokemonRepository;
	
	@GetMapping("/pokemon/list")
	public String list(Model model) {
		List<Pokemon> pokemonList = this.pokemonRepository.findAll();
		model.addAttribute("pokemonList", pokemonList);
		return "pokemon_list";
	}
}
