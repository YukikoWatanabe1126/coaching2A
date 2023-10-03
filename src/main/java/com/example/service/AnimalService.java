package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Animal;
import com.example.repository.AnimalRepository;

@Service
public class AnimalService {
	private AnimalRepository animalRepository;
	
	@Autowired
	public AnimalService(AnimalRepository animalRepository) {
		this.animalRepository = animalRepository;
	}
	
	public List<Animal> index(){
		return this.animalRepository.findAll();
	}
}
