package com.example.demo.DTO;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CandidatoDTO {

    private String _id;

    private String nome;

    private String vaga;

    private LocalDate data_nascimento;
}
