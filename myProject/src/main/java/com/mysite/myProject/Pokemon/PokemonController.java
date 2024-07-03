package com.mysite.myProject.Pokemon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PokemonController {

	@GetMapping("/pokemon/list")
	@ResponseBody
	public String list() {
		return "pokemon list";
	}
}
