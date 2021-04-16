package com.br.bandtec.lutalivre.repository;


import com.br.bandtec.lutalivre.model.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface LutadorRepository extends JpaRepository<Lutador,Integer> {

 List<Lutador> findByVivoTrue();
 List<Lutador> findByVivoFalse();

 @Query("select forca_golpe from lutador orderBy desc ")
 List<Lutador> findByForcaGolpe();

}
