package com.example.testedti.service;


import org.springframework.stereotype.Service;

import com.example.testedti.dto.PetshopRequestDTO;
import com.example.testedti.dto.PetshopResponseDTO;
import com.example.testedti.model.Petshop;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class PetshopService {

    public PetshopResponseDTO calcularMelhorPetshop(PetshopRequestDTO request) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(request.getData(), formatter);
        boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;

        List<Petshop> petshops = new ArrayList<>();

        petshops.add(new Petshop("Meu Canino Feliz", 2.0,
                fimDeSemana ? 24.0 : 20.0,
                fimDeSemana ? 48.0 : 40.0));

        petshops.add(new Petshop("Vai Rex", 1.7,
                fimDeSemana ? 20.0 : 15.0,
                fimDeSemana ? 55.0 : 50.0));

        petshops.add(new Petshop("ChowChawgas", 0.8,
                30.0, 45.0));

        for (Petshop p : petshops) {
            double total = request.getCaesPequenos() * p.getPrecoPequeno() + request.getCaesGrandes() * p.getPrecoGrande();
            p.setPrecoTotal(total);
        }

        petshops.sort(Comparator.comparing(Petshop::getPrecoTotal).thenComparing(Petshop::getDistancia));
        Petshop melhor = petshops.get(0);

        return new PetshopResponseDTO(melhor.getNome(), melhor.getPrecoTotal());
    }
}
