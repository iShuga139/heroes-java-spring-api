package com.shuga.heroes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shuga.heroes.entity.Sidekick;
import com.shuga.heroes.repository.SidekickRepository;

@Controller
public class SidekickController {

	@Autowired
	private SidekickRepository sidekickRepository;

	@PostMapping("/createSidekick")
	public ResponseEntity<Sidekick> postSidekick(@RequestBody Sidekick sidekick) {
		System.out.println("Guardando sidekick ....");
		Sidekick sdk = sidekickRepository.save(sidekick);
		
	    return new ResponseEntity<Sidekick>(sdk, HttpStatus.OK);
	}
	
	@GetMapping(path="/sidekicks")
	public @ResponseBody Iterable<Sidekick> getAllSidekicks() {
		return sidekickRepository.findAll();
	}

}
