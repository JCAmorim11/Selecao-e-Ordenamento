package com.example.demo.controller;

import com.example.demo.DTO.CandidatoDTO;
import com.example.demo.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CandidatoController {


    @Autowired CandidatoService candidatoService;


    @GetMapping("/candidatos")
    public List<CandidatoDTO> fetchList(@RequestParam(required = false) Optional<String> fromAge, @RequestParam(required = false) Optional<String> toAge){
        if(fromAge.isPresent() && toAge.isPresent()){
            return candidatoService.getAgeRange(fromAge.get(), toAge.get());
        }
        return candidatoService.getMainList();
    }

}
