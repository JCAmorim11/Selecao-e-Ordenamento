package com.example.demo.repository;

import com.example.demo.model.Candidato;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {




}
