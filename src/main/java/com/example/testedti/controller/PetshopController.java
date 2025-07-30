package com.example.testedti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.testedti.dto.PetshopRequestDTO;
import com.example.testedti.dto.PetshopResponseDTO;
import com.example.testedti.service.PetshopService;

@RestController
@RequestMapping("/melhor-petshop")
@CrossOrigin(origins = "*") 
public class PetshopController {

    @Autowired
    private PetshopService service;

    @PostMapping
    public PetshopResponseDTO calcular(@RequestBody PetshopRequestDTO request) {
        return service.calcularMelhorPetshop(request);
    }
}