package com.example.demo.converter;

import com.example.demo.model.Candidato;
import com.example.demo.DTO.CandidatoDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

@Component
public class CandidatoConverter {


    public CandidatoDTO converterEntityDTO(Candidato entity) {
       return CandidatoDTO.builder()
               ._id(entity.get_id())
               .nome(entity.getNome())
               .data_nascimento(LocalDate.parse(entity.getData_nascimento()))
               .vaga(entity.getVaga())
               .build();
}


    public Candidato converterDtoToEntity(CandidatoDTO dto) {
        return Candidato.builder()
                ._id(dto.get_id())
                .nome(dto.getNome())
                .data_nascimento(dto.getData_nascimento().toString())
                .vaga(dto.getVaga())
                .build();
    }

}
