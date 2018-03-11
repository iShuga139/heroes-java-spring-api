package com.shuga.heroes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shuga.heroes.entity.Hero;
import com.shuga.heroes.repository.HeroRepository;

@Controller
public class HeroController {

	@Autowired
	private HeroRepository heroRepository;
	
	@PostMapping("/createHero")
	public ResponseEntity<Hero> postHero(@RequestBody Hero hero) {
		System.out.println("Guardando hero ....");
		Hero sdk = heroRepository.save(hero);
		
	    return new ResponseEntity<Hero>(sdk, HttpStatus.OK);
	}
	
	@GetMapping(path="/heroes")
	public @ResponseBody Iterable<Hero> getAllHeroes() {
		return heroRepository.findAll();
	}

}
