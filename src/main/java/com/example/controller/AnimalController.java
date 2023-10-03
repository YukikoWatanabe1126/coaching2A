package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Animal;
import com.example.service.AnimalService;

@Controller
public class AnimalController {
	private AnimalService animalService;
	
	@Autowired
	public AnimalController(AnimalService animalService) {
		this.animalService = animalService;
	}
	
	@GetMapping("/index")
	public String index(AnimalService animalService, Model model) {
		List<Animal> animals = this.animalService.index();
		model.addAttribute("animals", animals);
		return "index";
	}
}
