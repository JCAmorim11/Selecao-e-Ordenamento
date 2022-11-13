package com.example.demo.service;

import com.example.demo.converter.CandidatoConverter;
import com.example.demo.model.Candidato;
import com.example.demo.DTO.CandidatoDTO;
import com.example.demo.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CandidatoService {

    @Autowired
    CandidatoRepository repository;

    @Autowired
    CandidatoConverter convert;


    public List<Candidato> selectAll(){
        return repository.findAll();
    }

    public List<CandidatoDTO> getMainList(){
        List<Candidato> candidatos = selectAll();
        List<CandidatoDTO> dto = new ArrayList<>();
        for (Candidato candidato: candidatos) {
            dto.add(convert.converterEntityDTO(candidato));
        }
        return sortAge(dto);
    }

    public List<CandidatoDTO> sortAge(List<CandidatoDTO> candidatos) {
        return candidatos.stream().sorted(Comparator.comparing(CandidatoDTO::getData_nascimento, Comparator.nullsLast(Comparator.naturalOrder()))).collect(Collectors.toList());
    }

    public List<CandidatoDTO> getAgeRange(String fromAge, String toAge){
        List<Candidato> candidatos = selectAll();
        List<CandidatoDTO> dto = new ArrayList<>();
        for (Candidato candidato: candidatos) {
            dto.add(convert.converterEntityDTO(candidato));
        }
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate atualDate = LocalDate.parse(LocalDate.now().format(formato));
        List<CandidatoDTO> dtoSort = new ArrayList<>();
        for(CandidatoDTO candidato: dto){
            int idade = Period.between(candidato.getData_nascimento(),atualDate).getYears();
            if( idade <= Integer.parseInt(toAge) && idade >= Integer.parseInt(fromAge)){
                dtoSort.add(candidato);
            }
        }
        return dtoSort;
    }



}
