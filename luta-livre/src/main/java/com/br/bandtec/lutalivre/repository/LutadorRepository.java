package com.br.bandtec.lutalivre.repository;


import com.br.bandtec.lutalivre.model.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface LutadorRepository extends JpaRepository<Lutador,Integer> {

 List<Lutador> findByVivoTrue();
 List<Lutador> findByVivoFalse();


}
