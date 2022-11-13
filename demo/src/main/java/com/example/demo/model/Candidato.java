package com.example.demo.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name="tblCANDIDATOS")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="_id")
    private String _id;

    @Column(name="nome")
    private String nome;

    @Column(name="vaga")
    private String vaga;

    @Column(name="data_nascimento")
    private String data_nascimento;

    //   @Column
  //  @ManyToOne
//    private Vaga vagaCandidato;
}
